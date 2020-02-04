package com.sharecrest.twofactor.controller;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class NotFoundCustomizer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		// 404エラーはルートに戻るように設定。
		// Vueのvue-routerが制御してくれる。(そのままだとリロードされた時に404が出てしまう)
		factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/"));
	}
}
