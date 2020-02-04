package com.sharecrest.twofactor.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.sharecrest.twofactor.dbflute.cbean.*;
import com.sharecrest.twofactor.dbflute.cbean.cq.bs.*;
import com.sharecrest.twofactor.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of flyway_schema_history.
 * @author DBFlute(AutoGenerator)
 */
public class TblFlywaySchemaHistoryCIQ extends TblAbstractBsFlywaySchemaHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TblBsFlywaySchemaHistoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblFlywaySchemaHistoryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, TblBsFlywaySchemaHistoryCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueInstalledRank() { return _myCQ.xdfgetInstalledRank(); }
    protected ConditionValue xgetCValueVersion() { return _myCQ.xdfgetVersion(); }
    protected ConditionValue xgetCValueDescription() { return _myCQ.xdfgetDescription(); }
    protected ConditionValue xgetCValueType() { return _myCQ.xdfgetType(); }
    protected ConditionValue xgetCValueScript() { return _myCQ.xdfgetScript(); }
    protected ConditionValue xgetCValueChecksum() { return _myCQ.xdfgetChecksum(); }
    protected ConditionValue xgetCValueInstalledBy() { return _myCQ.xdfgetInstalledBy(); }
    protected ConditionValue xgetCValueInstalledOn() { return _myCQ.xdfgetInstalledOn(); }
    protected ConditionValue xgetCValueExecutionTime() { return _myCQ.xdfgetExecutionTime(); }
    protected ConditionValue xgetCValueSuccess() { return _myCQ.xdfgetSuccess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(TblFlywaySchemaHistoryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TblFlywaySchemaHistoryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TblFlywaySchemaHistoryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TblFlywaySchemaHistoryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TblFlywaySchemaHistoryCB.class.getName(); }
    protected String xinCQ() { return TblFlywaySchemaHistoryCQ.class.getName(); }
}
