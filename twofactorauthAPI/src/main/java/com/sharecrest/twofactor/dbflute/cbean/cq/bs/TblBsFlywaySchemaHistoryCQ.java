package com.sharecrest.twofactor.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.sharecrest.twofactor.dbflute.cbean.cq.ciq.*;
import com.sharecrest.twofactor.dbflute.cbean.*;
import com.sharecrest.twofactor.dbflute.cbean.cq.*;

/**
 * The base condition-query of flyway_schema_history.
 * @author DBFlute(AutoGenerator)
 */
public class TblBsFlywaySchemaHistoryCQ extends TblAbstractBsFlywaySchemaHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TblFlywaySchemaHistoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblBsFlywaySchemaHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from flyway_schema_history) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TblFlywaySchemaHistoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TblFlywaySchemaHistoryCIQ xcreateCIQ() {
        TblFlywaySchemaHistoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TblFlywaySchemaHistoryCIQ xnewCIQ() {
        return new TblFlywaySchemaHistoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join flyway_schema_history on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TblFlywaySchemaHistoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TblFlywaySchemaHistoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _installedRank;
    public ConditionValue xdfgetInstalledRank()
    { if (_installedRank == null) { _installedRank = nCV(); }
      return _installedRank; }
    protected ConditionValue xgetCValueInstalledRank() { return xdfgetInstalledRank(); }

    /**
     * Add order-by as ascend. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_InstalledRank_Asc() { regOBA("installed_rank"); return this; }

    /**
     * Add order-by as descend. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_InstalledRank_Desc() { regOBD("installed_rank"); return this; }

    protected ConditionValue _version;
    public ConditionValue xdfgetVersion()
    { if (_version == null) { _version = nCV(); }
      return _version; }
    protected ConditionValue xgetCValueVersion() { return xdfgetVersion(); }

    /**
     * Add order-by as ascend. <br>
     * version: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Version_Asc() { regOBA("version"); return this; }

    /**
     * Add order-by as descend. <br>
     * version: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Version_Desc() { regOBD("version"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * description: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br>
     * description: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

    protected ConditionValue _type;
    public ConditionValue xdfgetType()
    { if (_type == null) { _type = nCV(); }
      return _type; }
    protected ConditionValue xgetCValueType() { return xdfgetType(); }

    /**
     * Add order-by as ascend. <br>
     * type: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Type_Asc() { regOBA("type"); return this; }

    /**
     * Add order-by as descend. <br>
     * type: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Type_Desc() { regOBD("type"); return this; }

    protected ConditionValue _script;
    public ConditionValue xdfgetScript()
    { if (_script == null) { _script = nCV(); }
      return _script; }
    protected ConditionValue xgetCValueScript() { return xdfgetScript(); }

    /**
     * Add order-by as ascend. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Script_Asc() { regOBA("script"); return this; }

    /**
     * Add order-by as descend. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Script_Desc() { regOBD("script"); return this; }

    protected ConditionValue _checksum;
    public ConditionValue xdfgetChecksum()
    { if (_checksum == null) { _checksum = nCV(); }
      return _checksum; }
    protected ConditionValue xgetCValueChecksum() { return xdfgetChecksum(); }

    /**
     * Add order-by as ascend. <br>
     * checksum: {INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Checksum_Asc() { regOBA("checksum"); return this; }

    /**
     * Add order-by as descend. <br>
     * checksum: {INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Checksum_Desc() { regOBD("checksum"); return this; }

    protected ConditionValue _installedBy;
    public ConditionValue xdfgetInstalledBy()
    { if (_installedBy == null) { _installedBy = nCV(); }
      return _installedBy; }
    protected ConditionValue xgetCValueInstalledBy() { return xdfgetInstalledBy(); }

    /**
     * Add order-by as ascend. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_InstalledBy_Asc() { regOBA("installed_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_InstalledBy_Desc() { regOBD("installed_by"); return this; }

    protected ConditionValue _installedOn;
    public ConditionValue xdfgetInstalledOn()
    { if (_installedOn == null) { _installedOn = nCV(); }
      return _installedOn; }
    protected ConditionValue xgetCValueInstalledOn() { return xdfgetInstalledOn(); }

    /**
     * Add order-by as ascend. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_InstalledOn_Asc() { regOBA("installed_on"); return this; }

    /**
     * Add order-by as descend. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_InstalledOn_Desc() { regOBD("installed_on"); return this; }

    protected ConditionValue _executionTime;
    public ConditionValue xdfgetExecutionTime()
    { if (_executionTime == null) { _executionTime = nCV(); }
      return _executionTime; }
    protected ConditionValue xgetCValueExecutionTime() { return xdfgetExecutionTime(); }

    /**
     * Add order-by as ascend. <br>
     * execution_time: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_ExecutionTime_Asc() { regOBA("execution_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * execution_time: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_ExecutionTime_Desc() { regOBD("execution_time"); return this; }

    protected ConditionValue _success;
    public ConditionValue xdfgetSuccess()
    { if (_success == null) { _success = nCV(); }
      return _success; }
    protected ConditionValue xgetCValueSuccess() { return xdfgetSuccess(); }

    /**
     * Add order-by as ascend. <br>
     * success: {IX, NotNull, BIT}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Success_Asc() { regOBA("success"); return this; }

    /**
     * Add order-by as descend. <br>
     * success: {IX, NotNull, BIT}
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addOrderBy_Success_Desc() { regOBD("success"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public TblBsFlywaySchemaHistoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TblFlywaySchemaHistoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TblFlywaySchemaHistoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TblFlywaySchemaHistoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TblFlywaySchemaHistoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TblFlywaySchemaHistoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TblFlywaySchemaHistoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TblFlywaySchemaHistoryCQ> _myselfExistsMap;
    public Map<String, TblFlywaySchemaHistoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TblFlywaySchemaHistoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TblFlywaySchemaHistoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TblFlywaySchemaHistoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TblFlywaySchemaHistoryCB.class.getName(); }
    protected String xCQ() { return TblFlywaySchemaHistoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
