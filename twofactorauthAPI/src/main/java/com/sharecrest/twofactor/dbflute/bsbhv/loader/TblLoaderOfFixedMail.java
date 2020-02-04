package com.sharecrest.twofactor.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.sharecrest.twofactor.dbflute.exbhv.*;
import com.sharecrest.twofactor.dbflute.exentity.*;

/**
 * The referrer loader of fixed_mail as TABLE. <br>
 * <pre>
 * [primary key]
 *     fixed_mail_id
 *
 * [column]
 *     fixed_mail_id, code, name, description, subject, body
 *
 * [sequence]
 *     
 *
 * [identity]
 *     fixed_mail_id
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
public class TblLoaderOfFixedMail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TblFixedMail> _selectedList;
    protected BehaviorSelector _selector;
    protected TblFixedMailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public TblLoaderOfFixedMail ready(List<TblFixedMail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TblFixedMailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TblFixedMailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TblFixedMail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
