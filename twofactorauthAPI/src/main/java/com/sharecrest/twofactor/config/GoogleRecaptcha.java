package com.sharecrest.twofactor.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "google.recaptcha.key")
@Data
public class GoogleRecaptcha {
	private String site;
	private String secret;
}
