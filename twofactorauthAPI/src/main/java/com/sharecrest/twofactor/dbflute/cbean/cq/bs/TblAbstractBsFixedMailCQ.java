package com.sharecrest.twofactor.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.sharecrest.twofactor.dbflute.allcommon.*;
import com.sharecrest.twofactor.dbflute.cbean.*;
import com.sharecrest.twofactor.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of fixed_mail.
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblAbstractBsFixedMailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblAbstractBsFixedMailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return TblDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "fixed_mail";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailId The value of fixedMailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedMailId_Equal(Integer fixedMailId) {
        doSetFixedMailId_Equal(fixedMailId);
    }

    protected void doSetFixedMailId_Equal(Integer fixedMailId) {
        regFixedMailId(CK_EQ, fixedMailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailId The value of fixedMailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedMailId_NotEqual(Integer fixedMailId) {
        doSetFixedMailId_NotEqual(fixedMailId);
    }

    protected void doSetFixedMailId_NotEqual(Integer fixedMailId) {
        regFixedMailId(CK_NES, fixedMailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailId The value of fixedMailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedMailId_GreaterThan(Integer fixedMailId) {
        regFixedMailId(CK_GT, fixedMailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailId The value of fixedMailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedMailId_LessThan(Integer fixedMailId) {
        regFixedMailId(CK_LT, fixedMailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailId The value of fixedMailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedMailId_GreaterEqual(Integer fixedMailId) {
        regFixedMailId(CK_GE, fixedMailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailId The value of fixedMailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedMailId_LessEqual(Integer fixedMailId) {
        regFixedMailId(CK_LE, fixedMailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of fixedMailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fixedMailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFixedMailId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFixedMailId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of fixedMailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fixedMailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFixedMailId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFixedMailId(), "fixed_mail_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailIdList The collection of fixedMailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedMailId_InScope(Collection<Integer> fixedMailIdList) {
        doSetFixedMailId_InScope(fixedMailIdList);
    }

    protected void doSetFixedMailId_InScope(Collection<Integer> fixedMailIdList) {
        regINS(CK_INS, cTL(fixedMailIdList), xgetCValueFixedMailId(), "fixed_mail_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     * @param fixedMailIdList The collection of fixedMailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedMailId_NotInScope(Collection<Integer> fixedMailIdList) {
        doSetFixedMailId_NotInScope(fixedMailIdList);
    }

    protected void doSetFixedMailId_NotInScope(Collection<Integer> fixedMailIdList) {
        regINS(CK_NINS, cTL(fixedMailIdList), xgetCValueFixedMailId(), "fixed_mail_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     */
    public void setFixedMailId_IsNull() { regFixedMailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fixed_mail_id: {PK, ID, NotNull, INT(10)}
     */
    public void setFixedMailId_IsNotNull() { regFixedMailId(CK_ISNN, DOBJ); }

    protected void regFixedMailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFixedMailId(), "fixed_mail_id"); }
    protected abstract ConditionValue xgetCValueFixedMailId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_Equal(String code) {
        doSetCode_Equal(fRES(code));
    }

    protected void doSetCode_Equal(String code) {
        regCode(CK_EQ, code);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_NotEqual(String code) {
        doSetCode_NotEqual(fRES(code));
    }

    protected void doSetCode_NotEqual(String code) {
        regCode(CK_NES, code);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_GreaterThan(String code) {
        regCode(CK_GT, fRES(code));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_LessThan(String code) {
        regCode(CK_LT, fRES(code));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_GreaterEqual(String code) {
        regCode(CK_GE, fRES(code));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_LessEqual(String code) {
        regCode(CK_LE, fRES(code));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param codeList The collection of code as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_InScope(Collection<String> codeList) {
        doSetCode_InScope(codeList);
    }

    protected void doSetCode_InScope(Collection<String> codeList) {
        regINS(CK_INS, cTL(codeList), xgetCValueCode(), "code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param codeList The collection of code as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode_NotInScope(Collection<String> codeList) {
        doSetCode_NotInScope(codeList);
    }

    protected void doSetCode_NotInScope(Collection<String> codeList) {
        regINS(CK_NINS, cTL(codeList), xgetCValueCode(), "code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param code The value of code as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCode_LikeSearch(String code, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCode_LikeSearch(code, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param code The value of code as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCode_LikeSearch(String code, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(code), xgetCValueCode(), "code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCode_NotLikeSearch(String code, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCode_NotLikeSearch(code, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {UQ, NotNull, VARCHAR(256)}
     * @param code The value of code as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCode_NotLikeSearch(String code, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(code), xgetCValueCode(), "code", likeSearchOption);
    }

    protected void regCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCode(), "code"); }
    protected abstract ConditionValue xgetCValueCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, VARCHAR(256)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "name"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * description: {VARCHAR(512)}
     * @param descriptionList The collection of description as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "description");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * description: {VARCHAR(512)}
     * @param descriptionList The collection of description as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "description");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {VARCHAR(512)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {VARCHAR(512)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {VARCHAR(512)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     */
    public void setDescription_IsNullOrEmpty() { regDescription(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * description: {VARCHAR(512)}
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DOBJ); }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "description"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_Equal(String subject) {
        doSetSubject_Equal(fRES(subject));
    }

    protected void doSetSubject_Equal(String subject) {
        regSubject(CK_EQ, subject);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_NotEqual(String subject) {
        doSetSubject_NotEqual(fRES(subject));
    }

    protected void doSetSubject_NotEqual(String subject) {
        regSubject(CK_NES, subject);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_GreaterThan(String subject) {
        regSubject(CK_GT, fRES(subject));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_LessThan(String subject) {
        regSubject(CK_LT, fRES(subject));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_GreaterEqual(String subject) {
        regSubject(CK_GE, fRES(subject));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_LessEqual(String subject) {
        regSubject(CK_LE, fRES(subject));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subjectList The collection of subject as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_InScope(Collection<String> subjectList) {
        doSetSubject_InScope(subjectList);
    }

    protected void doSetSubject_InScope(Collection<String> subjectList) {
        regINS(CK_INS, cTL(subjectList), xgetCValueSubject(), "subject");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subjectList The collection of subject as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubject_NotInScope(Collection<String> subjectList) {
        doSetSubject_NotInScope(subjectList);
    }

    protected void doSetSubject_NotInScope(Collection<String> subjectList) {
        regINS(CK_NINS, cTL(subjectList), xgetCValueSubject(), "subject");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {TEXT(65535)} <br>
     * <pre>e.g. setSubject_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param subject The value of subject as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubject_LikeSearch(String subject, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubject_LikeSearch(subject, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {TEXT(65535)} <br>
     * <pre>e.g. setSubject_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subject The value of subject as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSubject_LikeSearch(String subject, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subject), xgetCValueSubject(), "subject", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubject_NotLikeSearch(String subject, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubject_NotLikeSearch(subject, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * subject: {TEXT(65535)}
     * @param subject The value of subject as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSubject_NotLikeSearch(String subject, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subject), xgetCValueSubject(), "subject", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     */
    public void setSubject_IsNull() { regSubject(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     */
    public void setSubject_IsNullOrEmpty() { regSubject(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * subject: {TEXT(65535)}
     */
    public void setSubject_IsNotNull() { regSubject(CK_ISNN, DOBJ); }

    protected void regSubject(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubject(), "subject"); }
    protected abstract ConditionValue xgetCValueSubject();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_Equal(String body) {
        doSetBody_Equal(fRES(body));
    }

    protected void doSetBody_Equal(String body) {
        regBody(CK_EQ, body);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_NotEqual(String body) {
        doSetBody_NotEqual(fRES(body));
    }

    protected void doSetBody_NotEqual(String body) {
        regBody(CK_NES, body);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_GreaterThan(String body) {
        regBody(CK_GT, fRES(body));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_LessThan(String body) {
        regBody(CK_LT, fRES(body));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_GreaterEqual(String body) {
        regBody(CK_GE, fRES(body));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_LessEqual(String body) {
        regBody(CK_LE, fRES(body));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * body: {TEXT(65535)}
     * @param bodyList The collection of body as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_InScope(Collection<String> bodyList) {
        doSetBody_InScope(bodyList);
    }

    protected void doSetBody_InScope(Collection<String> bodyList) {
        regINS(CK_INS, cTL(bodyList), xgetCValueBody(), "body");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * body: {TEXT(65535)}
     * @param bodyList The collection of body as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBody_NotInScope(Collection<String> bodyList) {
        doSetBody_NotInScope(bodyList);
    }

    protected void doSetBody_NotInScope(Collection<String> bodyList) {
        regINS(CK_NINS, cTL(bodyList), xgetCValueBody(), "body");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {TEXT(65535)} <br>
     * <pre>e.g. setBody_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param body The value of body as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBody_LikeSearch(String body, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBody_LikeSearch(body, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {TEXT(65535)} <br>
     * <pre>e.g. setBody_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param body The value of body as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBody_LikeSearch(String body, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(body), xgetCValueBody(), "body", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBody_NotLikeSearch(String body, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBody_NotLikeSearch(body, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * body: {TEXT(65535)}
     * @param body The value of body as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBody_NotLikeSearch(String body, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(body), xgetCValueBody(), "body", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     */
    public void setBody_IsNull() { regBody(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     */
    public void setBody_IsNullOrEmpty() { regBody(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * body: {TEXT(65535)}
     */
    public void setBody_IsNotNull() { regBody(CK_ISNN, DOBJ); }

    protected void regBody(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBody(), "body"); }
    protected abstract ConditionValue xgetCValueBody();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFixedMailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TblFixedMailCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFixedMailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TblFixedMailCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFixedMailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TblFixedMailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFixedMailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TblFixedMailCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFixedMailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TblFixedMailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TblFixedMailCB&gt;() {
     *     public void query(TblFixedMailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFixedMailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TblFixedMailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TblFixedMailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TblFixedMailCQ sq);

    protected TblFixedMailCB xcreateScalarConditionCB() {
        TblFixedMailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TblFixedMailCB xcreateScalarConditionPartitionByCB() {
        TblFixedMailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TblFixedMailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TblFixedMailCB cb = new TblFixedMailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "fixed_mail_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TblFixedMailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TblFixedMailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TblFixedMailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TblFixedMailCB cb = new TblFixedMailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "fixed_mail_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TblFixedMailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TblFixedMailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TblFixedMailCB cb = new TblFixedMailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TblFixedMailCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TblFixedMailCB newMyCB() {
        return new TblFixedMailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TblFixedMailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
