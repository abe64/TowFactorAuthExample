package com.sharecrest.twofactor.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sharecrest.twofactor.SCUtil;
import com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.dto.LoginSuccess;
import com.sharecrest.twofactor.service.UserService;
import com.sharecrest.twofactor.service.impl.UserDetailsImpl;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)		// @PreAuthorizeによるロールでの実行可否が指定できるようになります。
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MessageSource messages;
	
	@Autowired
	AuthenticationProvider authenticationProvider;
    
    @Autowired
    GoogleRecaptcha googleRecaptcha;
	
	@Autowired
	TblUserBhv userBhv;
	
	@Autowired
	UserService userService;
	
	/**
	 * セキュリティ初期化
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		// 認証URL
		.authorizeRequests()
			.mvcMatchers("/api/*/version/**").permitAll()			// バージョン関連のAPIは認証不要
			.mvcMatchers("/api/*/users/signup").permitAll()			// サインアップは認証不要
			.mvcMatchers("/api/*/users/provisional").permitAll()	// 仮登録は認証不要
			.mvcMatchers("/api/*/users/init_update").hasRole("SIGNUP")	// ワンタイムURL確認後のROLE_SIGNUPが付いてる場合のみ許可
			.mvcMatchers("/api/auth").hasRole("PRE_AUTH_USER")		// 2段階認証の認証コードAPIは認証後ROLE_PRE_AUTH_USERのロールが存在する場合のみ可
			.mvcMatchers("/api/**").hasRole("AUTH_USER")			// 上記以外のAPIはROLE_AUTH_USERのロールが必要。
																	// 通常認証ではログイン後にROLE_AUTH_USERが付きます。
																	// 2段階認証ではログイン後にROLE_PRE_AUTH_USERが付き、
																	// /api/authで認証コードが確認された後でROLE_PRE_AUTH_USERがROLE_AUTH_USERに切り替わります。
																	//
																	// 上記以外のユーザー権限による実行可否はAPI毎に@PreAuthorizeで指定します。
		.and()
		// 例外処理
		.exceptionHandling()
			.authenticationEntryPoint(authenticationEntryPoint())
			.accessDeniedHandler(accessDeniedHandler())
		.and()
		// ログイン (ログイン認証は AuthenticationFilter で行ってます)
		// ログアウト
		.logout()
			.logoutUrl("/api/logout")
			.invalidateHttpSession(true)		// ログアウト時セッション破棄
			.deleteCookies("JSESSIONID")		// ログアウト時クッキー破棄
			.logoutSuccessHandler(logoutSuccessHandler())
		.and()
		// フィルタ設定
		.addFilter(new AuthenticationFilter(authenticationManager(), 
				(req, res) -> loginSuccessHandler(req, res), 
				(req, res) -> loginFailedHandler(req, res),
				googleRecaptcha))
		// CSRF
		.csrf()
			//.ignoringAntMatchers("/api/login")	// login APIもCSRF対象とする。
													// GET Method はCSRFチェック対象外なのでまず何かGETメソッドを呼んで
													// cookieにXSRF-TOKENが保存されたらloginを呼ぶようにする
			.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.and()
		// ヘッダー設定
		.headers()
			.cacheControl()
				.disable()						// キャッシュコントロール無効
		;
	}
	
	/**
	 * 独自認証処理を設定
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void configureClobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.authenticationProvider(authenticationProvider);
	}
	
	/**
	 * コードで手動認証可能なようにAuthenticationManagerを公開する。
	 * AuthenticationManagerが@Autowiredでインジェクションされるようにします。
	 */
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	   
	/**
	 * ログイン成功時
	 * @param req
	 * @param res
	 */
	private void loginSuccessHandler(HttpServletRequest req, HttpServletResponse res) {
		try {
			UserDetailsImpl userDetail = SCUtil.getPrincipal();
			TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
			
			// body部分のjsonを生成する (/api/login 成功時のbodyです)
			res.setContentType("application/json;charset=utf-8");
			LoginSuccess result = new LoginSuccess();
			if (!user.getTwoFactorUse()) {
				// 2段階認証有りの場合は以下の情報は認証コード確認時に渡すようにします。
				result.setId(user.getUserId());
				result.setAccount(user.getAccount());
				result.setName(user.getName());
				result.setRoles(Arrays.asList(user.getRole().split(",")));
			}
			result.setTwoFactorUse(user.getTwoFactorUse());
			result.setTwoFactorType(user.getTwoFactorTypeAsTwoFactorType());
			ObjectMapper mapper = new ObjectMapper();
			PrintWriter out = res.getWriter();
			out.print(mapper.writeValueAsString(result));
			out.flush();
			out.close();
			
			if (user.getTwoFactorUse()) {
				// 2段階認証あり (認証コード送信)
				userService.sendAuthCode(user, user.getTwoFactorTypeAsTwoFactorType(), user.getTelno(), user.getSecret());
			} else {
				// 2段階認証なし
				user.setLoginCount(user.getLoginCount() + 1);	// ログイン回数のカウントアップ
				userBhv.update(user);
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * ログイン失敗時
	 * @param req
	 * @param res
	 */
	private void loginFailedHandler(HttpServletRequest req, HttpServletResponse res) {
		try {
			SCUtil.setErrorInfo(res, HttpStatus.UNAUTHORIZED.value(), null, null, messages.getMessage("com.sharecrest.UNAUTHORIZED", null, null));
		} catch (NoSuchMessageException | IOException | ServletException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 認証エラー時 (ログインなしでAPI呼び出し時) の処理インスタンス取得
	 */
	private AuthenticationEntryPoint authenticationEntryPoint() {
		return new ScAuthenticationEntryPoint();
	}

	/**
	 * 認可エラー時 (ロールなしでAPI呼び出し時) の処理インスタンス取得
	 */
	private AccessDeniedHandler accessDeniedHandler() {
		return new ScAccessDeniedHandler();
	}
	
	private LogoutSuccessHandler logoutSuccessHandler() {
		return new HttpStatusReturningLogoutSuccessHandler();
	}
	
	public class ScAuthenticationEntryPoint implements AuthenticationEntryPoint {
		/**
		 * 認証エラー時 (ログインなしでAPI呼び出し時)
		 */
		@Override
		public void commence(HttpServletRequest request, HttpServletResponse response,
				AuthenticationException authException) throws IOException, ServletException {
			if (response.isCommitted()) {
				return;
			}
			SCUtil.setErrorInfo(response, HttpStatus.UNAUTHORIZED.value(), null, null, messages.getMessage("com.sharecrest.UNAUTHORIZED", null, null));
		}
	}
	
	public class ScAccessDeniedHandler implements AccessDeniedHandler {
		/**
		 * 認可エラー時 (ロールなしでAPI呼び出し時)
		 */
		@Override
		public void handle(HttpServletRequest request, HttpServletResponse response,
				AccessDeniedException accessDeniedException) throws IOException, ServletException {
			if (accessDeniedException instanceof InvalidCsrfTokenException) {
				// CSRF例外
				SCUtil.setErrorInfo(response, HttpStatus.UNAUTHORIZED.value(), null, null, messages.getMessage("com.sharecrest.CSRFTOKEN", null, null));
			} else {
				SCUtil.setErrorInfo(response, HttpStatus.FORBIDDEN.value(), null, null, messages.getMessage("com.sharecrest.FORBIDDEN", null, null));
			}
		}
	}
}
