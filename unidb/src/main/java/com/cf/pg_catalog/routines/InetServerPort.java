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
public class InetServerPort extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -2070263127;

    /**
     * The parameter <code>pg_catalog.inet_server_port.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public InetServerPort() {
        super("inet_server_port", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
    }
}
