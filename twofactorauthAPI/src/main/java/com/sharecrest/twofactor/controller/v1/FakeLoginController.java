package com.sharecrest.twofactor.controller.v1;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sharecrest.twofactor.dto.ErrorInfo;
import com.sharecrest.twofactor.dto.Login;
import com.sharecrest.twofactor.dto.LoginSuccess;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * Swagger-uiに出力するためのダミーです。
 * 実際の /api/login はSpringSecurity で処理されます。
 */
@Api(tags = "ログイン/ログアウト")
@RequestMapping(value = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class FakeLoginController {
	
	@ApiOperation(value = "ログイン", notes = "ログイン認証を行います。")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "ログイン成功", response = LoginSuccess.class),
			@ApiResponse(code = 401, message = "認証失敗", response = ErrorInfo.class)
	})
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<LoginSuccess> index(@ApiParam(name = "", value = "ログイン情報") @RequestBody Login login) {
		throw new IllegalStateException("Add Spring Security to handle authentication");
	}
	
	@ApiOperation(value = "ログアウト", notes = "ログアウト")
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public void logout() {
		throw new IllegalStateException("Add Spring Security to handle authentication");
	}
}
