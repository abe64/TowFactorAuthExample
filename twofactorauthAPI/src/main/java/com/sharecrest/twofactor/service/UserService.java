package com.sharecrest.twofactor.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.dto.LoginSuccess;
import com.sharecrest.twofactor.dto.UserAccount;
import com.sharecrest.twofactor.dto.UserInitInfo;
import com.sharecrest.twofactor.dto.UserSecurity;
import com.sharecrest.twofactor.dto.UserSecurityCheck;
import com.sharecrest.twofactor.dto.UserSecurityInfo;

public interface UserService {
	
	/**
	 * サインアップ
	 * @param userCreate
	 */
	void signup(UserAccount userCreate) throws JsonProcessingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException;
	
	/**
	 * ユーザー仮登録
	 */
	void provisional(String token);
	
	/**
	 * ユーザー情報初期登録
	 * @param userInfo
	 */
	LoginSuccess initUpdate(UserInitInfo userInitInfo);
	
	/**
	 * セキュリティ設定取得
	 * @return
	 */
	UserSecurityInfo getSecurityInfo();
	
	/**
	 * 認証コード送信
	 * HOTP_MAIL or HOTP_SMSの場合はメール or ショートメールで認証コードを送信
	 * @param user
	 * @param twoFactorType
	 * @param secret
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidKeyException 
	 */
	boolean sendAuthCode(TblUser user, TblCDef.TwoFactorType twoFactorType, String telNo, String secret) throws NoSuchAlgorithmException, InvalidKeyException;
	
	/**
	 * セキュリティ情報変更チェック
	 * @param userSecurityCheck
	 */
	void securityUpdateCheck(UserSecurityCheck userSecurityCheck) throws InvalidKeyException, NoSuchAlgorithmException;

	/**
	 * セキュリティ情報変更
	 * @param userSecurity
	 */
	void securityUpdate(UserSecurity userSecurity);
}
