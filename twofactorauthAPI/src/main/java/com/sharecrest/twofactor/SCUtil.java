package com.sharecrest.twofactor;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.jboss.aerogear.security.otp.Totp;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;
import com.sharecrest.twofactor.dto.ErrorInfo;
import com.sharecrest.twofactor.service.impl.UserDetailsImpl;

public class SCUtil {
	/**
	 * ログインユーザー情報取得
	 * @return 未ログイン時はnull
	 */
	public static UserDetailsImpl getPrincipal() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object principal = auth.getPrincipal();
		if (principal instanceof UserDetailsImpl) {
			
			auth.getAuthorities().forEach(role -> {
				System.out.print(role.getAuthority() + ", ");
			});
			System.out.println();
			
			
			return (UserDetailsImpl)auth.getPrincipal();
		}
		return null;
	}

	/**
	 * HOTP用 RFC4226 6桁の認証コード取得
	 * [参考] https://www.javatips.net/api/picketbox-master/security-spi/spi/src/main/java/org/jboss/security/otp/HOTP.java
	 * @param secret	シークレットコード
	 * @param counter	カウンタ (ログイン回数)
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidKeyException 
	 */
	public static int generateHOTP(String secret, long counter) throws NoSuchAlgorithmException, InvalidKeyException {
		// HS = HMAC-SHA-1(secret, count)
		SecretKey sk = new SecretKeySpec(secret.getBytes(), "HmacSHA1");
		byte[] arrCount = new byte[8];
		for(int i = arrCount.length  - 1; i >= 0; i--) {
			arrCount[i] = (byte)(counter & 0xff);
			counter >>= 8;
		}
		Mac mac = Mac.getInstance("HmacSHA1");
		mac.init(sk);
		byte[] hs = mac.doFinal(arrCount);
		
		// HS -> 6桁数値
		int offset = hs[hs.length-1] & 0xF;
		int num = (hs[offset] & 0x7f) << 24 |
					(hs[offset + 1] & 0xff) << 16 |
					(hs[offset + 2] & 0xff) << 8 |
					(hs[offset + 3] & 0xff);
		String numStr = Integer.toString(num);
		numStr = numStr.substring(numStr.length() - 6);
		return Integer.parseInt(numStr, 10);
	}

	/**
	 * HOTPの答え合わせで以下のサイトのサンプルと比較して確認しました。
	 * http://www.foo.be/hotp/example.html
	 * 
	 * dec6 (6桁コード)が以下のようになればOK
	 * 755224
	 * 287082
	 * 359152
	 * 969429
	 * 338314
	 * 254676
	 * 287922
	 * 162583
	 * 399871
	 * 520489
	 */
	public static void generateHOTPTest() {
		byte[] bytes = {0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x30,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x30};
		String secret = new String(bytes);
		for(long i = 0; i<10; i++) {
			try {
				int authCode = generateHOTP(secret, i);
				System.out.println(authCode);
			} catch (InvalidKeyException | NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 認証コード検証
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidKeyException 
	 */
	public static boolean checkAuthCode(String secret, TblCDef.TwoFactorType twoFactorType, int loginCount, int authCode) throws InvalidKeyException, NoSuchAlgorithmException {
		if (twoFactorType == TblCDef.TwoFactorType.TOTP) {
			// TOTP認証
			Totp totp = new Totp(secret);
			return totp.verify(Integer.toString(authCode));
		} else {
			// HTOP認証
			return authCode == generateHOTP(secret, loginCount);
		}
	}
	
	/**
	 * エラー情報をHttpServletResponseに設定
	 * @param res
	 * @param status
	 * @param error
	 * @param domain
	 * @param message
	 * @throws IOException
	 * @throws ServletException
	 */
	public static void setErrorInfo(HttpServletResponse res, int status, String error, String domain, String message) throws IOException, ServletException {
		res.setStatus(status);
		res.setContentType("application/json;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print(getErrorInfoString(status, error, domain, message));
        out.flush();
        out.close();
	}
	
	/**
	 * エラー情報からJSON文字列に変換
	 * @param status
	 * @param error
	 * @param domain
	 * @param message
	 * @return
	 */
	public static String getErrorInfoString(int status, String error, String domain, String message) {
        try {
			return new ObjectMapper().writeValueAsString(getErrorInfo(status, error, domain, message));
		} catch (JsonProcessingException e) {
			return message;
		}
	}
	
	/**
	 * エラー情報からErrorInfo作成
	 * @param status
	 * @param error
	 * @param domain
	 * @param message
	 * @return
	 */
	public static ErrorInfo getErrorInfo(int status, String error, String domain, String message) {
		return new ErrorInfo() {{
			setStatus(status);
			setError(error);
			setDomain(domain);
			setMessage(message);
		}};
	}
}
