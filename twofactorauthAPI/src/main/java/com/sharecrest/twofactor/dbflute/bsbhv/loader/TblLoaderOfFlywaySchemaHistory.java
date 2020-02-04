package com.sharecrest.twofactor.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.sharecrest.twofactor.dbflute.exbhv.*;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The referrer loader of flyway_schema_history as TABLE. <br>
 * <pre>
 * [primary key]
 *     installed_rank
 *
 * [column]
 *     installed_rank, version, description, type, script, checksum, installed_by, installed_on, execution_time, success
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class TblLoaderOfFlywaySchemaHistory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TblFlywaySchemaHistory> _selectedList;
    protected BehaviorSelector _selector;
    protected TblFlywaySchemaHistoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public TblLoaderOfFlywaySchemaHistory ready(List<TblFlywaySchemaHistory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TblFlywaySchemaHistoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TblFlywaySchemaHistoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TblFlywaySchemaHistory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
