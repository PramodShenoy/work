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
 *  Enables consumers within Performance Schema 
 *  matching the input pattern.
 *  
 *  Parameters
 *  
 *  consumer (VARCHAR(128)):
 *  A LIKE pattern match (using "%consumer%") of consumers to enable
 *  
 *  Example
 *  
 *  To enable all consumers:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_consumer('');
 *  +-------------------------+
 *  | summary                 |
 *  +-------------------------+
 *  | Enabled 10 consumers    |
 *  +-------------------------+
 *  1 row in set (0.02 sec)
 *  
 *  Query OK, 0 rows affected (0.02 sec)
 *  
 *  To enable just "waits" consumers:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_consumer('waits');
 *  +-----------------------+
 *  | summary               |
 *  +-----------------------+
 *  | Enabled 3 consumers   |
 *  +-----------------------+
 *  1 row in set (0.00 sec)
 *  
 *  Query OK, 0 rows affected (0.00 sec)
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
public class PsSetupEnableConsumer extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1648384627;

    /**
     * The parameter <code>sys.ps_setup_enable_consumer.consumer</code>.
     */
    public static final Parameter<String> CONSUMER = createParameter("consumer", org.jooq.impl.SQLDataType.VARCHAR(128), false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupEnableConsumer() {
        super("ps_setup_enable_consumer", Sys.SYS);

        addInParameter(CONSUMER);
    }

    /**
     * Set the <code>consumer</code> parameter IN value to the routine
     */
    public void setConsumer(String value) {
        setValue(CONSUMER, value);
    }
}
