package com.sharecrest.twofactor.service;

import java.time.LocalDateTime;

public interface MailService {
	/**
	 * 定型メール
	 */
	public enum FixedMailCode {
		/** 認証コード送信 */
		AUTH,
		/** サインアップ時メールアドレス確認 */
		SIGNUP
	}
	
	/**
	 * 認証コード送信
	 * @param toAddress
	 * @param authCode
	 */
	void auth(String toAddress, String authCode);

	/**
	 * サインアップ時メールアドレス確認メール送信
	 * @param toAddress
	 * @param signupUrl
	 * @param signupUrlExpired
	 */
	void signup(String toAddress, String signupUrl, LocalDateTime signupUrlExpired);
}
