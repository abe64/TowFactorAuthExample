package com.sharecrest.twofactor.dto;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "ユーザー情報更新")
@Data
public class UserInitInfo {
	@ApiModelProperty(value = "ユーザー名", example = "山田太郎", position = 10)
	@NotBlank
	private String name;

	@ApiModelProperty(value = "パスワード", position = 20)
	@NotBlank
	private String password;
}
