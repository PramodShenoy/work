/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.routines;


import com.cf.sys.Sys;

import javax.annotation.Generated;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Shows all currently disabled consumers.
 *  
 *  Parameters
 *  
 *  None
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_show_disabled_consumers();
 *  
 *  +---------------------------+
 *  | disabled_consumers        |
 *  +---------------------------+
 *  | events_statements_current |
 *  | global_instrumentation    |
 *  | thread_instrumentation    |
 *  | statements_digest         |
 *  +---------------------------+
 *  4 rows in set (0.05 sec)
 *  
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowDisabledConsumers extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1043614219;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowDisabledConsumers() {
        super("ps_setup_show_disabled_consumers", Sys.SYS);
    }
}