package com.sharecrest.twofactor.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "ログイン情報")
@Data
public class Login {
	
	@ApiModelProperty(value = "アカウント", example = "xxx@aaa.bbb.co.jp", position = 10)
	private String account;

	@ApiModelProperty(value = "パスワード", position = 20)
	private String password;
	
	@ApiModelProperty(value = "GoogleCaptchaToken", position = 20)
	private String googleCaptchaToken;
}
