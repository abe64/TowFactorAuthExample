package com.sharecrest.twofactor.dto;

import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "ユーザー情報")
@Data
public class User {
	
	@ApiModelProperty(value = "ユーザーID", example = "123456", position = 10)
	private int id;
	
	@ApiModelProperty(value = "アカウント", example = "test@sharecrest.com", position = 20)
	private String account;
	
	@ApiModelProperty(value = "ユーザー名", example = "山田太郎", position = 30)
	private String name;
	
	@ApiModelProperty(value = "ロック状態", example = "false", position = 40)
	private boolean locked;
	
	@ApiModelProperty(value = "2要素認証使用", example = "true", position = 50)
	private boolean twoFactorUse;
	
	@ApiModelProperty(value = "2要素認証タイプ", allowEmptyValue = true, example = "HOTP_MAIL", allowableValues = "HOTP_MAIL(メール),HOTP_SMS(ショートメール),TOTP(アプリケーション)", position = 60)
	private TblCDef.TwoFactorType twoFactorType;

	@ApiModelProperty(value = "ログイン回数", position = 70)
	private int loginCount;
}
