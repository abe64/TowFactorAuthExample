package com.sharecrest.twofactor.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swaggerのページ(http://xxxxx/swagger-ui.html)が production で表示されないようにするためのダミーコントローラです。<br/>
 * develop以外のビルドの場合はこのコントローラが有効になり、http://xxxxx/swagger-ui.htmlの表示を妨害します。(404で返すようにする)<br/>
 * 
 * APIを公開するならむしろこれ邪魔。
 */
@Profile("!develop")
@RestController
public class SwaggerDummyController {
	@RequestMapping(value = "swagger-ui.html", method = RequestMethod.GET)
	public void index(HttpServletResponse httpResponse) throws IOException {
		httpResponse.setStatus(HttpStatus.NOT_FOUND.value());
	}
}
