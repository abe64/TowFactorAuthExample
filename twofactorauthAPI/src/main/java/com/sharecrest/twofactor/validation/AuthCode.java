package com.sharecrest.twofactor.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.sharecrest.twofactor.validation.constraints.AuthCodeValidator;;

/**
 * 認証コード検証
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy={AuthCodeValidator.class})
public @interface AuthCode {
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    String twoFactorUse() default "";
    String twoFactorType() default "";
    String authCode() default "authCode";
    String message() default "{com.sharecrest.UNAUTHORIZED}";
    
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public static @interface List
    {
    	AuthCode[] value();
    }
}
