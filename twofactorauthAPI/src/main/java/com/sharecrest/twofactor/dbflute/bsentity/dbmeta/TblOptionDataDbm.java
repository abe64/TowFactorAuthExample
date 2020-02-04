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
 * The DB meta of option_data. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TblOptionDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TblOptionDataDbm _instance = new TblOptionDataDbm();
    private TblOptionDataDbm() {}
    public static TblOptionDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TblOptionData)et).getOptionDataId(), (et, vl) -> ((TblOptionData)et).setOptionDataId(cti(vl)), "optionDataId");
        setupEpg(_epgMap, et -> ((TblOptionData)et).getKeyCode(), (et, vl) -> ((TblOptionData)et).setKeyCode((String)vl), "keyCode");
        setupEpg(_epgMap, et -> ((TblOptionData)et).getValue(), (et, vl) -> ((TblOptionData)et).setValue((String)vl), "value");
        setupEpg(_epgMap, et -> ((TblOptionData)et).getDescription(), (et, vl) -> ((TblOptionData)et).setDescription((String)vl), "description");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "option_data";
    protected final String _tableDispName = "option_data";
    protected final String _tablePropertyName = "optionData";
    protected final TableSqlName _tableSqlName = new TableSqlName("option_data", _tableDbName);
    { _tableSqlName.xacceptFilter(TblDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOptionDataId = cci("option_data_id", "option_data_id", null, null, Integer.class, "optionDataId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKeyCode = cci("key_code", "key_code", null, null, String.class, "keyCode", null, false, false, true, "VARCHAR", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValue = cci("value", "value", null, null, String.class, "value", null, false, false, false, "VARCHAR", 512, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, String.class, "description", null, false, false, false, "VARCHAR", 512, 0, null, null, false, null, null, null, null, null, false);

    /**
     * option_data_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOptionDataId() { return _columnOptionDataId; }
    /**
     * key_code: {UQ, NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKeyCode() { return _columnKeyCode; }
    /**
     * value: {VARCHAR(512)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValue() { return _columnValue; }
    /**
     * description: {VARCHAR(512)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnOptionDataId());
        ls.add(columnKeyCode());
        ls.add(columnValue());
        ls.add(columnDescription());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnOptionDataId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnKeyCode()); }

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
    public String getEntityTypeName() { return "com.sharecrest.twofactor.dbflute.exentity.TblOptionData"; }
    public String getConditionBeanTypeName() { return "com.sharecrest.twofactor.dbflute.cbean.TblOptionDataCB"; }
    public String getBehaviorTypeName() { return "com.sharecrest.twofactor.dbflute.exbhv.TblOptionDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TblOptionData> getEntityType() { return TblOptionData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TblOptionData newEntity() { return new TblOptionData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TblOptionData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TblOptionData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
