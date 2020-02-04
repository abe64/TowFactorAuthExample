package com.sharecrest.twofactor.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.sharecrest.twofactor.dbflute.allcommon.TblDBMetaInstanceHandler;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The entity of flyway_schema_history as TABLE. <br>
 * <pre>
 * [primary-key]
 *     installed_rank
 *
 * [column]
 *     installed_rank, version, description, type, script, checksum, installed_by, installed_on, execution_time, success
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * Integer installedRank = entity.getInstalledRank();
 * String version = entity.getVersion();
 * String description = entity.getDescription();
 * String type = entity.getType();
 * String script = entity.getScript();
 * Integer checksum = entity.getChecksum();
 * String installedBy = entity.getInstalledBy();
 * java.time.LocalDateTime installedOn = entity.getInstalledOn();
 * Integer executionTime = entity.getExecutionTime();
 * Boolean success = entity.getSuccess();
 * entity.setInstalledRank(installedRank);
 * entity.setVersion(version);
 * entity.setDescription(description);
 * entity.setType(type);
 * entity.setScript(script);
 * entity.setChecksum(checksum);
 * entity.setInstalledBy(installedBy);
 * entity.setInstalledOn(installedOn);
 * entity.setExecutionTime(executionTime);
 * entity.setSuccess(success);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblBsFlywaySchemaHistory extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** installed_rank: {PK, NotNull, INT(10)} */
    protected Integer _installedRank;

    /** version: {VARCHAR(50)} */
    protected String _version;

    /** description: {NotNull, VARCHAR(200)} */
    protected String _description;

    /** type: {NotNull, VARCHAR(20)} */
    protected String _type;

    /** script: {NotNull, VARCHAR(1000)} */
    protected String _script;

    /** checksum: {INT(10)} */
    protected Integer _checksum;

    /** installed_by: {NotNull, VARCHAR(100)} */
    protected String _installedBy;

    /** installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _installedOn;

    /** execution_time: {NotNull, INT(10)} */
    protected Integer _executionTime;

    /** success: {IX, NotNull, BIT} */
    protected Boolean _success;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return TblDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "flyway_schema_history";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_installedRank == null) { return false; }
        return true;
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
        if (obj instanceof TblBsFlywaySchemaHistory) {
            TblBsFlywaySchemaHistory other = (TblBsFlywaySchemaHistory)obj;
            if (!xSV(_installedRank, other._installedRank)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _installedRank);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_installedRank));
        sb.append(dm).append(xfND(_version));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_type));
        sb.append(dm).append(xfND(_script));
        sb.append(dm).append(xfND(_checksum));
        sb.append(dm).append(xfND(_installedBy));
        sb.append(dm).append(xfND(_installedOn));
        sb.append(dm).append(xfND(_executionTime));
        sb.append(dm).append(xfND(_success));
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
    public TblFlywaySchemaHistory clone() {
        return (TblFlywaySchemaHistory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] installed_rank: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'installed_rank'. (basically NotNull if selected: for the constraint)
     */
    public Integer getInstalledRank() {
        checkSpecifiedProperty("installedRank");
        return _installedRank;
    }

    /**
     * [set] installed_rank: {PK, NotNull, INT(10)} <br>
     * @param installedRank The value of the column 'installed_rank'. (basically NotNull if update: for the constraint)
     */
    public void setInstalledRank(Integer installedRank) {
        registerModifiedProperty("installedRank");
        _installedRank = installedRank;
    }

    /**
     * [get] version: {VARCHAR(50)} <br>
     * @return The value of the column 'version'. (NullAllowed even if selected: for no constraint)
     */
    public String getVersion() {
        checkSpecifiedProperty("version");
        return _version;
    }

    /**
     * [set] version: {VARCHAR(50)} <br>
     * @param version The value of the column 'version'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersion(String version) {
        registerModifiedProperty("version");
        _version = version;
    }

    /**
     * [get] description: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'description'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] description: {NotNull, VARCHAR(200)} <br>
     * @param description The value of the column 'description'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] type: {NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'type'. (basically NotNull if selected: for the constraint)
     */
    public String getType() {
        checkSpecifiedProperty("type");
        return _type;
    }

    /**
     * [set] type: {NotNull, VARCHAR(20)} <br>
     * @param type The value of the column 'type'. (basically NotNull if update: for the constraint)
     */
    public void setType(String type) {
        registerModifiedProperty("type");
        _type = type;
    }

    /**
     * [get] script: {NotNull, VARCHAR(1000)} <br>
     * @return The value of the column 'script'. (basically NotNull if selected: for the constraint)
     */
    public String getScript() {
        checkSpecifiedProperty("script");
        return _script;
    }

    /**
     * [set] script: {NotNull, VARCHAR(1000)} <br>
     * @param script The value of the column 'script'. (basically NotNull if update: for the constraint)
     */
    public void setScript(String script) {
        registerModifiedProperty("script");
        _script = script;
    }

    /**
     * [get] checksum: {INT(10)} <br>
     * @return The value of the column 'checksum'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getChecksum() {
        checkSpecifiedProperty("checksum");
        return _checksum;
    }

    /**
     * [set] checksum: {INT(10)} <br>
     * @param checksum The value of the column 'checksum'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChecksum(Integer checksum) {
        registerModifiedProperty("checksum");
        _checksum = checksum;
    }

    /**
     * [get] installed_by: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'installed_by'. (basically NotNull if selected: for the constraint)
     */
    public String getInstalledBy() {
        checkSpecifiedProperty("installedBy");
        return _installedBy;
    }

    /**
     * [set] installed_by: {NotNull, VARCHAR(100)} <br>
     * @param installedBy The value of the column 'installed_by'. (basically NotNull if update: for the constraint)
     */
    public void setInstalledBy(String installedBy) {
        registerModifiedProperty("installedBy");
        _installedBy = installedBy;
    }

    /**
     * [get] installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'installed_on'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getInstalledOn() {
        checkSpecifiedProperty("installedOn");
        return _installedOn;
    }

    /**
     * [set] installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param installedOn The value of the column 'installed_on'. (basically NotNull if update: for the constraint)
     */
    public void setInstalledOn(java.time.LocalDateTime installedOn) {
        registerModifiedProperty("installedOn");
        _installedOn = installedOn;
    }

    /**
     * [get] execution_time: {NotNull, INT(10)} <br>
     * @return The value of the column 'execution_time'. (basically NotNull if selected: for the constraint)
     */
    public Integer getExecutionTime() {
        checkSpecifiedProperty("executionTime");
        return _executionTime;
    }

    /**
     * [set] execution_time: {NotNull, INT(10)} <br>
     * @param executionTime The value of the column 'execution_time'. (basically NotNull if update: for the constraint)
     */
    public void setExecutionTime(Integer executionTime) {
        registerModifiedProperty("executionTime");
        _executionTime = executionTime;
    }

    /**
     * [get] success: {IX, NotNull, BIT} <br>
     * @return The value of the column 'success'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getSuccess() {
        checkSpecifiedProperty("success");
        return _success;
    }

    /**
     * [set] success: {IX, NotNull, BIT} <br>
     * @param success The value of the column 'success'. (basically NotNull if update: for the constraint)
     */
    public void setSuccess(Boolean success) {
        registerModifiedProperty("success");
        _success = success;
    }
}
