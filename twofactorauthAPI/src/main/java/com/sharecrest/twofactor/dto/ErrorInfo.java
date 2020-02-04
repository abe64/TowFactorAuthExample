package com.sharecrest.twofactor.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "エラー情報")
@Data
public class ErrorInfo {
	
	@ApiModelProperty(value = "HTTPステータス", example = "500", position = 10)
	private int status;
	
	@ApiModelProperty(value = "エラーコード", example = "101", position = 20)
	private String error;
	
	@ApiModelProperty(value = "ドメイン", example = "eventId[0]", position = 30)
	private String domain;
	
	@ApiModelProperty(value = "エラーメッセージ", example = "エラーメッセージ", position = 40)
	private String message;
}
