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
public class SuppressRedundantUpdatesTrigger extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1845855961;

    /**
     * The parameter <code>pg_catalog.suppress_redundant_updates_trigger.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"), false, false);

    /**
     * Create a new routine call instance
     */
    public SuppressRedundantUpdatesTrigger() {
        super("suppress_redundant_updates_trigger", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

        setReturnParameter(RETURN_VALUE);
    }
}
