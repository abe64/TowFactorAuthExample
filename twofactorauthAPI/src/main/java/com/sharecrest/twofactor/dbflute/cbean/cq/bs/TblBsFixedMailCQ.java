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
 * The base condition-query of fixed_mail.
 * @author DBFlute(AutoGenerator)
 */
public class TblBsFixedMailCQ extends TblAbstractBsFixedMailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TblFixedMailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblBsFixedMailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from fixed_mail) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TblFixedMailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TblFixedMailCIQ xcreateCIQ() {
        TblFixedMailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TblFixedMailCIQ xnewCIQ() {
        return new TblFixedMailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join fixed_mail on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TblFixedMailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TblFixedMailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fixedMailId;
    public ConditionValue xdfgetFixedMailId()
    { if (_fixedMailId == null) { _fixedMailId = nCV(); }
      return _fixedMailId; }
    protected ConditionValue xgetCValueFixedMailId() { return xdfgetFixedMailId(); }

    /**
     * Add order-by as ascend. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_FixedMailId_Asc() { regOBA("fixed_mail_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_FixedMailId_Desc() { regOBD("fixed_mail_id"); return this; }

    protected ConditionValue _code;
    public ConditionValue xdfgetCode()
    { if (_code == null) { _code = nCV(); }
      return _code; }
    protected ConditionValue xgetCValueCode() { return xdfgetCode(); }

    /**
     * Add order-by as ascend. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Code_Asc() { regOBA("code"); return this; }

    /**
     * Add order-by as descend. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Code_Desc() { regOBD("code"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * name: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

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
    public TblBsFixedMailCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br>
     * description: {VARCHAR(512)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

    protected ConditionValue _subject;
    public ConditionValue xdfgetSubject()
    { if (_subject == null) { _subject = nCV(); }
      return _subject; }
    protected ConditionValue xgetCValueSubject() { return xdfgetSubject(); }

    /**
     * Add order-by as ascend. <br>
     * subject: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Subject_Asc() { regOBA("subject"); return this; }

    /**
     * Add order-by as descend. <br>
     * subject: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Subject_Desc() { regOBD("subject"); return this; }

    protected ConditionValue _body;
    public ConditionValue xdfgetBody()
    { if (_body == null) { _body = nCV(); }
      return _body; }
    protected ConditionValue xgetCValueBody() { return xdfgetBody(); }

    /**
     * Add order-by as ascend. <br>
     * body: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Body_Asc() { regOBA("body"); return this; }

    /**
     * Add order-by as descend. <br>
     * body: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public TblBsFixedMailCQ addOrderBy_Body_Desc() { regOBD("body"); return this; }

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
    public TblBsFixedMailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public TblBsFixedMailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TblFixedMailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TblFixedMailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TblFixedMailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TblFixedMailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TblFixedMailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TblFixedMailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TblFixedMailCQ> _myselfExistsMap;
    public Map<String, TblFixedMailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TblFixedMailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TblFixedMailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TblFixedMailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TblFixedMailCB.class.getName(); }
    protected String xCQ() { return TblFixedMailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
