package com.sharecrest.twofactor.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.sharecrest.twofactor.validation.constraints.SecurityTypeValidator;

/**
 * 2段階認証タイプ検証
 * 2段階認証を使用する(two_factor_use=true)の状態でタイプが設定されていない場合はエラー。
 * またタイプがSMS("HOTP_SMS")の場合に電話番号が入力されていない場合はエラー。
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy={SecurityTypeValidator.class})
public @interface SecurityType {
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    String twoFactorUse() default "";
    String twoFactorType() default "";
    String telNo() default "";
    String message() default "{com.sharecrest.Error}";
    
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public static @interface List
    {
    	SecurityType[] value();
    }
}
