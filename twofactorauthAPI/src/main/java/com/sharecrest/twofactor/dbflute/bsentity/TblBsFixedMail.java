package com.sharecrest.twofactor.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.sharecrest.twofactor.dbflute.allcommon.TblDBMetaInstanceHandler;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The entity of fixed_mail as TABLE. <br>
 * 定型メール
 * <pre>
 * [primary-key]
 *     fixed_mail_id
 *
 * [column]
 *     fixed_mail_id, code, name, description, subject, body
 *
 * [sequence]
 *     
 *
 * [identity]
 *     fixed_mail_id
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
 * Integer fixedMailId = entity.getFixedMailId();
 * String code = entity.getCode();
 * String name = entity.getName();
 * String description = entity.getDescription();
 * String subject = entity.getSubject();
 * String body = entity.getBody();
 * entity.setFixedMailId(fixedMailId);
 * entity.setCode(code);
 * entity.setName(name);
 * entity.setDescription(description);
 * entity.setSubject(subject);
 * entity.setBody(body);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblBsFixedMail extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** fixed_mail_id: {PK, ID, NotNull, INT(10)} */
    protected Integer _fixedMailId;

    /** code: {UQ, NotNull, VARCHAR(256)} */
    protected String _code;

    /** name: {NotNull, VARCHAR(256)} */
    protected String _name;

    /** description: {VARCHAR(512)} */
    protected String _description;

    /** subject: {TEXT(65535)} */
    protected String _subject;

    /** body: {TEXT(65535)} */
    protected String _body;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return TblDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "fixed_mail";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fixedMailId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param code : UQ, NotNull, VARCHAR(256). (NotNull)
     */
    public void uniqueBy(String code) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("code");
        setCode(code);
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
        if (obj instanceof TblBsFixedMail) {
            TblBsFixedMail other = (TblBsFixedMail)obj;
            if (!xSV(_fixedMailId, other._fixedMailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fixedMailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fixedMailId));
        sb.append(dm).append(xfND(_code));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_subject));
        sb.append(dm).append(xfND(_body));
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
    public TblFixedMail clone() {
        return (TblFixedMail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fixed_mail_id: {PK, ID, NotNull, INT(10)} <br>
     * 定型メールID
     * @return The value of the column 'fixed_mail_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFixedMailId() {
        checkSpecifiedProperty("fixedMailId");
        return _fixedMailId;
    }

    /**
     * [set] fixed_mail_id: {PK, ID, NotNull, INT(10)} <br>
     * 定型メールID
     * @param fixedMailId The value of the column 'fixed_mail_id'. (basically NotNull if update: for the constraint)
     */
    public void setFixedMailId(Integer fixedMailId) {
        registerModifiedProperty("fixedMailId");
        _fixedMailId = fixedMailId;
    }

    /**
     * [get] code: {UQ, NotNull, VARCHAR(256)} <br>
     * 定型メールコード
     * @return The value of the column 'code'. (basically NotNull if selected: for the constraint)
     */
    public String getCode() {
        checkSpecifiedProperty("code");
        return _code;
    }

    /**
     * [set] code: {UQ, NotNull, VARCHAR(256)} <br>
     * 定型メールコード
     * @param code The value of the column 'code'. (basically NotNull if update: for the constraint)
     */
    public void setCode(String code) {
        registerModifiedProperty("code");
        _code = code;
    }

    /**
     * [get] name: {NotNull, VARCHAR(256)} <br>
     * 定型メール名
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, VARCHAR(256)} <br>
     * 定型メール名
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] description: {VARCHAR(512)} <br>
     * 説明
     * @return The value of the column 'description'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] description: {VARCHAR(512)} <br>
     * 説明
     * @param description The value of the column 'description'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] subject: {TEXT(65535)} <br>
     * 件名
     * @return The value of the column 'subject'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubject() {
        checkSpecifiedProperty("subject");
        return _subject;
    }

    /**
     * [set] subject: {TEXT(65535)} <br>
     * 件名
     * @param subject The value of the column 'subject'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubject(String subject) {
        registerModifiedProperty("subject");
        _subject = subject;
    }

    /**
     * [get] body: {TEXT(65535)} <br>
     * 本文
     * @return The value of the column 'body'. (NullAllowed even if selected: for no constraint)
     */
    public String getBody() {
        checkSpecifiedProperty("body");
        return _body;
    }

    /**
     * [set] body: {TEXT(65535)} <br>
     * 本文
     * @param body The value of the column 'body'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBody(String body) {
        registerModifiedProperty("body");
        _body = body;
    }
}
