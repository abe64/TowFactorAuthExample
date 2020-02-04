package com.sharecrest.twofactor.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.sharecrest.twofactor.dbflute.allcommon.TblDBMetaInstanceHandler;
import com.sharecrest.twofactor.dbflute.allcommon.TblCDef;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The entity of user as TABLE. <br>
 * ユーザー
 * <pre>
 * [primary-key]
 *     user_id
 *
 * [column]
 *     user_id, name, account, password, telno, secret, unlocked, role, two_factor_use, two_factor_type, login_count, status
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String name = entity.getName();
 * String account = entity.getAccount();
 * String password = entity.getPassword();
 * String telno = entity.getTelno();
 * String secret = entity.getSecret();
 * Boolean unlocked = entity.getUnlocked();
 * String role = entity.getRole();
 * Boolean twoFactorUse = entity.getTwoFactorUse();
 * String twoFactorType = entity.getTwoFactorType();
 * Integer loginCount = entity.getLoginCount();
 * String status = entity.getStatus();
 * entity.setUserId(userId);
 * entity.setName(name);
 * entity.setAccount(account);
 * entity.setPassword(password);
 * entity.setTelno(telno);
 * entity.setSecret(secret);
 * entity.setUnlocked(unlocked);
 * entity.setRole(role);
 * entity.setTwoFactorUse(twoFactorUse);
 * entity.setTwoFactorType(twoFactorType);
 * entity.setLoginCount(loginCount);
 * entity.setStatus(status);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblBsUser extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {PK, ID, NotNull, INT(10)} */
    protected Integer _userId;

    /** name: {NotNull, VARCHAR(256)} */
    protected String _name;

    /** account: {UQ, NotNull, VARCHAR(256)} */
    protected String _account;

    /** password: {NotNull, VARCHAR(256)} */
    protected String _password;

    /** telno: {VARCHAR(12)} */
    protected String _telno;

    /** secret: {VARCHAR(16)} */
    protected String _secret;

    /** unlocked: {NotNull, BIT} */
    protected Boolean _unlocked;

    /** role: {VARCHAR(256)} */
    protected String _role;

    /** two_factor_use: {NotNull, BIT, default=[0]} */
    protected Boolean _twoFactorUse;

    /** two_factor_type: {VARCHAR(32), classification=TwoFactorType} */
    protected String _twoFactorType;

    /** login_count: {NotNull, INT(10), default=[0]} */
    protected Integer _loginCount;

    /** status: {NotNull, VARCHAR(32), classification=UserStatus} */
    protected String _status;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return TblDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param account : UQ, NotNull, VARCHAR(256). (NotNull)
     */
    public void uniqueBy(String account) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("account");
        setAccount(account);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of twoFactorType as the classification of TwoFactorType. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public TblCDef.TwoFactorType getTwoFactorTypeAsTwoFactorType() {
        return TblCDef.TwoFactorType.codeOf(getTwoFactorType());
    }

    /**
     * Set the value of twoFactorType as the classification of TwoFactorType. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTwoFactorTypeAsTwoFactorType(TblCDef.TwoFactorType cdef) {
        setTwoFactorType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of status as the classification of UserStatus. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ユーザーステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public TblCDef.UserStatus getStatusAsUserStatus() {
        return TblCDef.UserStatus.codeOf(getStatus());
    }

    /**
     * Set the value of status as the classification of UserStatus. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ユーザーステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStatusAsUserStatus(TblCDef.UserStatus cdef) {
        setStatus(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of twoFactorType as HOTP_MAIL (HOTP_MAIL). <br>
     * ワンタイム(メール): メールに認証コードを送るタイプ。
     */
    public void setTwoFactorType_HOTP_MAIL() {
        setTwoFactorTypeAsTwoFactorType(TblCDef.TwoFactorType.HOTP_MAIL);
    }

    /**
     * Set the value of twoFactorType as HOTP_SMS (HOTP_SMS). <br>
     * ワンタイム(ショートメール): ショートメールに認証コードを送るタイプ。
     */
    public void setTwoFactorType_HOTP_SMS() {
        setTwoFactorTypeAsTwoFactorType(TblCDef.TwoFactorType.HOTP_SMS);
    }

    /**
     * Set the value of twoFactorType as TOTP (TOTP). <br>
     * 所有物認証: アプリケーションの認証コードを使うタイプ。
     */
    public void setTwoFactorType_TOTP() {
        setTwoFactorTypeAsTwoFactorType(TblCDef.TwoFactorType.TOTP);
    }

    /**
     * Set the value of status as NORMAL (NORMAL). <br>
     * 通常: 利用中ユーザー。
     */
    public void setStatus_NORMAL() {
        setStatusAsUserStatus(TblCDef.UserStatus.NORMAL);
    }

    /**
     * Set the value of status as SIGNUP (SIGNUP). <br>
     * サインアップ: サインアップ中。メールアドレスの確認完了後に仮登録された状態。
     */
    public void setStatus_SIGNUP() {
        setStatusAsUserStatus(TblCDef.UserStatus.SIGNUP);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of twoFactorType HOTP_MAIL? <br>
     * ワンタイム(メール): メールに認証コードを送るタイプ。
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTwoFactorTypeHOTP_MAIL() {
        TblCDef.TwoFactorType cdef = getTwoFactorTypeAsTwoFactorType();
        return cdef != null ? cdef.equals(TblCDef.TwoFactorType.HOTP_MAIL) : false;
    }

    /**
     * Is the value of twoFactorType HOTP_SMS? <br>
     * ワンタイム(ショートメール): ショートメールに認証コードを送るタイプ。
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTwoFactorTypeHOTP_SMS() {
        TblCDef.TwoFactorType cdef = getTwoFactorTypeAsTwoFactorType();
        return cdef != null ? cdef.equals(TblCDef.TwoFactorType.HOTP_SMS) : false;
    }

    /**
     * Is the value of twoFactorType TOTP? <br>
     * 所有物認証: アプリケーションの認証コードを使うタイプ。
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTwoFactorTypeTOTP() {
        TblCDef.TwoFactorType cdef = getTwoFactorTypeAsTwoFactorType();
        return cdef != null ? cdef.equals(TblCDef.TwoFactorType.TOTP) : false;
    }

    /**
     * Is the value of status NORMAL? <br>
     * 通常: 利用中ユーザー。
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStatusNORMAL() {
        TblCDef.UserStatus cdef = getStatusAsUserStatus();
        return cdef != null ? cdef.equals(TblCDef.UserStatus.NORMAL) : false;
    }

    /**
     * Is the value of status SIGNUP? <br>
     * サインアップ: サインアップ中。メールアドレスの確認完了後に仮登録された状態。
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStatusSIGNUP() {
        TblCDef.UserStatus cdef = getStatusAsUserStatus();
        return cdef != null ? cdef.equals(TblCDef.UserStatus.SIGNUP) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'twoFactorType' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getTwoFactorTypeAlias() {
        TblCDef.TwoFactorType cdef = getTwoFactorTypeAsTwoFactorType();
        return cdef != null ? cdef.alias() : null;
    }

    /**
     * Get the value of the column 'status' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getStatusAlias() {
        TblCDef.UserStatus cdef = getStatusAsUserStatus();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof TblBsUser) {
            TblBsUser other = (TblBsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_account));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_telno));
        sb.append(dm).append(xfND(_secret));
        sb.append(dm).append(xfND(_unlocked));
        sb.append(dm).append(xfND(_role));
        sb.append(dm).append(xfND(_twoFactorUse));
        sb.append(dm).append(xfND(_twoFactorType));
        sb.append(dm).append(xfND(_loginCount));
        sb.append(dm).append(xfND(_status));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public TblUser clone() {
        return (TblUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, ID, NotNull, INT(10)} <br>
     * ユーザーID
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {PK, ID, NotNull, INT(10)} <br>
     * ユーザーID
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] name: {NotNull, VARCHAR(256)} <br>
     * ユーザー名
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, VARCHAR(256)} <br>
     * ユーザー名
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] account: {UQ, NotNull, VARCHAR(256)} <br>
     * アカウント
     * @return The value of the column 'account'. (basically NotNull if selected: for the constraint)
     */
    public String getAccount() {
        checkSpecifiedProperty("account");
        return _account;
    }

    /**
     * [set] account: {UQ, NotNull, VARCHAR(256)} <br>
     * アカウント
     * @param account The value of the column 'account'. (basically NotNull if update: for the constraint)
     */
    public void setAccount(String account) {
        registerModifiedProperty("account");
        _account = account;
    }

    /**
     * [get] password: {NotNull, VARCHAR(256)} <br>
     * パスワード
     * @return The value of the column 'password'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {NotNull, VARCHAR(256)} <br>
     * パスワード
     * @param password The value of the column 'password'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] telno: {VARCHAR(12)} <br>
     * 電話番号
     * @return The value of the column 'telno'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelno() {
        checkSpecifiedProperty("telno");
        return _telno;
    }

    /**
     * [set] telno: {VARCHAR(12)} <br>
     * 電話番号
     * @param telno The value of the column 'telno'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelno(String telno) {
        registerModifiedProperty("telno");
        _telno = telno;
    }

    /**
     * [get] secret: {VARCHAR(16)} <br>
     * シークレット情報
     * @return The value of the column 'secret'. (NullAllowed even if selected: for no constraint)
     */
    public String getSecret() {
        checkSpecifiedProperty("secret");
        return _secret;
    }

    /**
     * [set] secret: {VARCHAR(16)} <br>
     * シークレット情報
     * @param secret The value of the column 'secret'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSecret(String secret) {
        registerModifiedProperty("secret");
        _secret = secret;
    }

    /**
     * [get] unlocked: {NotNull, BIT} <br>
     * ロック状態:true=unlock
     * @return The value of the column 'unlocked'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getUnlocked() {
        checkSpecifiedProperty("unlocked");
        return _unlocked;
    }

    /**
     * [set] unlocked: {NotNull, BIT} <br>
     * ロック状態:true=unlock
     * @param unlocked The value of the column 'unlocked'. (basically NotNull if update: for the constraint)
     */
    public void setUnlocked(Boolean unlocked) {
        registerModifiedProperty("unlocked");
        _unlocked = unlocked;
    }

    /**
     * [get] role: {VARCHAR(256)} <br>
     * ロール:"ROLE_ADMIN" or "ROLE_USER"
     * @return The value of the column 'role'. (NullAllowed even if selected: for no constraint)
     */
    public String getRole() {
        checkSpecifiedProperty("role");
        return _role;
    }

    /**
     * [set] role: {VARCHAR(256)} <br>
     * ロール:"ROLE_ADMIN" or "ROLE_USER"
     * @param role The value of the column 'role'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRole(String role) {
        registerModifiedProperty("role");
        _role = role;
    }

    /**
     * [get] two_factor_use: {NotNull, BIT, default=[0]} <br>
     * 2段階認証:true=有効
     * @return The value of the column 'two_factor_use'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getTwoFactorUse() {
        checkSpecifiedProperty("twoFactorUse");
        return _twoFactorUse;
    }

    /**
     * [set] two_factor_use: {NotNull, BIT, default=[0]} <br>
     * 2段階認証:true=有効
     * @param twoFactorUse The value of the column 'two_factor_use'. (basically NotNull if update: for the constraint)
     */
    public void setTwoFactorUse(Boolean twoFactorUse) {
        registerModifiedProperty("twoFactorUse");
        _twoFactorUse = twoFactorUse;
    }

    /**
     * [get] two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @return The value of the column 'two_factor_type'. (NullAllowed even if selected: for no constraint)
     */
    public String getTwoFactorType() {
        checkSpecifiedProperty("twoFactorType");
        return _twoFactorType;
    }

    /**
     * [set] two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @param twoFactorType The value of the column 'two_factor_type'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setTwoFactorType(String twoFactorType) {
        checkClassificationCode("two_factor_type", TblCDef.DefMeta.TwoFactorType, twoFactorType);
        registerModifiedProperty("twoFactorType");
        _twoFactorType = twoFactorType;
    }

    /**
     * [get] login_count: {NotNull, INT(10), default=[0]} <br>
     * ログイン回数
     * @return The value of the column 'login_count'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLoginCount() {
        checkSpecifiedProperty("loginCount");
        return _loginCount;
    }

    /**
     * [set] login_count: {NotNull, INT(10), default=[0]} <br>
     * ログイン回数
     * @param loginCount The value of the column 'login_count'. (basically NotNull if update: for the constraint)
     */
    public void setLoginCount(Integer loginCount) {
        registerModifiedProperty("loginCount");
        _loginCount = loginCount;
    }

    /**
     * [get] status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ステータス
     * @return The value of the column 'status'. (basically NotNull if selected: for the constraint)
     */
    public String getStatus() {
        checkSpecifiedProperty("status");
        return _status;
    }

    /**
     * [set] status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ステータス
     * @param status The value of the column 'status'. (basically NotNull if update: for the constraint)
     */
    protected void setStatus(String status) {
        checkClassificationCode("status", TblCDef.DefMeta.UserStatus, status);
        registerModifiedProperty("status");
        _status = status;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param twoFactorType The value of the column 'two_factor_type'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingTwoFactorType(String twoFactorType) {
        setTwoFactorType(twoFactorType);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param status The value of the column 'status'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingStatus(String status) {
        setStatus(status);
    }
}
