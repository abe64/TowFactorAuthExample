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
 * The base condition-query of option_data.
 * @author DBFlute(AutoGenerator)
 */
public class TblBsOptionDataCQ extends TblAbstractBsOptionDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TblOptionDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblBsOptionDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from option_data) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TblOptionDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TblOptionDataCIQ xcreateCIQ() {
        TblOptionDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TblOptionDataCIQ xnewCIQ() {
        return new TblOptionDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join option_data on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TblOptionDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TblOptionDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _optionDataId;
    public ConditionValue xdfgetOptionDataId()
    { if (_optionDataId == null) { _optionDataId = nCV(); }
      return _optionDataId; }
    protected ConditionValue xgetCValueOptionDataId() { return xdfgetOptionDataId(); }

    /**
     * Add order-by as ascend. <br>
     * option_data_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_OptionDataId_Asc() { regOBA("option_data_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * option_data_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_OptionDataId_Desc() { regOBD("option_data_id"); return this; }

    protected ConditionValue _keyCode;
    public ConditionValue xdfgetKeyCode()
    { if (_keyCode == null) { _keyCode = nCV(); }
      return _keyCode; }
    protected ConditionValue xgetCValueKeyCode() { return xdfgetKeyCode(); }

    /**
     * Add order-by as ascend. <br>
     * key_code: {UQ, NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_KeyCode_Asc() { regOBA("key_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * key_code: {UQ, NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_KeyCode_Desc() { regOBD("key_code"); return this; }

    protected ConditionValue _value;
    public ConditionValue xdfgetValue()
    { if (_value == null) { _value = nCV(); }
      return _value; }
    protected ConditionValue xgetCValueValue() { return xdfgetValue(); }

    /**
     * Add order-by as ascend. <br>
     * value: {VARCHAR(512)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_Value_Asc() { regOBA("value"); return this; }

    /**
     * Add order-by as descend. <br>
     * value: {VARCHAR(512)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_Value_Desc() { regOBD("value"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * description: {VARCHAR(512)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br>
     * description: {VARCHAR(512)}
     * @return this. (NotNull)
     */
    public TblBsOptionDataCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

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
    public TblBsOptionDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public TblBsOptionDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TblOptionDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TblOptionDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TblOptionDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TblOptionDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TblOptionDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TblOptionDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TblOptionDataCQ> _myselfExistsMap;
    public Map<String, TblOptionDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TblOptionDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TblOptionDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TblOptionDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TblOptionDataCB.class.getName(); }
    protected String xCQ() { return TblOptionDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
