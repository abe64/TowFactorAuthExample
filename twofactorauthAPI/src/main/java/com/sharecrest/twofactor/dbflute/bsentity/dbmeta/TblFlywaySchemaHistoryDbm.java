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
 * The DB meta of flyway_schema_history. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TblFlywaySchemaHistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TblFlywaySchemaHistoryDbm _instance = new TblFlywaySchemaHistoryDbm();
    private TblFlywaySchemaHistoryDbm() {}
    public static TblFlywaySchemaHistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getInstalledRank(), (et, vl) -> ((TblFlywaySchemaHistory)et).setInstalledRank(cti(vl)), "installedRank");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getVersion(), (et, vl) -> ((TblFlywaySchemaHistory)et).setVersion((String)vl), "version");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getDescription(), (et, vl) -> ((TblFlywaySchemaHistory)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getType(), (et, vl) -> ((TblFlywaySchemaHistory)et).setType((String)vl), "type");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getScript(), (et, vl) -> ((TblFlywaySchemaHistory)et).setScript((String)vl), "script");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getChecksum(), (et, vl) -> ((TblFlywaySchemaHistory)et).setChecksum(cti(vl)), "checksum");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getInstalledBy(), (et, vl) -> ((TblFlywaySchemaHistory)et).setInstalledBy((String)vl), "installedBy");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getInstalledOn(), (et, vl) -> ((TblFlywaySchemaHistory)et).setInstalledOn(ctldt(vl)), "installedOn");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getExecutionTime(), (et, vl) -> ((TblFlywaySchemaHistory)et).setExecutionTime(cti(vl)), "executionTime");
        setupEpg(_epgMap, et -> ((TblFlywaySchemaHistory)et).getSuccess(), (et, vl) -> ((TblFlywaySchemaHistory)et).setSuccess((Boolean)vl), "success");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "flyway_schema_history";
    protected final String _tableDispName = "flyway_schema_history";
    protected final String _tablePropertyName = "flywaySchemaHistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("flyway_schema_history", _tableDbName);
    { _tableSqlName.xacceptFilter(TblDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInstalledRank = cci("installed_rank", "installed_rank", null, null, Integer.class, "installedRank", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersion = cci("version", "version", null, null, String.class, "version", null, false, false, false, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, String.class, "description", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnType = cci("type", "type", null, null, String.class, "type", null, false, false, true, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScript = cci("script", "script", null, null, String.class, "script", null, false, false, true, "VARCHAR", 1000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChecksum = cci("checksum", "checksum", null, null, Integer.class, "checksum", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstalledBy = cci("installed_by", "installed_by", null, null, String.class, "installedBy", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstalledOn = cci("installed_on", "installed_on", null, null, java.time.LocalDateTime.class, "installedOn", null, false, false, true, "TIMESTAMP", 19, 0, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExecutionTime = cci("execution_time", "execution_time", null, null, Integer.class, "executionTime", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuccess = cci("success", "success", null, null, Boolean.class, "success", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);

    /**
     * installed_rank: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstalledRank() { return _columnInstalledRank; }
    /**
     * version: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersion() { return _columnVersion; }
    /**
     * description: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * type: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnType() { return _columnType; }
    /**
     * script: {NotNull, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScript() { return _columnScript; }
    /**
     * checksum: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChecksum() { return _columnChecksum; }
    /**
     * installed_by: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstalledBy() { return _columnInstalledBy; }
    /**
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstalledOn() { return _columnInstalledOn; }
    /**
     * execution_time: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExecutionTime() { return _columnExecutionTime; }
    /**
     * success: {IX, NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuccess() { return _columnSuccess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInstalledRank());
        ls.add(columnVersion());
        ls.add(columnDescription());
        ls.add(columnType());
        ls.add(columnScript());
        ls.add(columnChecksum());
        ls.add(columnInstalledBy());
        ls.add(columnInstalledOn());
        ls.add(columnExecutionTime());
        ls.add(columnSuccess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnInstalledRank()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.sharecrest.twofactor.dbflute.exentity.TblFlywaySchemaHistory"; }
    public String getConditionBeanTypeName() { return "com.sharecrest.twofactor.dbflute.cbean.TblFlywaySchemaHistoryCB"; }
    public String getBehaviorTypeName() { return "com.sharecrest.twofactor.dbflute.exbhv.TblFlywaySchemaHistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TblFlywaySchemaHistory> getEntityType() { return TblFlywaySchemaHistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TblFlywaySchemaHistory newEntity() { return new TblFlywaySchemaHistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TblFlywaySchemaHistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TblFlywaySchemaHistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
