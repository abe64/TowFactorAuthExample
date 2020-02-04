package com.sharecrest.twofactor.dto;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "2要素認証コード")
@Data
public class TwoFactor {
	
	@ApiModelProperty(value = "認証コード", example = "123456", position = 10)
	@NotNull
	private Integer authCode;
}
