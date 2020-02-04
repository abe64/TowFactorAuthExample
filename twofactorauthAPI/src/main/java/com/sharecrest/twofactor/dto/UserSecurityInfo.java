package com.sharecrest.twofactor.dto;

import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "セキュリティ情報")
@Data
public class UserSecurityInfo {
	@ApiModelProperty(value = "2要素認証使用", example = "true", position = 10)
	private Boolean twoFactorUse;
	
	@ApiModelProperty(value = "2要素認証タイプ", allowEmptyValue = true, example = "HOTP_MAIL", allowableValues = "HOTP_MAIL(メール),HOTP_SMS(ショートメール),TOTP(アプリケーション)", position = 20)
	private TblCDef.TwoFactorType twoFactorType;

	@ApiModelProperty(value = "電話番号", example = "0311112222", position = 30)
	private String telNo;
}
