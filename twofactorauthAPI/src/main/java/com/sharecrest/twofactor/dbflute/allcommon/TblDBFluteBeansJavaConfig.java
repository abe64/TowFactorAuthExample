package com.sharecrest.twofactor.dbflute.allcommon;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;

/**
 * The Java configuration of DBFlute beans for Spring Framework. <br>
 * You can inject them by importing this class in your auto configuration class.
 * @author DBFlute(AutoGenerator)
 */
@Configuration
@ComponentScan(value="com.sharecrest.twofactor.dbflute.exbhv", lazyInit=true)
public class TblDBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    protected ApplicationContext _container;

    @Autowired
    @Qualifier("dataSource")
    protected DataSource _dataSource; // name basis here for multiple DB

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="tblIntroduction")
    public TblDBFluteInitializer createDBFluteInitializer() { // no lazy for initialize-only component
        return new com.sharecrest.twofactor.dbflute.allcommon.TblDBFluteInitializer(_dataSource);
    }

    @Bean(name="tblInvokerAssistant")
    @Lazy
    public InvokerAssistant createImplementedInvokerAssistant() {
        TblImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(_dataSource);
        return assistant;
    }

    protected TblImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new com.sharecrest.twofactor.dbflute.allcommon.TblImplementedInvokerAssistant();
    }

    @Bean(name="tblBehaviorCommandInvoker")
    @Lazy
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(createImplementedInvokerAssistant());
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Bean(name="tblBehaviorSelector")
    @Lazy
    public TblImplementedBehaviorSelector createImplementedBehaviorSelector() {
        TblImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_container);
        return selector;
    }

    protected TblImplementedBehaviorSelector newImplementedBehaviorSelector() {
        return new TblImplementedBehaviorSelector();
    }

    @Bean(name="tblCommonColumnAutoSetupper")
    @Lazy
    public TblImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return newImplementedCommonColumnAutoSetupper();
    }

    protected TblImplementedCommonColumnAutoSetupper newImplementedCommonColumnAutoSetupper() {
        return new TblImplementedCommonColumnAutoSetupper();
    }
}
