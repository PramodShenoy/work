/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InetClientAddr extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1342639135;

    /**
     * The parameter <code>pg_catalog.inet_client_addr.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("inet"), false, false);

    /**
     * Create a new routine call instance
     */
    public InetClientAddr() {
        super("inet_client_addr", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("inet"));

        setReturnParameter(RETURN_VALUE);
    }
}
