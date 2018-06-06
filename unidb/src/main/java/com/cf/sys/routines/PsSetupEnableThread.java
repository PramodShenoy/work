/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.routines;


import com.cf.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Enable the given connection/thread in Performance Schema.
 *  
 *  Parameters
 *  
 *  in_connection_id (BIGINT):
 *  The connection ID (PROCESSLIST_ID from performance_schema.threads
 *  or the ID shown within SHOW PROCESSLIST)
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_thread(3);
 *  +------------------+
 *  | summary          |
 *  +------------------+
 *  | Enabled 1 thread |
 *  +------------------+
 *  1 row in set (0.01 sec)
 *  
 *  To enable the current connection:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_thread(CONNECTION_ID());
 *  +------------------+
 *  | summary          |
 *  +------------------+
 *  | Enabled 1 thread |
 *  +------------------+
 *  1 row in set (0.00 sec)
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
public class PsSetupEnableThread extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -38679414;

    /**
     * The parameter <code>sys.ps_setup_enable_thread.in_connection_id</code>.
     */
    public static final Parameter<Long> IN_CONNECTION_ID = createParameter("in_connection_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupEnableThread() {
        super("ps_setup_enable_thread", Sys.SYS);

        addInParameter(IN_CONNECTION_ID);
    }

    /**
     * Set the <code>in_connection_id</code> parameter IN value to the routine
     */
    public void setInConnectionId(Long value) {
        setValue(IN_CONNECTION_ID, value);
    }
}