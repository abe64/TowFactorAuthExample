package com.sharecrest.twofactor.dto;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "ユーザー仮登録")
@Data
public class UserProvisional {

	@ApiModelProperty(value = "トークン", position = 10)
	@NotBlank
	private String token;
}
