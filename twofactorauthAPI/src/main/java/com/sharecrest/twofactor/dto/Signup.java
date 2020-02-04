package com.sharecrest.twofactor.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "サインアップURL")
@Data
public class Signup {
	
	@ApiModelProperty(value = "アカウント", example = "test@sharecrest.com", position = 10)
	private String account;

	@ApiModelProperty(value = "登録日時", example = "2020-01-10T00:00:00+09:00", position = 20)
	private Date now;
	
	@ApiModelProperty(value = "有効期限", example = "2020-01-11T00:00:00+09:00", position = 30)
	private Date expired;
}
