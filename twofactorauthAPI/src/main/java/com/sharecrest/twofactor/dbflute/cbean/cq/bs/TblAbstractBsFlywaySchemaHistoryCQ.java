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
 * The abstract condition-query of flyway_schema_history.
 * @author DBFlute(AutoGenerator)
 */
public abstract class TblAbstractBsFlywaySchemaHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TblAbstractBsFlywaySchemaHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "flyway_schema_history";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRank The value of installedRank as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledRank_Equal(Integer installedRank) {
        doSetInstalledRank_Equal(installedRank);
    }

    protected void doSetInstalledRank_Equal(Integer installedRank) {
        regInstalledRank(CK_EQ, installedRank);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRank The value of installedRank as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledRank_NotEqual(Integer installedRank) {
        doSetInstalledRank_NotEqual(installedRank);
    }

    protected void doSetInstalledRank_NotEqual(Integer installedRank) {
        regInstalledRank(CK_NES, installedRank);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRank The value of installedRank as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledRank_GreaterThan(Integer installedRank) {
        regInstalledRank(CK_GT, installedRank);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRank The value of installedRank as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledRank_LessThan(Integer installedRank) {
        regInstalledRank(CK_LT, installedRank);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRank The value of installedRank as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledRank_GreaterEqual(Integer installedRank) {
        regInstalledRank(CK_GE, installedRank);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRank The value of installedRank as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledRank_LessEqual(Integer installedRank) {
        regInstalledRank(CK_LE, installedRank);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param minNumber The min number of installedRank. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of installedRank. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setInstalledRank_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setInstalledRank_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param minNumber The min number of installedRank. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of installedRank. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setInstalledRank_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstalledRank(), "installed_rank", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRankList The collection of installedRank as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledRank_InScope(Collection<Integer> installedRankList) {
        doSetInstalledRank_InScope(installedRankList);
    }

    protected void doSetInstalledRank_InScope(Collection<Integer> installedRankList) {
        regINS(CK_INS, cTL(installedRankList), xgetCValueInstalledRank(), "installed_rank");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     * @param installedRankList The collection of installedRank as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledRank_NotInScope(Collection<Integer> installedRankList) {
        doSetInstalledRank_NotInScope(installedRankList);
    }

    protected void doSetInstalledRank_NotInScope(Collection<Integer> installedRankList) {
        regINS(CK_NINS, cTL(installedRankList), xgetCValueInstalledRank(), "installed_rank");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     */
    public void setInstalledRank_IsNull() { regInstalledRank(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * installed_rank: {PK, NotNull, INT(10)}
     */
    public void setInstalledRank_IsNotNull() { regInstalledRank(CK_ISNN, DOBJ); }

    protected void regInstalledRank(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstalledRank(), "installed_rank"); }
    protected abstract ConditionValue xgetCValueInstalledRank();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_Equal(String version) {
        doSetVersion_Equal(fRES(version));
    }

    protected void doSetVersion_Equal(String version) {
        regVersion(CK_EQ, version);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_NotEqual(String version) {
        doSetVersion_NotEqual(fRES(version));
    }

    protected void doSetVersion_NotEqual(String version) {
        regVersion(CK_NES, version);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * version: {VARCHAR(50)}
     * @param versionList The collection of version as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_InScope(Collection<String> versionList) {
        doSetVersion_InScope(versionList);
    }

    protected void doSetVersion_InScope(Collection<String> versionList) {
        regINS(CK_INS, cTL(versionList), xgetCValueVersion(), "version");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * version: {VARCHAR(50)}
     * @param versionList The collection of version as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_NotInScope(Collection<String> versionList) {
        doSetVersion_NotInScope(versionList);
    }

    protected void doSetVersion_NotInScope(Collection<String> versionList) {
        regINS(CK_NINS, cTL(versionList), xgetCValueVersion(), "version");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * version: {VARCHAR(50)} <br>
     * <pre>e.g. setVersion_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param version The value of version as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVersion_LikeSearch(version, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * version: {VARCHAR(50)} <br>
     * <pre>e.g. setVersion_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param version The value of version as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setVersion_LikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(version), xgetCValueVersion(), "version", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVersion_NotLikeSearch(String version, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVersion_NotLikeSearch(version, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * version: {VARCHAR(50)}
     * @param version The value of version as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setVersion_NotLikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(version), xgetCValueVersion(), "version", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     */
    public void setVersion_IsNullOrEmpty() { regVersion(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * version: {VARCHAR(50)}
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DOBJ); }

    protected void regVersion(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersion(), "version"); }
    protected abstract ConditionValue xgetCValueVersion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {NotNull, VARCHAR(200)}
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
     * description: {NotNull, VARCHAR(200)}
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
     * description: {NotNull, VARCHAR(200)}
     * @param description The value of description as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {NotNull, VARCHAR(200)}
     * @param description The value of description as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {NotNull, VARCHAR(200)}
     * @param description The value of description as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {NotNull, VARCHAR(200)}
     * @param description The value of description as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * description: {NotNull, VARCHAR(200)}
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
     * description: {NotNull, VARCHAR(200)}
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
     * description: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {NotNull, VARCHAR(200)} <br>
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
     * description: {NotNull, VARCHAR(200)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {NotNull, VARCHAR(200)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "description"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_Equal(String type) {
        doSetType_Equal(fRES(type));
    }

    protected void doSetType_Equal(String type) {
        regType(CK_EQ, type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_NotEqual(String type) {
        doSetType_NotEqual(fRES(type));
    }

    protected void doSetType_NotEqual(String type) {
        regType(CK_NES, type);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param typeList The collection of type as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_InScope(Collection<String> typeList) {
        doSetType_InScope(typeList);
    }

    protected void doSetType_InScope(Collection<String> typeList) {
        regINS(CK_INS, cTL(typeList), xgetCValueType(), "type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param typeList The collection of type as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_NotInScope(Collection<String> typeList) {
        doSetType_NotInScope(typeList);
    }

    protected void doSetType_NotInScope(Collection<String> typeList) {
        regINS(CK_NINS, cTL(typeList), xgetCValueType(), "type");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param type The value of type as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, ConditionOptionCall<LikeSearchOption> opLambda) {
        setType_LikeSearch(type, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param type The value of type as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setType_LikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), xgetCValueType(), "type", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, ConditionOptionCall<LikeSearchOption> opLambda) {
        setType_NotLikeSearch(type, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type: {NotNull, VARCHAR(20)}
     * @param type The value of type as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setType_NotLikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), xgetCValueType(), "type", likeSearchOption);
    }

    protected void regType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueType(), "type"); }
    protected abstract ConditionValue xgetCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_Equal(String script) {
        doSetScript_Equal(fRES(script));
    }

    protected void doSetScript_Equal(String script) {
        regScript(CK_EQ, script);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_NotEqual(String script) {
        doSetScript_NotEqual(fRES(script));
    }

    protected void doSetScript_NotEqual(String script) {
        regScript(CK_NES, script);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_GreaterThan(String script) {
        regScript(CK_GT, fRES(script));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_LessThan(String script) {
        regScript(CK_LT, fRES(script));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_GreaterEqual(String script) {
        regScript(CK_GE, fRES(script));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_LessEqual(String script) {
        regScript(CK_LE, fRES(script));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param scriptList The collection of script as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_InScope(Collection<String> scriptList) {
        doSetScript_InScope(scriptList);
    }

    protected void doSetScript_InScope(Collection<String> scriptList) {
        regINS(CK_INS, cTL(scriptList), xgetCValueScript(), "script");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param scriptList The collection of script as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScript_NotInScope(Collection<String> scriptList) {
        doSetScript_NotInScope(scriptList);
    }

    protected void doSetScript_NotInScope(Collection<String> scriptList) {
        regINS(CK_NINS, cTL(scriptList), xgetCValueScript(), "script");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * script: {NotNull, VARCHAR(1000)} <br>
     * <pre>e.g. setScript_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param script The value of script as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScript_LikeSearch(String script, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScript_LikeSearch(script, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * script: {NotNull, VARCHAR(1000)} <br>
     * <pre>e.g. setScript_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param script The value of script as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScript_LikeSearch(String script, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(script), xgetCValueScript(), "script", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScript_NotLikeSearch(String script, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScript_NotLikeSearch(script, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * script: {NotNull, VARCHAR(1000)}
     * @param script The value of script as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScript_NotLikeSearch(String script, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(script), xgetCValueScript(), "script", likeSearchOption);
    }

    protected void regScript(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScript(), "script"); }
    protected abstract ConditionValue xgetCValueScript();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param checksum The value of checksum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecksum_Equal(Integer checksum) {
        doSetChecksum_Equal(checksum);
    }

    protected void doSetChecksum_Equal(Integer checksum) {
        regChecksum(CK_EQ, checksum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param checksum The value of checksum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecksum_NotEqual(Integer checksum) {
        doSetChecksum_NotEqual(checksum);
    }

    protected void doSetChecksum_NotEqual(Integer checksum) {
        regChecksum(CK_NES, checksum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param checksum The value of checksum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecksum_GreaterThan(Integer checksum) {
        regChecksum(CK_GT, checksum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param checksum The value of checksum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecksum_LessThan(Integer checksum) {
        regChecksum(CK_LT, checksum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param checksum The value of checksum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecksum_GreaterEqual(Integer checksum) {
        regChecksum(CK_GE, checksum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param checksum The value of checksum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChecksum_LessEqual(Integer checksum) {
        regChecksum(CK_LE, checksum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param minNumber The min number of checksum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of checksum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setChecksum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setChecksum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     * @param minNumber The min number of checksum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of checksum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setChecksum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChecksum(), "checksum", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * checksum: {INT(10)}
     * @param checksumList The collection of checksum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChecksum_InScope(Collection<Integer> checksumList) {
        doSetChecksum_InScope(checksumList);
    }

    protected void doSetChecksum_InScope(Collection<Integer> checksumList) {
        regINS(CK_INS, cTL(checksumList), xgetCValueChecksum(), "checksum");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * checksum: {INT(10)}
     * @param checksumList The collection of checksum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChecksum_NotInScope(Collection<Integer> checksumList) {
        doSetChecksum_NotInScope(checksumList);
    }

    protected void doSetChecksum_NotInScope(Collection<Integer> checksumList) {
        regINS(CK_NINS, cTL(checksumList), xgetCValueChecksum(), "checksum");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     */
    public void setChecksum_IsNull() { regChecksum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * checksum: {INT(10)}
     */
    public void setChecksum_IsNotNull() { regChecksum(CK_ISNN, DOBJ); }

    protected void regChecksum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChecksum(), "checksum"); }
    protected abstract ConditionValue xgetCValueChecksum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_Equal(String installedBy) {
        doSetInstalledBy_Equal(fRES(installedBy));
    }

    protected void doSetInstalledBy_Equal(String installedBy) {
        regInstalledBy(CK_EQ, installedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_NotEqual(String installedBy) {
        doSetInstalledBy_NotEqual(fRES(installedBy));
    }

    protected void doSetInstalledBy_NotEqual(String installedBy) {
        regInstalledBy(CK_NES, installedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_GreaterThan(String installedBy) {
        regInstalledBy(CK_GT, fRES(installedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_LessThan(String installedBy) {
        regInstalledBy(CK_LT, fRES(installedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_GreaterEqual(String installedBy) {
        regInstalledBy(CK_GE, fRES(installedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_LessEqual(String installedBy) {
        regInstalledBy(CK_LE, fRES(installedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedByList The collection of installedBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_InScope(Collection<String> installedByList) {
        doSetInstalledBy_InScope(installedByList);
    }

    protected void doSetInstalledBy_InScope(Collection<String> installedByList) {
        regINS(CK_INS, cTL(installedByList), xgetCValueInstalledBy(), "installed_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedByList The collection of installedBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstalledBy_NotInScope(Collection<String> installedByList) {
        doSetInstalledBy_NotInScope(installedByList);
    }

    protected void doSetInstalledBy_NotInScope(Collection<String> installedByList) {
        regINS(CK_NINS, cTL(installedByList), xgetCValueInstalledBy(), "installed_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setInstalledBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param installedBy The value of installedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setInstalledBy_LikeSearch(String installedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setInstalledBy_LikeSearch(installedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setInstalledBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param installedBy The value of installedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setInstalledBy_LikeSearch(String installedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(installedBy), xgetCValueInstalledBy(), "installed_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setInstalledBy_NotLikeSearch(String installedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setInstalledBy_NotLikeSearch(installedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * installed_by: {NotNull, VARCHAR(100)}
     * @param installedBy The value of installedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setInstalledBy_NotLikeSearch(String installedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(installedBy), xgetCValueInstalledBy(), "installed_by", likeSearchOption);
    }

    protected void regInstalledBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstalledBy(), "installed_by"); }
    protected abstract ConditionValue xgetCValueInstalledBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param installedOn The value of installedOn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledOn_Equal(java.time.LocalDateTime installedOn) {
        regInstalledOn(CK_EQ,  installedOn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param installedOn The value of installedOn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledOn_GreaterThan(java.time.LocalDateTime installedOn) {
        regInstalledOn(CK_GT,  installedOn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param installedOn The value of installedOn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledOn_LessThan(java.time.LocalDateTime installedOn) {
        regInstalledOn(CK_LT,  installedOn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param installedOn The value of installedOn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledOn_GreaterEqual(java.time.LocalDateTime installedOn) {
        regInstalledOn(CK_GE,  installedOn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param installedOn The value of installedOn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstalledOn_LessEqual(java.time.LocalDateTime installedOn) {
        regInstalledOn(CK_LE, installedOn);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setInstalledOn_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of installedOn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of installedOn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setInstalledOn_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setInstalledOn_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * installed_on: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setInstalledOn_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of installedOn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of installedOn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setInstalledOn_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "installed_on"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueInstalledOn(), nm, op);
    }

    protected void regInstalledOn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstalledOn(), "installed_on"); }
    protected abstract ConditionValue xgetCValueInstalledOn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTime The value of executionTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExecutionTime_Equal(Integer executionTime) {
        doSetExecutionTime_Equal(executionTime);
    }

    protected void doSetExecutionTime_Equal(Integer executionTime) {
        regExecutionTime(CK_EQ, executionTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTime The value of executionTime as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExecutionTime_NotEqual(Integer executionTime) {
        doSetExecutionTime_NotEqual(executionTime);
    }

    protected void doSetExecutionTime_NotEqual(Integer executionTime) {
        regExecutionTime(CK_NES, executionTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTime The value of executionTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExecutionTime_GreaterThan(Integer executionTime) {
        regExecutionTime(CK_GT, executionTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTime The value of executionTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExecutionTime_LessThan(Integer executionTime) {
        regExecutionTime(CK_LT, executionTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTime The value of executionTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExecutionTime_GreaterEqual(Integer executionTime) {
        regExecutionTime(CK_GE, executionTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTime The value of executionTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExecutionTime_LessEqual(Integer executionTime) {
        regExecutionTime(CK_LE, executionTime);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param minNumber The min number of executionTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of executionTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setExecutionTime_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setExecutionTime_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param minNumber The min number of executionTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of executionTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setExecutionTime_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExecutionTime(), "execution_time", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTimeList The collection of executionTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutionTime_InScope(Collection<Integer> executionTimeList) {
        doSetExecutionTime_InScope(executionTimeList);
    }

    protected void doSetExecutionTime_InScope(Collection<Integer> executionTimeList) {
        regINS(CK_INS, cTL(executionTimeList), xgetCValueExecutionTime(), "execution_time");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * execution_time: {NotNull, INT(10)}
     * @param executionTimeList The collection of executionTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutionTime_NotInScope(Collection<Integer> executionTimeList) {
        doSetExecutionTime_NotInScope(executionTimeList);
    }

    protected void doSetExecutionTime_NotInScope(Collection<Integer> executionTimeList) {
        regINS(CK_NINS, cTL(executionTimeList), xgetCValueExecutionTime(), "execution_time");
    }

    protected void regExecutionTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExecutionTime(), "execution_time"); }
    protected abstract ConditionValue xgetCValueExecutionTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * success: {IX, NotNull, BIT}
     * @param success The value of success as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuccess_Equal(Boolean success) {
        regSuccess(CK_EQ, success);
    }

    protected void regSuccess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuccess(), "success"); }
    protected abstract ConditionValue xgetCValueSuccess();

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
    public HpSLCFunction<TblFlywaySchemaHistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TblFlywaySchemaHistoryCB.class);
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
    public HpSLCFunction<TblFlywaySchemaHistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TblFlywaySchemaHistoryCB.class);
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
    public HpSLCFunction<TblFlywaySchemaHistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TblFlywaySchemaHistoryCB.class);
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
    public HpSLCFunction<TblFlywaySchemaHistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TblFlywaySchemaHistoryCB.class);
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
    public HpSLCFunction<TblFlywaySchemaHistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TblFlywaySchemaHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TblFlywaySchemaHistoryCB&gt;() {
     *     public void query(TblFlywaySchemaHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TblFlywaySchemaHistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TblFlywaySchemaHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TblFlywaySchemaHistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TblFlywaySchemaHistoryCQ sq);

    protected TblFlywaySchemaHistoryCB xcreateScalarConditionCB() {
        TblFlywaySchemaHistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TblFlywaySchemaHistoryCB xcreateScalarConditionPartitionByCB() {
        TblFlywaySchemaHistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TblFlywaySchemaHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TblFlywaySchemaHistoryCB cb = new TblFlywaySchemaHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "installed_rank";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TblFlywaySchemaHistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TblFlywaySchemaHistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TblFlywaySchemaHistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TblFlywaySchemaHistoryCB cb = new TblFlywaySchemaHistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "installed_rank";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TblFlywaySchemaHistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TblFlywaySchemaHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TblFlywaySchemaHistoryCB cb = new TblFlywaySchemaHistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TblFlywaySchemaHistoryCQ sq);

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
    protected TblFlywaySchemaHistoryCB newMyCB() {
        return new TblFlywaySchemaHistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TblFlywaySchemaHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
