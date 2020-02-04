package com.sharecrest.twofactor.validation.constraints;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.internal.util.StringHelper;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import com.sharecrest.twofactor.SCUtil;
import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;
import com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.service.impl.UserDetailsImpl;
import com.sharecrest.twofactor.validation.AuthCode;

/**
 * 認証コード検証
 */
public class AuthCodeValidator implements ConstraintValidator<AuthCode, Object> {
    private String fieldTwoFactorUse;
    private String fieldTwoFactorType;
    private String fieldAuthCode;
    private String message;
    
    @Autowired
    TblUserBhv userBhv;
    
    @Override
    public void initialize(AuthCode ann) {
    	this.fieldTwoFactorUse = ann.twoFactorUse();
    	this.fieldTwoFactorType = ann.twoFactorType();
    	this.fieldAuthCode = ann.authCode();
    	this.message = ann.message();
    }

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		boolean twoFactorUse = false;
		TblCDef.TwoFactorType twoFactorType = TblCDef.TwoFactorType.TOTP;
		String secret = "";
		Integer authCode = -1;
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();

		// クラスに付けられていた場合
		BeanWrapper bw = new BeanWrapperImpl(value);
		if (StringHelper.isNullOrEmptyString(fieldTwoFactorUse) || 
				StringHelper.isNullOrEmptyString(fieldTwoFactorType)) {
			// ログインユーザーの認証タイプを使用して検証します。
			twoFactorUse = user.getTwoFactorUse();
			twoFactorType = user.getTwoFactorTypeAsTwoFactorType();
			secret = user.getSecret();
		} else {
			// パラメータの認証タイプを使用して検証します。
			twoFactorUse = (boolean)bw.getPropertyValue(fieldTwoFactorUse);
			twoFactorType = (TblCDef.TwoFactorType)bw.getPropertyValue(fieldTwoFactorType);
			secret = userDetail.getPreSecret();
		}
		if (twoFactorUse) {
			// 2段階認証ありの場合のみ検証
			authCode = (Integer)bw.getPropertyValue(fieldAuthCode);
			if (authCode == null) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate("{javax.validation.constraints.NotBlank.message}")
					.addPropertyNode(fieldAuthCode)
					.addConstraintViolation();
			}
			boolean result = false;
			try {
				result = SCUtil.checkAuthCode(secret, twoFactorType, user.getLoginCount(), authCode);
			} catch (InvalidKeyException | NoSuchAlgorithmException e) {
				result = false;
			} finally {
				if (!result) {
					context.disableDefaultConstraintViolation();
					context.buildConstraintViolationWithTemplate(message)
						.addPropertyNode(fieldAuthCode)
						.addConstraintViolation();
				}
			}
			return result;
		}
		return true;
	}

}
