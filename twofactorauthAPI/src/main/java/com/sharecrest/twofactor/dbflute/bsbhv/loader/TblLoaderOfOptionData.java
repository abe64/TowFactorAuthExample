package com.sharecrest.twofactor.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.sharecrest.twofactor.dbflute.exbhv.*;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The referrer loader of option_data as TABLE. <br>
 * <pre>
 * [primary key]
 *     option_data_id
 *
 * [column]
 *     option_data_id, key_code, value, description
 *
 * [sequence]
 *     
 *
 * [identity]
 *     option_data_id
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
public class TblLoaderOfOptionData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TblOptionData> _selectedList;
    protected BehaviorSelector _selector;
    protected TblOptionDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public TblLoaderOfOptionData ready(List<TblOptionData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TblOptionDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TblOptionDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TblOptionData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
