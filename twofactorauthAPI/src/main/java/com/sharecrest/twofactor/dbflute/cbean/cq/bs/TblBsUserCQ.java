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
 * The base condition-query of user.
 * @author DBFlute(AutoGenerator)
 */
public class TblBsUserCQ extends TblAbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TblUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TblUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TblUserCIQ xcreateCIQ() {
        TblUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TblUserCIQ xnewCIQ() {
        return new TblUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TblUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TblUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

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
    public TblBsUserCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _account;
    public ConditionValue xdfgetAccount()
    { if (_account == null) { _account = nCV(); }
      return _account; }
    protected ConditionValue xgetCValueAccount() { return xdfgetAccount(); }

    /**
     * Add order-by as ascend. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Account_Asc() { regOBA("account"); return this; }

    /**
     * Add order-by as descend. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Account_Desc() { regOBD("account"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * password: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Password_Asc() { regOBA("password"); return this; }

    /**
     * Add order-by as descend. <br>
     * password: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Password_Desc() { regOBD("password"); return this; }

    protected ConditionValue _telno;
    public ConditionValue xdfgetTelno()
    { if (_telno == null) { _telno = nCV(); }
      return _telno; }
    protected ConditionValue xgetCValueTelno() { return xdfgetTelno(); }

    /**
     * Add order-by as ascend. <br>
     * telno: {VARCHAR(12)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Telno_Asc() { regOBA("telno"); return this; }

    /**
     * Add order-by as descend. <br>
     * telno: {VARCHAR(12)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Telno_Desc() { regOBD("telno"); return this; }

    protected ConditionValue _secret;
    public ConditionValue xdfgetSecret()
    { if (_secret == null) { _secret = nCV(); }
      return _secret; }
    protected ConditionValue xgetCValueSecret() { return xdfgetSecret(); }

    /**
     * Add order-by as ascend. <br>
     * secret: {VARCHAR(16)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Secret_Asc() { regOBA("secret"); return this; }

    /**
     * Add order-by as descend. <br>
     * secret: {VARCHAR(16)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Secret_Desc() { regOBD("secret"); return this; }

    protected ConditionValue _unlocked;
    public ConditionValue xdfgetUnlocked()
    { if (_unlocked == null) { _unlocked = nCV(); }
      return _unlocked; }
    protected ConditionValue xgetCValueUnlocked() { return xdfgetUnlocked(); }

    /**
     * Add order-by as ascend. <br>
     * unlocked: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Unlocked_Asc() { regOBA("unlocked"); return this; }

    /**
     * Add order-by as descend. <br>
     * unlocked: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Unlocked_Desc() { regOBD("unlocked"); return this; }

    protected ConditionValue _role;
    public ConditionValue xdfgetRole()
    { if (_role == null) { _role = nCV(); }
      return _role; }
    protected ConditionValue xgetCValueRole() { return xdfgetRole(); }

    /**
     * Add order-by as ascend. <br>
     * role: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Role_Asc() { regOBA("role"); return this; }

    /**
     * Add order-by as descend. <br>
     * role: {VARCHAR(256)}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Role_Desc() { regOBD("role"); return this; }

    protected ConditionValue _twoFactorUse;
    public ConditionValue xdfgetTwoFactorUse()
    { if (_twoFactorUse == null) { _twoFactorUse = nCV(); }
      return _twoFactorUse; }
    protected ConditionValue xgetCValueTwoFactorUse() { return xdfgetTwoFactorUse(); }

    /**
     * Add order-by as ascend. <br>
     * two_factor_use: {NotNull, BIT, default=[0]}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_TwoFactorUse_Asc() { regOBA("two_factor_use"); return this; }

    /**
     * Add order-by as descend. <br>
     * two_factor_use: {NotNull, BIT, default=[0]}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_TwoFactorUse_Desc() { regOBD("two_factor_use"); return this; }

    protected ConditionValue _twoFactorType;
    public ConditionValue xdfgetTwoFactorType()
    { if (_twoFactorType == null) { _twoFactorType = nCV(); }
      return _twoFactorType; }
    protected ConditionValue xgetCValueTwoFactorType() { return xdfgetTwoFactorType(); }

    /**
     * Add order-by as ascend. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_TwoFactorType_Asc() { regOBA("two_factor_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_TwoFactorType_Desc() { regOBD("two_factor_type"); return this; }

    protected ConditionValue _loginCount;
    public ConditionValue xdfgetLoginCount()
    { if (_loginCount == null) { _loginCount = nCV(); }
      return _loginCount; }
    protected ConditionValue xgetCValueLoginCount() { return xdfgetLoginCount(); }

    /**
     * Add order-by as ascend. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_LoginCount_Asc() { regOBA("login_count"); return this; }

    /**
     * Add order-by as descend. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_LoginCount_Desc() { regOBD("login_count"); return this; }

    protected ConditionValue _status;
    public ConditionValue xdfgetStatus()
    { if (_status == null) { _status = nCV(); }
      return _status; }
    protected ConditionValue xgetCValueStatus() { return xdfgetStatus(); }

    /**
     * Add order-by as ascend. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Status_Asc() { regOBA("status"); return this; }

    /**
     * Add order-by as descend. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @return this. (NotNull)
     */
    public TblBsUserCQ addOrderBy_Status_Desc() { regOBD("status"); return this; }

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
    public TblBsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public TblBsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TblUserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TblUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TblUserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TblUserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TblUserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TblUserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TblUserCQ> _myselfExistsMap;
    public Map<String, TblUserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TblUserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TblUserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TblUserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TblUserCB.class.getName(); }
    protected String xCQ() { return TblUserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
