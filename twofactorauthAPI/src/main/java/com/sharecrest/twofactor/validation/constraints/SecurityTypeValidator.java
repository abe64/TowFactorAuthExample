package com.sharecrest.twofactor.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.internal.util.StringHelper;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;
import com.sharecrest.twofactor.validation.SecurityType;

public class SecurityTypeValidator implements ConstraintValidator<SecurityType, Object> {
    private String fieldTwoFactorUse;
    private String fieldTwoFactorType;
    private String fieldTelNo;
    private String message;
    
    @Override
    public void initialize(SecurityType ann) {
    	this.fieldTwoFactorUse = ann.twoFactorUse();
    	this.fieldTwoFactorType = ann.twoFactorType();
    	this.fieldTelNo = ann.telNo();
    	this.message = ann.message();
    }

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		try {
			BeanWrapper bw = new BeanWrapperImpl(value);
			Boolean twoFactorUse = (Boolean)bw.getPropertyValue(fieldTwoFactorUse);
			TblCDef.TwoFactorType twoFactorType = (TblCDef.TwoFactorType)bw.getPropertyValue(fieldTwoFactorType);
			String telNo = (String)bw.getPropertyValue(fieldTelNo);
			if (twoFactorUse == null)
				return true;
			if (twoFactorUse) {
				if (twoFactorType == null) {
					context.disableDefaultConstraintViolation();
					context.buildConstraintViolationWithTemplate("{javax.validation.constraints.NotNull.message}")
						.addPropertyNode(fieldTwoFactorType)
						.addConstraintViolation();
					return false;
				}
				switch (twoFactorType) {
				case HOTP_MAIL:		// メール
					break;
				case HOTP_SMS:			// SMS
					if (StringHelper.isNullOrEmptyString(telNo)) {
						// SMSの場合は電話番号必須
						context.disableDefaultConstraintViolation();
						context.buildConstraintViolationWithTemplate("{com.sharecrest.twofactor.reqired.telno}")
							.addPropertyNode(fieldTelNo)
							.addConstraintViolation();
						return false;
					}
					break;
				case TOTP:				// アプリケーション
					break;
				}
			}
			return true;
		} catch (Exception ex) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message)
				.addPropertyNode(fieldTwoFactorUse)
				.addConstraintViolation();
			return false;
		}
	}

}
