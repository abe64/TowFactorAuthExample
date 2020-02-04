package com.sharecrest.twofactor.service.impl;

import org.dbflute.optional.OptionalEntity;
import org.hibernate.validator.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.dto.Login;

/**
 * 認証クラス
 * SpringSecurityから呼び出されます。SecurityConfigを参照してください。
 * 呼び出し順としては以下のような順で行われます。
 * 1) /api/login を post
 * 2) AuthenticationFilter.attemptAuthentication が呼び出される
 * 3) 本クラスのauthenticateが呼び出される
 *    UserDetailsImplもこの中で生成されたものが使いまわされます
 * 4) 認証成功時は AuthenticationFilter.successfulAuthentication
 *    認証失敗時は AuthenticationFilter.unsuccessfulAuthentication
 * 5) 認証成功時は SecurityConfig.loginSuccessHandler
 *    認証失敗時は SecurityConfig.loginFailedHandler
 */
@Service
public class AuthenticationProviderImpl implements AuthenticationProvider {

	@Autowired
	private TblUserBhv userBhv;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Login loginData = (Login)authentication.getPrincipal();
		String account = loginData.getAccount();
		String password = loginData.getPassword();
		if (StringHelper.isNullOrEmptyString(account) || StringHelper.isNullOrEmptyString(password)) {
			throw new AuthenticationCredentialsNotFoundException("login faild - 1");	// 認証失敗
		}
		OptionalEntity<TblUser> optUser = userBhv.selectEntity(cb -> {
			cb.query().setAccount_Equal(account);
		});
		if (!optUser.isPresent()) {
			throw new AuthenticationCredentialsNotFoundException("login faild - 2");	// 認証失敗
		}
		TblUser user = optUser.get();
		if (!passwordEncoder.matches(password, user.getPassword())) {
			throw new AuthenticationCredentialsNotFoundException("login faild - 3");	// 認証失敗
		}
		UserDetailsImpl userDetails = new UserDetailsImpl(user);
		return new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());	// 認証成功
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
