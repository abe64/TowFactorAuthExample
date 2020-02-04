package com.sharecrest.twofactor.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.sharecrest.twofactor.dbflute.allcommon.TblDBMetaInstanceHandler;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The entity of option_data as TABLE. <br>
 * オプション
 * <pre>
 * [primary-key]
 *     option_data_id
 *
 * [column]
 *     option_data_id, key_code, value, description
 *
 * [sequence]
 *     
 *
 * [identity]
 *     option_data_id
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
 * Integer optionDataId = entity.getOptionDataId();
 * String keyCode = entity.getKeyCode();
 * String value = entity.getValue();
 * String description = entity.getDescription();
 * entity.setOptionDataId(optionDataId);
 * entity.setKeyCode(keyCode);
 * entity.setValue(value);
 * entity.setDescription(description);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblBsOptionData extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** option_data_id: {PK, ID, NotNull, INT(10)} */
    protected Integer _optionDataId;

    /** key_code: {UQ, NotNull, VARCHAR(256)} */
    protected String _keyCode;

    /** value: {VARCHAR(512)} */
    protected String _value;

    /** description: {VARCHAR(512)} */
    protected String _description;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return TblDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "option_data";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_optionDataId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param keyCode : UQ, NotNull, VARCHAR(256). (NotNull)
     */
    public void uniqueBy(String keyCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("keyCode");
        setKeyCode(keyCode);
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
        if (obj instanceof TblBsOptionData) {
            TblBsOptionData other = (TblBsOptionData)obj;
            if (!xSV(_optionDataId, other._optionDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _optionDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_optionDataId));
        sb.append(dm).append(xfND(_keyCode));
        sb.append(dm).append(xfND(_value));
        sb.append(dm).append(xfND(_description));
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
    public TblOptionData clone() {
        return (TblOptionData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] option_data_id: {PK, ID, NotNull, INT(10)} <br>
     * オプションID
     * @return The value of the column 'option_data_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOptionDataId() {
        checkSpecifiedProperty("optionDataId");
        return _optionDataId;
    }

    /**
     * [set] option_data_id: {PK, ID, NotNull, INT(10)} <br>
     * オプションID
     * @param optionDataId The value of the column 'option_data_id'. (basically NotNull if update: for the constraint)
     */
    public void setOptionDataId(Integer optionDataId) {
        registerModifiedProperty("optionDataId");
        _optionDataId = optionDataId;
    }

    /**
     * [get] key_code: {UQ, NotNull, VARCHAR(256)} <br>
     * キーコード
     * @return The value of the column 'key_code'. (basically NotNull if selected: for the constraint)
     */
    public String getKeyCode() {
        checkSpecifiedProperty("keyCode");
        return _keyCode;
    }

    /**
     * [set] key_code: {UQ, NotNull, VARCHAR(256)} <br>
     * キーコード
     * @param keyCode The value of the column 'key_code'. (basically NotNull if update: for the constraint)
     */
    public void setKeyCode(String keyCode) {
        registerModifiedProperty("keyCode");
        _keyCode = keyCode;
    }

    /**
     * [get] value: {VARCHAR(512)} <br>
     * データ
     * @return The value of the column 'value'. (NullAllowed even if selected: for no constraint)
     */
    public String getValue() {
        checkSpecifiedProperty("value");
        return _value;
    }

    /**
     * [set] value: {VARCHAR(512)} <br>
     * データ
     * @param value The value of the column 'value'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValue(String value) {
        registerModifiedProperty("value");
        _value = value;
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
}
