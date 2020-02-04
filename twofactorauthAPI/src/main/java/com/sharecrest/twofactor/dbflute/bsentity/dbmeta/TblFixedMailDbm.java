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
 * The DB meta of fixed_mail. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TblFixedMailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TblFixedMailDbm _instance = new TblFixedMailDbm();
    private TblFixedMailDbm() {}
    public static TblFixedMailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TblFixedMail)et).getFixedMailId(), (et, vl) -> ((TblFixedMail)et).setFixedMailId(cti(vl)), "fixedMailId");
        setupEpg(_epgMap, et -> ((TblFixedMail)et).getCode(), (et, vl) -> ((TblFixedMail)et).setCode((String)vl), "code");
        setupEpg(_epgMap, et -> ((TblFixedMail)et).getName(), (et, vl) -> ((TblFixedMail)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((TblFixedMail)et).getDescription(), (et, vl) -> ((TblFixedMail)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((TblFixedMail)et).getSubject(), (et, vl) -> ((TblFixedMail)et).setSubject((String)vl), "subject");
        setupEpg(_epgMap, et -> ((TblFixedMail)et).getBody(), (et, vl) -> ((TblFixedMail)et).setBody((String)vl), "body");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "fixed_mail";
    protected final String _tableDispName = "fixed_mail";
    protected final String _tablePropertyName = "fixedMail";
    protected final TableSqlName _tableSqlName = new TableSqlName("fixed_mail", _tableDbName);
    { _tableSqlName.xacceptFilter(TblDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFixedMailId = cci("fixed_mail_id", "fixed_mail_id", null, null, Integer.class, "fixedMailId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCode = cci("code", "code", null, null, String.class, "code", null, false, false, true, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, String.class, "description", null, false, false, false, "VARCHAR", 512, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubject = cci("subject", "subject", null, null, String.class, "subject", null, false, false, false, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBody = cci("body", "body", null, null, String.class, "body", null, false, false, false, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);

    /**
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedMailId() { return _columnFixedMailId; }
    /**
     * code: {UQ, NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode() { return _columnCode; }
    /**
     * name: {NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * description: {VARCHAR(512)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * subject: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubject() { return _columnSubject; }
    /**
     * body: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBody() { return _columnBody; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFixedMailId());
        ls.add(columnCode());
        ls.add(columnName());
        ls.add(columnDescription());
        ls.add(columnSubject());
        ls.add(columnBody());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFixedMailId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnCode()); }

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
    public String getEntityTypeName() { return "com.sharecrest.twofactor.dbflute.exentity.TblFixedMail"; }
    public String getConditionBeanTypeName() { return "com.sharecrest.twofactor.dbflute.cbean.TblFixedMailCB"; }
    public String getBehaviorTypeName() { return "com.sharecrest.twofactor.dbflute.exbhv.TblFixedMailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TblFixedMail> getEntityType() { return TblFixedMail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TblFixedMail newEntity() { return new TblFixedMail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TblFixedMail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TblFixedMail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
