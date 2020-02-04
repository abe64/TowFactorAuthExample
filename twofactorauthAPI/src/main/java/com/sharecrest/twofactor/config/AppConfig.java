package com.sharecrest.twofactor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class AppConfig {
	
	@Autowired
	MessageSource messageSource;

	/**
	 * デフォルトメッセージファイル(ValidationMessage.properties)をmessages.propertiesに変更してSpringBootと共用にします。<br/>
	 * @return
	 */
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean f = new LocalValidatorFactoryBean();
		f.setValidationMessageSource(this.messageSource);
		return f;
	}

	/**
	 * パスワードハッシュ生成用
	 * @return
	 */
	@Bean
	protected PasswordEncoder passwordEncodeer() {
		return new BCryptPasswordEncoder();
	}
}
