package com.sharecrest.twofactor.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.sharecrest.twofactor.dbflute.allcommon.*;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The DB meta of user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TblUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TblUserDbm _instance = new TblUserDbm();
    private TblUserDbm() {}
    public static TblUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return TblDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return TblDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return TblDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return TblDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TblUser)et).getUserId(), (et, vl) -> ((TblUser)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((TblUser)et).getName(), (et, vl) -> ((TblUser)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((TblUser)et).getAccount(), (et, vl) -> ((TblUser)et).setAccount((String)vl), "account");
        setupEpg(_epgMap, et -> ((TblUser)et).getPassword(), (et, vl) -> ((TblUser)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((TblUser)et).getTelno(), (et, vl) -> ((TblUser)et).setTelno((String)vl), "telno");
        setupEpg(_epgMap, et -> ((TblUser)et).getSecret(), (et, vl) -> ((TblUser)et).setSecret((String)vl), "secret");
        setupEpg(_epgMap, et -> ((TblUser)et).getUnlocked(), (et, vl) -> ((TblUser)et).setUnlocked((Boolean)vl), "unlocked");
        setupEpg(_epgMap, et -> ((TblUser)et).getRole(), (et, vl) -> ((TblUser)et).setRole((String)vl), "role");
        setupEpg(_epgMap, et -> ((TblUser)et).getTwoFactorUse(), (et, vl) -> ((TblUser)et).setTwoFactorUse((Boolean)vl), "twoFactorUse");
        setupEpg(_epgMap, et -> ((TblUser)et).getTwoFactorType(), (et, vl) -> {
            TblCDef.TwoFactorType cls = (TblCDef.TwoFactorType)gcls(et, columnTwoFactorType(), vl);
            if (cls != null) {
                ((TblUser)et).setTwoFactorTypeAsTwoFactorType(cls);
            } else {
                ((TblUser)et).mynativeMappingTwoFactorType((String)vl);
            }
        }, "twoFactorType");
        setupEpg(_epgMap, et -> ((TblUser)et).getLoginCount(), (et, vl) -> ((TblUser)et).setLoginCount(cti(vl)), "loginCount");
        setupEpg(_epgMap, et -> ((TblUser)et).getStatus(), (et, vl) -> {
            TblCDef.UserStatus cls = (TblCDef.UserStatus)gcls(et, columnStatus(), vl);
            if (cls != null) {
                ((TblUser)et).setStatusAsUserStatus(cls);
            } else {
                ((TblUser)et).mynativeMappingStatus((String)vl);
            }
        }, "status");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user";
    protected final String _tableDispName = "user";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("user", _tableDbName);
    { _tableSqlName.xacceptFilter(TblDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccount = cci("account", "account", null, null, String.class, "account", null, false, false, true, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("password", "password", null, null, String.class, "password", null, false, false, true, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelno = cci("telno", "telno", null, null, String.class, "telno", null, false, false, false, "VARCHAR", 12, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSecret = cci("secret", "secret", null, null, String.class, "secret", null, false, false, false, "VARCHAR", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnlocked = cci("unlocked", "unlocked", null, null, Boolean.class, "unlocked", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRole = cci("role", "role", null, null, String.class, "role", null, false, false, false, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTwoFactorUse = cci("two_factor_use", "two_factor_use", null, null, Boolean.class, "twoFactorUse", null, false, false, true, "BIT", null, null, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTwoFactorType = cci("two_factor_type", "two_factor_type", null, null, String.class, "twoFactorType", null, false, false, false, "VARCHAR", 32, 0, null, null, false, null, null, null, null, TblCDef.DefMeta.TwoFactorType, false);
    protected final ColumnInfo _columnLoginCount = cci("login_count", "login_count", null, null, Integer.class, "loginCount", null, false, false, true, "INT", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatus = cci("status", "status", null, null, String.class, "status", null, false, false, true, "VARCHAR", 32, 0, null, null, false, null, null, null, null, TblCDef.DefMeta.UserStatus, false);

    /**
     * user_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * name: {NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * account: {UQ, NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccount() { return _columnAccount; }
    /**
     * password: {NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * telno: {VARCHAR(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelno() { return _columnTelno; }
    /**
     * secret: {VARCHAR(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecret() { return _columnSecret; }
    /**
     * unlocked: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnlocked() { return _columnUnlocked; }
    /**
     * role: {VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRole() { return _columnRole; }
    /**
     * two_factor_use: {NotNull, BIT, default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwoFactorUse() { return _columnTwoFactorUse; }
    /**
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwoFactorType() { return _columnTwoFactorType; }
    /**
     * login_count: {NotNull, INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginCount() { return _columnLoginCount; }
    /**
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatus() { return _columnStatus; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnName());
        ls.add(columnAccount());
        ls.add(columnPassword());
        ls.add(columnTelno());
        ls.add(columnSecret());
        ls.add(columnUnlocked());
        ls.add(columnRole());
        ls.add(columnTwoFactorUse());
        ls.add(columnTwoFactorType());
        ls.add(columnLoginCount());
        ls.add(columnStatus());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnAccount()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.sharecrest.twofactor.dbflute.exentity.TblUser"; }
    public String getConditionBeanTypeName() { return "com.sharecrest.twofactor.dbflute.cbean.TblUserCB"; }
    public String getBehaviorTypeName() { return "com.sharecrest.twofactor.dbflute.exbhv.TblUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TblUser> getEntityType() { return TblUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TblUser newEntity() { return new TblUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TblUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TblUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
