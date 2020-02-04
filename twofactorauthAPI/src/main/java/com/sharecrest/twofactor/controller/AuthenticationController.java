package com.sharecrest.twofactor.controller;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sharecrest.twofactor.SCException;
import com.sharecrest.twofactor.SCUtil;
import com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.dto.ErrorInfo;
import com.sharecrest.twofactor.dto.LoginSuccess;
import com.sharecrest.twofactor.dto.TwoFactor;
import com.sharecrest.twofactor.service.impl.UserDetailsImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * 2段階認証 (認証コード確認用)
 */
@Api(tags = "ログイン/ログアウト")
@RequestMapping(value = "/api/auth", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class AuthenticationController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MessageSource messages;

	@Autowired
	TblUserBhv userBhv;
	
	@ApiOperation(value = "認証コード確認", notes = "2段階認証の認証コードを確認します。")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "認証成功", response = LoginSuccess.class),
			@ApiResponse(code = 401, message = "認証が必要です", response = ErrorInfo.class)
	})
	@RequestMapping(value = "", method = { RequestMethod.POST })
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@ResponseBody
	public ResponseEntity<LoginSuccess> twoFactorAuth(
			@ApiParam(name = "TwoFactor", required = true, value ="認証情報") @Validated @RequestBody TwoFactor param,
			HttpServletResponse response) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchMessageException, IOException, ServletException {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		// 認証コード確認
		String secret = user.getSecret();
		boolean isAuthOk = SCUtil.checkAuthCode(secret, user.getTwoFactorTypeAsTwoFactorType(), user.getLoginCount(), param.getAuthCode());
		if (isAuthOk) {
			// ロール切り替え
			userDetail.removeAuthority("ROLE_PRE_AUTH_USER");
			userDetail.addAuthority("ROLE_AUTH_USER");
			user.setLoginCount(user.getLoginCount() + 1);	// ログイン回数のカウントアップ
			userBhv.update(user);
		} else {
			// 認証エラー
			throw new SCException(HttpStatus.UNAUTHORIZED, null, null, messages.getMessage("com.sharecrest.UNAUTHORIZED", null, null));
		}
		return ResponseEntity.ok(new LoginSuccess() {{
			setId(user.getUserId());
			setAccount(user.getAccount());
			setName(user.getName());
			setRoles(Arrays.asList(user.getRole().split(",")));
			setTwoFactorUse(user.getTwoFactorUse());
			setTwoFactorType(user.getTwoFactorTypeAsTwoFactorType());
		}});
	}
}
