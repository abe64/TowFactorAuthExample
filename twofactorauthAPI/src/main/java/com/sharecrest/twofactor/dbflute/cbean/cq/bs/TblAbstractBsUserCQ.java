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
 * The abstract condition-query of user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblAbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblAbstractBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, INT(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

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
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_Equal(String account) {
        doSetAccount_Equal(fRES(account));
    }

    protected void doSetAccount_Equal(String account) {
        regAccount(CK_EQ, account);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_NotEqual(String account) {
        doSetAccount_NotEqual(fRES(account));
    }

    protected void doSetAccount_NotEqual(String account) {
        regAccount(CK_NES, account);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_GreaterThan(String account) {
        regAccount(CK_GT, fRES(account));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_LessThan(String account) {
        regAccount(CK_LT, fRES(account));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_GreaterEqual(String account) {
        regAccount(CK_GE, fRES(account));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_LessEqual(String account) {
        regAccount(CK_LE, fRES(account));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param accountList The collection of account as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_InScope(Collection<String> accountList) {
        doSetAccount_InScope(accountList);
    }

    protected void doSetAccount_InScope(Collection<String> accountList) {
        regINS(CK_INS, cTL(accountList), xgetCValueAccount(), "account");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param accountList The collection of account as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccount_NotInScope(Collection<String> accountList) {
        doSetAccount_NotInScope(accountList);
    }

    protected void doSetAccount_NotInScope(Collection<String> accountList) {
        regINS(CK_NINS, cTL(accountList), xgetCValueAccount(), "account");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setAccount_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param account The value of account as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccount_LikeSearch(String account, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccount_LikeSearch(account, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setAccount_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param account The value of account as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccount_LikeSearch(String account, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(account), xgetCValueAccount(), "account", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccount_NotLikeSearch(String account, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccount_NotLikeSearch(account, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * account: {UQ, NotNull, VARCHAR(256)}
     * @param account The value of account as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccount_NotLikeSearch(String account, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(account), xgetCValueAccount(), "account", likeSearchOption);
    }

    protected void regAccount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccount(), "account"); }
    protected abstract ConditionValue xgetCValueAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "password");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "password");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "password", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {NotNull, VARCHAR(256)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "password", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "password"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_Equal(String telno) {
        doSetTelno_Equal(fRES(telno));
    }

    protected void doSetTelno_Equal(String telno) {
        regTelno(CK_EQ, telno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_NotEqual(String telno) {
        doSetTelno_NotEqual(fRES(telno));
    }

    protected void doSetTelno_NotEqual(String telno) {
        regTelno(CK_NES, telno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_GreaterThan(String telno) {
        regTelno(CK_GT, fRES(telno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_LessThan(String telno) {
        regTelno(CK_LT, fRES(telno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_GreaterEqual(String telno) {
        regTelno(CK_GE, fRES(telno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_LessEqual(String telno) {
        regTelno(CK_LE, fRES(telno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telnoList The collection of telno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_InScope(Collection<String> telnoList) {
        doSetTelno_InScope(telnoList);
    }

    protected void doSetTelno_InScope(Collection<String> telnoList) {
        regINS(CK_INS, cTL(telnoList), xgetCValueTelno(), "telno");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telnoList The collection of telno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelno_NotInScope(Collection<String> telnoList) {
        doSetTelno_NotInScope(telnoList);
    }

    protected void doSetTelno_NotInScope(Collection<String> telnoList) {
        regINS(CK_NINS, cTL(telnoList), xgetCValueTelno(), "telno");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * telno: {VARCHAR(12)} <br>
     * <pre>e.g. setTelno_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param telno The value of telno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTelno_LikeSearch(String telno, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTelno_LikeSearch(telno, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * telno: {VARCHAR(12)} <br>
     * <pre>e.g. setTelno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param telno The value of telno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTelno_LikeSearch(String telno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(telno), xgetCValueTelno(), "telno", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTelno_NotLikeSearch(String telno, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTelno_NotLikeSearch(telno, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * telno: {VARCHAR(12)}
     * @param telno The value of telno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTelno_NotLikeSearch(String telno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(telno), xgetCValueTelno(), "telno", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     */
    public void setTelno_IsNull() { regTelno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     */
    public void setTelno_IsNullOrEmpty() { regTelno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * telno: {VARCHAR(12)}
     */
    public void setTelno_IsNotNull() { regTelno(CK_ISNN, DOBJ); }

    protected void regTelno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelno(), "telno"); }
    protected abstract ConditionValue xgetCValueTelno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_Equal(String secret) {
        doSetSecret_Equal(fRES(secret));
    }

    protected void doSetSecret_Equal(String secret) {
        regSecret(CK_EQ, secret);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_NotEqual(String secret) {
        doSetSecret_NotEqual(fRES(secret));
    }

    protected void doSetSecret_NotEqual(String secret) {
        regSecret(CK_NES, secret);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_GreaterThan(String secret) {
        regSecret(CK_GT, fRES(secret));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_LessThan(String secret) {
        regSecret(CK_LT, fRES(secret));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_GreaterEqual(String secret) {
        regSecret(CK_GE, fRES(secret));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_LessEqual(String secret) {
        regSecret(CK_LE, fRES(secret));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secretList The collection of secret as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_InScope(Collection<String> secretList) {
        doSetSecret_InScope(secretList);
    }

    protected void doSetSecret_InScope(Collection<String> secretList) {
        regINS(CK_INS, cTL(secretList), xgetCValueSecret(), "secret");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secretList The collection of secret as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecret_NotInScope(Collection<String> secretList) {
        doSetSecret_NotInScope(secretList);
    }

    protected void doSetSecret_NotInScope(Collection<String> secretList) {
        regINS(CK_NINS, cTL(secretList), xgetCValueSecret(), "secret");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * secret: {VARCHAR(16)} <br>
     * <pre>e.g. setSecret_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param secret The value of secret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecret_LikeSearch(String secret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecret_LikeSearch(secret, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * secret: {VARCHAR(16)} <br>
     * <pre>e.g. setSecret_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secret The value of secret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSecret_LikeSearch(String secret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secret), xgetCValueSecret(), "secret", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecret_NotLikeSearch(String secret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecret_NotLikeSearch(secret, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * secret: {VARCHAR(16)}
     * @param secret The value of secret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSecret_NotLikeSearch(String secret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secret), xgetCValueSecret(), "secret", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     */
    public void setSecret_IsNull() { regSecret(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     */
    public void setSecret_IsNullOrEmpty() { regSecret(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * secret: {VARCHAR(16)}
     */
    public void setSecret_IsNotNull() { regSecret(CK_ISNN, DOBJ); }

    protected void regSecret(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecret(), "secret"); }
    protected abstract ConditionValue xgetCValueSecret();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * unlocked: {NotNull, BIT}
     * @param unlocked The value of unlocked as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnlocked_Equal(Boolean unlocked) {
        regUnlocked(CK_EQ, unlocked);
    }

    protected void regUnlocked(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnlocked(), "unlocked"); }
    protected abstract ConditionValue xgetCValueUnlocked();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_Equal(String role) {
        doSetRole_Equal(fRES(role));
    }

    protected void doSetRole_Equal(String role) {
        regRole(CK_EQ, role);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_NotEqual(String role) {
        doSetRole_NotEqual(fRES(role));
    }

    protected void doSetRole_NotEqual(String role) {
        regRole(CK_NES, role);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_GreaterThan(String role) {
        regRole(CK_GT, fRES(role));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_LessThan(String role) {
        regRole(CK_LT, fRES(role));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_GreaterEqual(String role) {
        regRole(CK_GE, fRES(role));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_LessEqual(String role) {
        regRole(CK_LE, fRES(role));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * role: {VARCHAR(256)}
     * @param roleList The collection of role as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_InScope(Collection<String> roleList) {
        doSetRole_InScope(roleList);
    }

    protected void doSetRole_InScope(Collection<String> roleList) {
        regINS(CK_INS, cTL(roleList), xgetCValueRole(), "role");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * role: {VARCHAR(256)}
     * @param roleList The collection of role as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRole_NotInScope(Collection<String> roleList) {
        doSetRole_NotInScope(roleList);
    }

    protected void doSetRole_NotInScope(Collection<String> roleList) {
        regINS(CK_NINS, cTL(roleList), xgetCValueRole(), "role");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * role: {VARCHAR(256)} <br>
     * <pre>e.g. setRole_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param role The value of role as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRole_LikeSearch(String role, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRole_LikeSearch(role, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * role: {VARCHAR(256)} <br>
     * <pre>e.g. setRole_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param role The value of role as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRole_LikeSearch(String role, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(role), xgetCValueRole(), "role", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRole_NotLikeSearch(String role, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRole_NotLikeSearch(role, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * role: {VARCHAR(256)}
     * @param role The value of role as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRole_NotLikeSearch(String role, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(role), xgetCValueRole(), "role", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     */
    public void setRole_IsNull() { regRole(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     */
    public void setRole_IsNullOrEmpty() { regRole(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * role: {VARCHAR(256)}
     */
    public void setRole_IsNotNull() { regRole(CK_ISNN, DOBJ); }

    protected void regRole(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRole(), "role"); }
    protected abstract ConditionValue xgetCValueRole();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * two_factor_use: {NotNull, BIT, default=[0]}
     * @param twoFactorUse The value of twoFactorUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwoFactorUse_Equal(Boolean twoFactorUse) {
        regTwoFactorUse(CK_EQ, twoFactorUse);
    }

    protected void regTwoFactorUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwoFactorUse(), "two_factor_use"); }
    protected abstract ConditionValue xgetCValueTwoFactorUse();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @param twoFactorType The value of twoFactorType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setTwoFactorType_Equal(String twoFactorType) {
        doSetTwoFactorType_Equal(fRES(twoFactorType));
    }

    /**
     * Equal(=). As TwoFactorType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTwoFactorType_Equal_AsTwoFactorType(TblCDef.TwoFactorType cdef) {
        doSetTwoFactorType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As HOTP_MAIL (HOTP_MAIL). And OnlyOnceRegistered. <br>
     * ワンタイム(メール): メールに認証コードを送るタイプ。
     */
    public void setTwoFactorType_Equal_HOTP_MAIL() {
        setTwoFactorType_Equal_AsTwoFactorType(TblCDef.TwoFactorType.HOTP_MAIL);
    }

    /**
     * Equal(=). As HOTP_SMS (HOTP_SMS). And OnlyOnceRegistered. <br>
     * ワンタイム(ショートメール): ショートメールに認証コードを送るタイプ。
     */
    public void setTwoFactorType_Equal_HOTP_SMS() {
        setTwoFactorType_Equal_AsTwoFactorType(TblCDef.TwoFactorType.HOTP_SMS);
    }

    /**
     * Equal(=). As TOTP (TOTP). And OnlyOnceRegistered. <br>
     * 所有物認証: アプリケーションの認証コードを使うタイプ。
     */
    public void setTwoFactorType_Equal_TOTP() {
        setTwoFactorType_Equal_AsTwoFactorType(TblCDef.TwoFactorType.TOTP);
    }

    protected void doSetTwoFactorType_Equal(String twoFactorType) {
        regTwoFactorType(CK_EQ, twoFactorType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @param twoFactorType The value of twoFactorType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setTwoFactorType_NotEqual(String twoFactorType) {
        doSetTwoFactorType_NotEqual(fRES(twoFactorType));
    }

    /**
     * NotEqual(&lt;&gt;). As TwoFactorType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTwoFactorType_NotEqual_AsTwoFactorType(TblCDef.TwoFactorType cdef) {
        doSetTwoFactorType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As HOTP_MAIL (HOTP_MAIL). And OnlyOnceRegistered. <br>
     * ワンタイム(メール): メールに認証コードを送るタイプ。
     */
    public void setTwoFactorType_NotEqual_HOTP_MAIL() {
        setTwoFactorType_NotEqual_AsTwoFactorType(TblCDef.TwoFactorType.HOTP_MAIL);
    }

    /**
     * NotEqual(&lt;&gt;). As HOTP_SMS (HOTP_SMS). And OnlyOnceRegistered. <br>
     * ワンタイム(ショートメール): ショートメールに認証コードを送るタイプ。
     */
    public void setTwoFactorType_NotEqual_HOTP_SMS() {
        setTwoFactorType_NotEqual_AsTwoFactorType(TblCDef.TwoFactorType.HOTP_SMS);
    }

    /**
     * NotEqual(&lt;&gt;). As TOTP (TOTP). And OnlyOnceRegistered. <br>
     * 所有物認証: アプリケーションの認証コードを使うタイプ。
     */
    public void setTwoFactorType_NotEqual_TOTP() {
        setTwoFactorType_NotEqual_AsTwoFactorType(TblCDef.TwoFactorType.TOTP);
    }

    protected void doSetTwoFactorType_NotEqual(String twoFactorType) {
        regTwoFactorType(CK_NES, twoFactorType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @param twoFactorTypeList The collection of twoFactorType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setTwoFactorType_InScope(Collection<String> twoFactorTypeList) {
        doSetTwoFactorType_InScope(twoFactorTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As TwoFactorType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwoFactorType_InScope_AsTwoFactorType(Collection<TblCDef.TwoFactorType> cdefList) {
        doSetTwoFactorType_InScope(cTStrL(cdefList));
    }

    protected void doSetTwoFactorType_InScope(Collection<String> twoFactorTypeList) {
        regINS(CK_INS, cTL(twoFactorTypeList), xgetCValueTwoFactorType(), "two_factor_type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     * @param twoFactorTypeList The collection of twoFactorType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setTwoFactorType_NotInScope(Collection<String> twoFactorTypeList) {
        doSetTwoFactorType_NotInScope(twoFactorTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TwoFactorType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType} <br>
     * 2段階認証タイプ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwoFactorType_NotInScope_AsTwoFactorType(Collection<TblCDef.TwoFactorType> cdefList) {
        doSetTwoFactorType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTwoFactorType_NotInScope(Collection<String> twoFactorTypeList) {
        regINS(CK_NINS, cTL(twoFactorTypeList), xgetCValueTwoFactorType(), "two_factor_type");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     */
    public void setTwoFactorType_IsNull() { regTwoFactorType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     */
    public void setTwoFactorType_IsNullOrEmpty() { regTwoFactorType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * two_factor_type: {VARCHAR(32), classification=TwoFactorType}
     */
    public void setTwoFactorType_IsNotNull() { regTwoFactorType(CK_ISNN, DOBJ); }

    protected void regTwoFactorType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwoFactorType(), "two_factor_type"); }
    protected abstract ConditionValue xgetCValueTwoFactorType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCount The value of loginCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginCount_Equal(Integer loginCount) {
        doSetLoginCount_Equal(loginCount);
    }

    protected void doSetLoginCount_Equal(Integer loginCount) {
        regLoginCount(CK_EQ, loginCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCount The value of loginCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginCount_NotEqual(Integer loginCount) {
        doSetLoginCount_NotEqual(loginCount);
    }

    protected void doSetLoginCount_NotEqual(Integer loginCount) {
        regLoginCount(CK_NES, loginCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCount The value of loginCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginCount_GreaterThan(Integer loginCount) {
        regLoginCount(CK_GT, loginCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCount The value of loginCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginCount_LessThan(Integer loginCount) {
        regLoginCount(CK_LT, loginCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCount The value of loginCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginCount_GreaterEqual(Integer loginCount) {
        regLoginCount(CK_GE, loginCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCount The value of loginCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginCount_LessEqual(Integer loginCount) {
        regLoginCount(CK_LE, loginCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param minNumber The min number of loginCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loginCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLoginCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLoginCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param minNumber The min number of loginCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loginCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLoginCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLoginCount(), "login_count", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCountList The collection of loginCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCount_InScope(Collection<Integer> loginCountList) {
        doSetLoginCount_InScope(loginCountList);
    }

    protected void doSetLoginCount_InScope(Collection<Integer> loginCountList) {
        regINS(CK_INS, cTL(loginCountList), xgetCValueLoginCount(), "login_count");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * login_count: {NotNull, INT(10), default=[0]}
     * @param loginCountList The collection of loginCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCount_NotInScope(Collection<Integer> loginCountList) {
        doSetLoginCount_NotInScope(loginCountList);
    }

    protected void doSetLoginCount_NotInScope(Collection<Integer> loginCountList) {
        regINS(CK_NINS, cTL(loginCountList), xgetCValueLoginCount(), "login_count");
    }

    protected void regLoginCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoginCount(), "login_count"); }
    protected abstract ConditionValue xgetCValueLoginCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @param status The value of status as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setStatus_Equal(String status) {
        doSetStatus_Equal(fRES(status));
    }

    /**
     * Equal(=). As UserStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ユーザーステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_Equal_AsUserStatus(TblCDef.UserStatus cdef) {
        doSetStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As NORMAL (NORMAL). And OnlyOnceRegistered. <br>
     * 通常: 利用中ユーザー。
     */
    public void setStatus_Equal_NORMAL() {
        setStatus_Equal_AsUserStatus(TblCDef.UserStatus.NORMAL);
    }

    /**
     * Equal(=). As SIGNUP (SIGNUP). And OnlyOnceRegistered. <br>
     * サインアップ: サインアップ中。メールアドレスの確認完了後に仮登録された状態。
     */
    public void setStatus_Equal_SIGNUP() {
        setStatus_Equal_AsUserStatus(TblCDef.UserStatus.SIGNUP);
    }

    protected void doSetStatus_Equal(String status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @param status The value of status as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setStatus_NotEqual(String status) {
        doSetStatus_NotEqual(fRES(status));
    }

    /**
     * NotEqual(&lt;&gt;). As UserStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ユーザーステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStatus_NotEqual_AsUserStatus(TblCDef.UserStatus cdef) {
        doSetStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As NORMAL (NORMAL). And OnlyOnceRegistered. <br>
     * 通常: 利用中ユーザー。
     */
    public void setStatus_NotEqual_NORMAL() {
        setStatus_NotEqual_AsUserStatus(TblCDef.UserStatus.NORMAL);
    }

    /**
     * NotEqual(&lt;&gt;). As SIGNUP (SIGNUP). And OnlyOnceRegistered. <br>
     * サインアップ: サインアップ中。メールアドレスの確認完了後に仮登録された状態。
     */
    public void setStatus_NotEqual_SIGNUP() {
        setStatus_NotEqual_AsUserStatus(TblCDef.UserStatus.SIGNUP);
    }

    protected void doSetStatus_NotEqual(String status) {
        regStatus(CK_NES, status);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @param statusList The collection of status as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setStatus_InScope(Collection<String> statusList) {
        doSetStatus_InScope(statusList);
    }

    /**
     * InScope {in ('a', 'b')}. As UserStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ユーザーステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_InScope_AsUserStatus(Collection<TblCDef.UserStatus> cdefList) {
        doSetStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetStatus_InScope(Collection<String> statusList) {
        regINS(CK_INS, cTL(statusList), xgetCValueStatus(), "status");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus}
     * @param statusList The collection of status as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setStatus_NotInScope(Collection<String> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UserStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status: {NotNull, VARCHAR(32), classification=UserStatus} <br>
     * ユーザーステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotInScope_AsUserStatus(Collection<TblCDef.UserStatus> cdefList) {
        doSetStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStatus_NotInScope(Collection<String> statusList) {
        regINS(CK_NINS, cTL(statusList), xgetCValueStatus(), "status");
    }

    protected void regStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatus(), "status"); }
    protected abstract ConditionValue xgetCValueStatus();

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
    public HpSLCFunction<TblUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TblUserCB.class);
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
    public HpSLCFunction<TblUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TblUserCB.class);
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
    public HpSLCFunction<TblUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TblUserCB.class);
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
    public HpSLCFunction<TblUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TblUserCB.class);
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
    public HpSLCFunction<TblUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TblUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TblUserCB&gt;() {
     *     public void query(TblUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TblUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TblUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TblUserCQ sq);

    protected TblUserCB xcreateScalarConditionCB() {
        TblUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TblUserCB xcreateScalarConditionPartitionByCB() {
        TblUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TblUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TblUserCB cb = new TblUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "user_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TblUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TblUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TblUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TblUserCB cb = new TblUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "user_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TblUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TblUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TblUserCB cb = new TblUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TblUserCQ sq);

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
    protected TblUserCB newMyCB() {
        return new TblUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TblUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
