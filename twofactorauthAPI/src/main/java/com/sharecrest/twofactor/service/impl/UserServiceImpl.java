package com.sharecrest.twofactor.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.dbflute.optional.OptionalEntity;
import org.jboss.aerogear.security.otp.api.Base32;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sharecrest.twofactor.SCException;
import com.sharecrest.twofactor.SCUtil;
import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;
import com.sharecrest.twofactor.dbflute.allcommon.TblCDef.TwoFactorType;
import com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.dto.Login;
import com.sharecrest.twofactor.dto.LoginSuccess;
import com.sharecrest.twofactor.dto.Signup;
import com.sharecrest.twofactor.dto.UserAccount;
import com.sharecrest.twofactor.dto.UserInitInfo;
import com.sharecrest.twofactor.dto.UserSecurity;
import com.sharecrest.twofactor.dto.UserSecurityCheck;
import com.sharecrest.twofactor.dto.UserSecurityInfo;
import com.sharecrest.twofactor.service.MailService;
import com.sharecrest.twofactor.service.OptionDataService;
import com.sharecrest.twofactor.service.OptionDataService.KeyCode;
import com.sharecrest.twofactor.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// ワンタイムURL生成用のAES暗号化時秘密キー
	private final String encKey = "Sc1300022agagaga";
	private final String initVector = "Sharecrest123456";

	@Autowired
	TblUserBhv userBhv;
	
	@Autowired
	MailService mailService;
	
	@Autowired
	OptionDataService optionDataService;

	@Autowired
	PasswordEncoder passwordEncoder;
	
    @Autowired
    AuthenticationManager authenticationManager;
	
	@Override
	public 	void signup(UserAccount userCreate) throws JsonProcessingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		if (userBhv.selectEntity(cb -> {
				cb.query().setAccount_Equal(userCreate.getAccount());
			}).isPresent()) {
			// 既に通常ユーザーとして存在している場合はなにもしない。
			return;
		}
		// 期限付きのワンタイムURLを生成
		LocalDateTime nowDt = LocalDateTime.now();
		int expiredDay = Integer.parseInt(optionDataService.getValue(KeyCode.SIGNUP_MAIL_EXPIRED), 10);
		LocalDateTime expiredDt = nowDt.plusDays(expiredDay);	// 有効期限
		
		// メールアドレス(アカウント)、現在日時(now)、有効期限(expired)を一旦JSONに変換
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(new Signup() {{
			setAccount(userCreate.getAccount());
			setNow(Date.from(nowDt.atZone(ZoneId.systemDefault()).toInstant()));
			setExpired(Date.from(expiredDt.atZone(ZoneId.systemDefault()).toInstant()));
		}});
		// JSONを暗号化(AES)
		final IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
		final SecretKeySpec key = new SecretKeySpec(encKey.getBytes(), "AES");
		Cipher enc = Cipher.getInstance("AES/CBC/PKCS5Padding");
		enc.init(Cipher.ENCRYPT_MODE,  key, iv);
		byte[] byteToken = enc.doFinal(json.getBytes());
		String token = new String(Base64.getUrlEncoder().encode(byteToken));
		// URLエンコード
		String tokenURL = URLEncoder.encode(token, "UTF-8");

		// ワンタイムURLをメールで送信
		String signupUrl = optionDataService.getValue(KeyCode.APP_URL) + "/signup/" + tokenURL;
		mailService.signup(userCreate.getAccount(), signupUrl, expiredDt);
	}

	@Override
	public void provisional(String token) {
		try {
			// tokenを複合化(AES)
			final IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
			final SecretKeySpec key = new SecretKeySpec(encKey.getBytes(), "AES");
			Cipher dec;
			dec = Cipher.getInstance("AES/CBC/PKCS5Padding");
			dec.init(Cipher.DECRYPT_MODE, key, iv);
			byte[] byteToken = Base64.getUrlDecoder().decode(token);
			String json = new String(dec.doFinal(byteToken));
			// JSON -> Signup
			ObjectMapper mapper = new ObjectMapper();
			Signup signup = mapper.readValue(json, Signup.class);
			// 有効期限チェック
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime expired = signup.getExpired().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
			if (expired.compareTo(now) <= 0) {
				// 期限切れ
				throw new SCException("有効期限切れ", "", "もう一度サインアップからやり直してください");
			}

			// 仮登録ユーザーの読み込み、仮登録されていない場合は登録する
			String provisionalPassword = "provisional_password2019";
			OptionalEntity<TblUser> opt = userBhv.selectEntity(cb -> {
				cb.query().setAccount_Equal(signup.getAccount());
			});
			TblUser user = opt.isPresent() ? opt.get() : new TblUser();
			if (opt.isPresent() && user.getStatusAsUserStatus() == TblCDef.UserStatus.NORMAL) {
				// 既に通常ユーザーとして存在している場合は例外
				throw new SCException("登録済み", "", "既に登録が完了しています。トップページからログインしてください。");
			} else if (!opt.isPresent()) {
				// 仮登録前の場合はユーザーの仮登録
				user = new TblUser();
				user.setName("");
				user.setAccount(signup.getAccount());
				user.setPassword(passwordEncoder.encode(provisionalPassword));
				user.setUnlocked(true);
				user.setRole("ROLE_SIGNUP");
				user.setStatusAsUserStatus(TblCDef.UserStatus.SIGNUP);
				userBhv.insert(user);
			}
			
			// 仮認証 (手動認証する)
			Login loginData = new Login();
			loginData.setAccount(user.getAccount());
			loginData.setPassword(provisionalPassword);
	        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
	        		loginData,
	        		loginData.getPassword(),
	                new ArrayList<>());
	        Authentication auth = authenticationManager.authenticate(authRequest);
			SecurityContext sc = SecurityContextHolder.getContext();
			sc.setAuthentication(auth);

			// 上記認証後には ROLE_AUTH_USER が付いてしまうため一旦削除。本登録後に復活させます。
			UserDetailsImpl userDetail = SCUtil.getPrincipal();
			userDetail.removeAuthority("ROLE_AUTH_USER");
		} catch (SCException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public LoginSuccess initUpdate(UserInitInfo userInitInfo) {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		user.setName(userInitInfo.getName());
		user.setPassword(passwordEncoder.encode(userInitInfo.getPassword()));
		user.setRole("ROLE_USER");
		user.setStatusAsUserStatus(TblCDef.UserStatus.NORMAL);
		user.setLoginCount(user.getLoginCount() + 1);	// ログイン回数のカウントアップ
		userBhv.update(user);
		
		// ロール切り替え
		userDetail.removeAuthority("ROLE_SIGNUP");
		userDetail.addAuthority("ROLE_USER");
		userDetail.addAuthority("ROLE_AUTH_USER");
		
		return new LoginSuccess() {{
			setId(user.getUserId());
			setAccount(user.getAccount());
			setName(user.getName());
			setRoles(Arrays.asList(user.getRole().split(",")));
			setTwoFactorUse(user.getTwoFactorUse());
			setTwoFactorType(user.getTwoFactorTypeAsTwoFactorType());
		}};
	}

	@Override
	public UserSecurityInfo getSecurityInfo() {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		return new UserSecurityInfo() {{
			setTwoFactorUse(user.getTwoFactorUse());
			setTwoFactorType(user.getTwoFactorTypeAsTwoFactorType());
			setTelNo(user.getTelno());
		}};
	}

	@Override
	public boolean sendAuthCode(TblUser user, TwoFactorType twoFactorType, String telNo, String secret)
			throws NoSuchAlgorithmException, InvalidKeyException {
		boolean result = false;
		if (twoFactorType == TblCDef.TwoFactorType.HOTP_MAIL) {
			// メールで送信
			int authCode = SCUtil.generateHOTP(secret, user.getLoginCount());
			mailService.auth(user.getAccount(), Integer.toString(authCode));
			result = true;
			
		} else if (twoFactorType == TblCDef.TwoFactorType.HOTP_SMS) {
			// SMSで送信
//			int authCode = Utils.generateHOTP(user.getSecret(), user.getLoginCount());
			
			
			
			result = true;
			
		}
		return result;
	}
	
	@Override
	public void securityUpdateCheck(UserSecurityCheck userSecurityCheck) throws InvalidKeyException, NoSuchAlgorithmException {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		String secret = "";
		if (userSecurityCheck.getTwoFactorUse()) {
			secret = Base32.random();
			if (userSecurityCheck.getTwoFactorType() != TblCDef.TwoFactorType.TOTP) {
				// HOTPの場合は認証コードの送信処理
				sendAuthCode(user, userSecurityCheck.getTwoFactorType(), userSecurityCheck.getTelNo(), secret);
			}
		}
		userDetail.setPreSecret(secret);
	}
	
	@Override
	public void securityUpdate(UserSecurity userSecurity) {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		user.setTwoFactorUse(userSecurity.getTwoFactorUse());
		user.setTwoFactorTypeAsTwoFactorType(userSecurity.getTwoFactorType());
		user.setTelno(userSecurity.getTelNo());
		user.setSecret(userDetail.getPreSecret());
		userBhv.update(user);
	}

}
