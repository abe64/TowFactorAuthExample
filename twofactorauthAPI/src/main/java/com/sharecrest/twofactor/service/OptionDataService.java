package com.sharecrest.twofactor.service;

public interface OptionDataService {
	/**
	 * キーコード
	 */
	public enum KeyCode {
		/** 送信元メールアドレス */
		FROM_MAIL_ADDDRESS,
		/** アプリケーショントップURL */
		APP_URL,
		/** 問い合わせ用URL */
		QA_URL,
		/** サインアップ時のワンタイムURLの有効日数 */
		SIGNUP_MAIL_EXPIRED
	}

	/**
	 * オプションデータ取得
	 * @param keyCode
	 * @return
	 */
	String getValue(KeyCode keyCode);
}
