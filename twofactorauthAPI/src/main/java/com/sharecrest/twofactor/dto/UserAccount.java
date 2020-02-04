package com.sharecrest.twofactor.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "サインアップ")
@Data
public class UserAccount {

	@ApiModelProperty(value = "アカウント", example = "test@sharecrest.com", position = 10)
	@NotBlank
	// メールアドレスの整合性チェツク (https://qiita.com/sakuro/items/1eaa307609ceaaf51123) 
	@Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")
	private String account;
}
