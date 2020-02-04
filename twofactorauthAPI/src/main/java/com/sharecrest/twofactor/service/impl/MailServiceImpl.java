package com.sharecrest.twofactor.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.sharecrest.twofactor.dbflute.exbhv.TblFixedMailBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblFixedMail;
import com.sharecrest.twofactor.service.MailService;
import com.sharecrest.twofactor.service.OptionDataService;
import com.sharecrest.twofactor.service.OptionDataService.KeyCode;

@Service
public class MailServiceImpl implements MailService {
	@Value("${app.app-id}")
	protected String appId;
	
	@Value("${app.app-name}")
	protected String appName;
	
	@Value("${app.version}")
	protected String version;
	
	@Autowired
	MailSender sender;
	
	@Autowired
	TblFixedMailBhv fixedMailBhv;

	@Autowired
	OptionDataService optionDataService;
	
	private Map<String, Supplier<String>> defaultMap;
	
	public MailServiceImpl() {
		// 定型メールの ${ XXXXXX } の置き換え文字列を設定。
		defaultMap = new HashMap<String, Supplier<String>>() {
			private static final long serialVersionUID = 1L; {
				put("APP_ID", () -> appId);
				put("APP_NAME", () -> appName);
				put("VERSION", () -> version);
				put("APP_URL", () -> optionDataService.getValue(KeyCode.APP_URL));
				put("QA_URL", () -> optionDataService.getValue(KeyCode.QA_URL));
				put("FROM_MAIL_ADDRESS", () -> optionDataService.getValue(KeyCode.FROM_MAIL_ADDDRESS));
			}
		};
	}

	@Override
	public void auth(String toAddress, String authCode) {
		sendMail(toAddress, MailService.FixedMailCode.AUTH, new HashMap<String, String>() {
			private static final long serialVersionUID = 1L; {
				put("AUTH_CODE", authCode);
			}
		});
	}
	
	@Override
	public void signup(String toAddress, String signupUrl, LocalDateTime signupUrlExpired) {
		sendMail(toAddress, MailService.FixedMailCode.SIGNUP, new HashMap<String, String>() {
			private static final long serialVersionUID = 1L; {
				put("SIGNUP_URL", signupUrl);
				put("SIGNUP_URL_EXPIRED", signupUrlExpired.format(DateTimeFormatter.ofPattern("yyyy年M月d日　H時")));
			}
		});
	}
	
	/**
	 * 定型メール送信
	 * @param toAddress	宛先メールアドレス
	 * @param fixedMailCode	定型メール
	 * @param map	オプション
	 */
	private void sendMail(String toAddress, MailService.FixedMailCode fixedMailCode, Map<String, String> map) {
		TblFixedMail fixedMail = fixedMailBhv.selectEntity(cb -> cb.query().setCode_Equal(fixedMailCode.name())).get();
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(defaultMap.get("FROM_MAIL_ADDRESS").get());
		msg.setTo(toAddress);
		msg.setSubject(replace(fixedMail.getSubject(), map));
		msg.setText(replace(fixedMail.getBody(), map));
		sender.send(msg);
	}

	/**
	 * "${ XXXXX }"形式の部分を置換。XXXXXを置換する文字列は defaultMap か map、同じキーが存在する場合はmapが優先される。
	 * @param src
	 * @param map
	 * @return
	 */
	private String replace(String src, Map<String, String> map) {
		Pattern pattern = Pattern.compile("\\$\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(src);
		Map<String, String> keyValues = new HashMap<String, String>();
		while(matcher.find()) {
			String key = matcher.group(1).trim();
			if (keyValues.containsKey(key))
				continue;
			String value = map.get(key);
			if (value == null)
				value = defaultMap.get(key).get();
			if (value != null)
				keyValues.put(key, value);
		}
		String dest = new String(src);
		for(Map.Entry<String, String> entry : keyValues.entrySet()) {
			Pattern pattern2 = Pattern.compile("\\$\\{[ ]*" + entry.getKey() + "[ ]*\\}");
			Matcher matcher2 = pattern2.matcher(dest);
			dest = matcher2.replaceAll(entry.getValue());
		}
		return dest;
	}
}
