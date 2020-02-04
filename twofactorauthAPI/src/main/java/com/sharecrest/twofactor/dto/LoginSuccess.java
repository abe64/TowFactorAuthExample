package com.sharecrest.twofactor.dto;

import java.util.List;

import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "ログイン成功時")
@Data
public class LoginSuccess {
	
	@ApiModelProperty(value = "ユーザーID", example = "123456", position = 10)
	private int id;
	
	@ApiModelProperty(value = "アカウント", example = "test@sharecrest.com", position = 20)
	private String account;
	
	@ApiModelProperty(value = "ユーザー名", example = "山田太郎", position = 30)
	private String name;
	
	@ApiModelProperty(value = "ロール", position = 40)
	private List<String> roles;
	
	@ApiModelProperty(value = "2要素認証使用", example = "true", position = 50)
	private boolean twoFactorUse;
	
	@ApiModelProperty(value = "2要素認証タイプ", allowEmptyValue = true, example = "HOTP_MAIL", allowableValues = "HOTP_MAIL(メール),HOTP_SMS(ショートメール),TOTP(アプリケーション)", position = 60)
	private TblCDef.TwoFactorType twoFactorType;
}
