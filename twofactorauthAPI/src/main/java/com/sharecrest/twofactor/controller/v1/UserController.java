package com.sharecrest.twofactor.controller.v1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.imageio.ImageIO;

import org.hibernate.validator.internal.util.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sharecrest.twofactor.SCUtil;
import com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv;
import com.sharecrest.twofactor.dbflute.exentity.TblUser;
import com.sharecrest.twofactor.dto.LoginSuccess;
import com.sharecrest.twofactor.dto.User;
import com.sharecrest.twofactor.dto.UserAccount;
import com.sharecrest.twofactor.dto.UserSecurity;
import com.sharecrest.twofactor.dto.UserSecurityCheck;
import com.sharecrest.twofactor.dto.UserSecurityInfo;
import com.sharecrest.twofactor.dto.UserInitInfo;
import com.sharecrest.twofactor.dto.UserProvisional;
import com.sharecrest.twofactor.service.UserService;
import com.sharecrest.twofactor.service.impl.UserDetailsImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "ユーザー")
@RequestMapping(value = "/api/v1/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UserController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MessageSource messages;
	
	@Autowired
	TblUserBhv userBhv;
	
	@Autowired
	UserService userService;

	/**
	 * テスト用です。ログイン中のユーザー情報を返します
	 * @return
	 */
	@ApiOperation(value = "ユーザー情報取得", notes = "ログイン中のユーザー情報取得")
	@RequestMapping(value = "/login", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	@ResponseBody
	public ResponseEntity<User> currentUser() {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		if (userDetail == null)
			return ResponseEntity.ok(new User());
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		return ResponseEntity.ok(new User() {{
			setId(user.getUserId());
			setAccount(user.getAccount());
			setName(user.getName());
			setLocked(!user.getUnlocked());
			setTwoFactorUse(user.getTwoFactorUse());
			setTwoFactorType(user.getTwoFactorTypeAsTwoFactorType());
			setLoginCount(user.getLoginCount());
		}});
	}
	
	/**
	 * テスト用です。ROLE_ADMINを持っているユーザーのみ認可。
	 */
	@ApiOperation(value = "ADMINユーザー確認", notes = "ADMINユーザーのみ実行可能")
	@RequestMapping(value = "/admin_only", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void adminOnly() {
		System.out.print("■■■ ADMINユーザー確認 ■■■");
	}

	/**
	 * サインアップ
	 * 既に使用されているメールアドレスの場合は何もしません。
	 * 存在しないメールアドレスの場合は仮登録した後認証用のワンタイムURLをメールで送信します。
	 * @param userCreate
	 * @throws BadPaddingException 
	 * @throws IllegalBlockSizeException 
	 * @throws InvalidAlgorithmParameterException 
	 * @throws NoSuchPaddingException 
	 * @throws NoSuchAlgorithmException 
	 * @throws JsonProcessingException 
	 * @throws InvalidKeyException 
	 * @throws UnsupportedEncodingException 
	 */
	@ApiOperation(value = "サインアップ", notes = "ワンタイムURLを生成してメールアドレス(アカウント)に送信します。ワンタイムURLがクリックされると仮登録に進みます。既に使用されているユーザー登録されているメールアドレスの場合は何もしません。")
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	@ResponseBody
	public void signup(
			@ApiParam(name = "userAccount", required = true, value = "サインアップ") @Validated @RequestBody UserAccount userAccount) throws InvalidKeyException, JsonProcessingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		userService.signup(userAccount);
	}
	
	@ApiOperation(value = "ユーザー仮登録", notes = "ユーザーの仮登録と仮認証を行います。仮認証ではROLE_SIGNUPのみ認可されます。ユーザー情報初期登録のみ使用可能です。")
	@RequestMapping(value = "/provisional", method = RequestMethod.POST)
	@ResponseBody
	public void provisional(
			@ApiParam(name = "token", required = true, value = "トークン") @Validated @RequestBody UserProvisional userProvisional) {
		userService.provisional(userProvisional.getToken());
	}
	
	/**
	 * ユーザー情報初期登録
	 * @param userUpdate
	 */
	@ApiOperation(value = "ユーザー情報初期登録", notes = "ユーザー本登録を行います。本API呼び出し以降は通常ユーザーとなります。")
	@RequestMapping(value = "/init_update", method = RequestMethod.POST)
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@ResponseBody
	public ResponseEntity<LoginSuccess> initUpdate(
			@ApiParam(name = "userInitUpdate", required = true, value = "ユーザー情報") @Validated @RequestBody UserInitInfo userInitInfo) {
		return ResponseEntity.ok(userService.initUpdate(userInitInfo));
	}
	
	/**
	 * セキュリティ設定取得
	 * @return
	 */
	@ApiOperation(value = "ユーザー情報初期登録", notes = "ユーザー本登録を行います。本API呼び出し以降は通常ユーザーとなります。")
	@RequestMapping(value = "/security_info", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<UserSecurityInfo> getSecurityInfo() {
		return ResponseEntity.ok(userService.getSecurityInfo());
	}
	
	/**
	 * セキュリティ情報変更時の事前チェック
	 * 本メソッドを呼ぶことで新しい秘密コードが生成され一時的に保存されます。
	 * この再メールまたはショートメールが選択されている場合は新しい秘密コードでユーザーに認証コードが送信されます。
	 * ユーザーが入力した認証コードで /update_security を呼び、一時的に保存されている秘密コードで認証できた場合のみ変更内容が保存されます。
	 * @param param
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	@ApiOperation(value = "ユーザーセキュリティ情報変更チェック", notes = "ユーザーのセキュリティ情報を変更の事前チェックです。必要であれば認証コードの送信を行います")
	@RequestMapping(value = "/check_update_security", method = RequestMethod.POST)
	@ResponseBody
	public void updateSecurityCheck(
			@ApiParam(name = "userSecurity", required = true, value = "ユーザーセキュリティ情報") @Validated @RequestBody UserSecurityCheck param) throws InvalidKeyException, NoSuchAlgorithmException {
		userService.securityUpdateCheck(param);
	}

	/**
	 * セキュリティ情報変更
	 * 事前に /check_update_security 呼び出しで生成された秘密コードとパラメータで渡される認証コードで認証できた場合のみ保存されます。
	 * @param param
	 */
	@ApiOperation(value = "ユーザーセキュリティ情報変更", notes = "ユーザーのセキュリティ情報を変更。事前に変更確認が必要です")
	@RequestMapping(value = "/update_security", method = RequestMethod.PUT)
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@ResponseBody
	public void updateSecurity(
			@ApiParam(name = "userSecurity", required = true, value = "ユーザーセキュリティ情報") @Validated @RequestBody UserSecurity param) {
		userService.securityUpdate(param);
	}
	
	/**
	 * アプリケーショ認証用QRコード
	 * パラメータ (?check=true) を付けた場合のみ /check_update_security で生成された一時的な秘密コードでQRコードを生成します。
	 * パラメータがない場合は現在のユーザーの秘密コードでQRコードを生成します。(こっちの機能はいらないかも)
	 * @param model
	 * @return
	 * @throws IOException
	 * @throws WriterException
	 */
	@ApiOperation(value = "認証用QRコード取得", notes = "認証コードのQRコードイメージを取得します。?check=trueとすると事前チェックのQRコードが取得できます")
	@RequestMapping(value = "/auth_qr", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> qr(
			@ApiParam(name = "check", required = false, value = "指定された場合は事前チェックのQRコードとなります") @RequestParam(name="check", required = false) String check, Model model) throws IOException, WriterException {
		UserDetailsImpl userDetail = SCUtil.getPrincipal();
		TblUser user = userBhv.selectByPK(userDetail.getUserId()).get();
		String secret = user.getSecret();
		if (!StringHelper.isNullOrEmptyString(check)) {
			// パラメータが存在する場合は秘密コードは事前チェック用のPreSecretを使用する。
			secret = userDetail.getPreSecret();
		}
		if (!StringHelper.isNullOrEmptyString(secret)) {
			// QRコード用情報を生成します。(otpauth://totp/USERNAME?secret=SECRET&issuer=ISSUER)
			String qrStr = String.format("otpauth://totp/%s?secret=%s&issuer=%s", "TwoFactorTest : " + user.getAccount(), secret, "ShareCrest Co.,Ltd.");
			byte[] res = toByteArray(qrStr);
			final HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.IMAGE_PNG);
			return new ResponseEntity<byte[]>(res, headers, HttpStatus.CREATED);
		}
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_PNG);
		return new ResponseEntity<byte[]>(spaceImage(), headers, HttpStatus.CREATED);
	}

	private byte[] toByteArray(String contents) throws IOException, WriterException {
		BarcodeFormat format = BarcodeFormat.QR_CODE;
		int width = 160;
		int height = 160;
		
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		
		try (ByteArrayOutputStream output = new ByteArrayOutputStream()){
			QRCodeWriter writer = new QRCodeWriter();
			BitMatrix bitMatrix = writer.encode(contents, format, width, height, hints);
			MatrixToImageWriter.writeToStream(bitMatrix, "png", output);
			return output.toByteArray();
		}
	}

	/**
	 * QRコードダミー画像
	 * 160x160の透明な画像を作成します。
	 * @return
	 * @throws IOException
	 * @throws WriterException
	 */
	private byte[] spaceImage() throws IOException, WriterException {
		int width = 160;
		int height = 160;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
		g.setColor(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		g.fillRect(0, 0, width, height);
		g.dispose();
		try (ByteArrayOutputStream output = new ByteArrayOutputStream()){
			ImageIO.write(image, "png", output);
			return output.toByteArray();
		}
	}
}
