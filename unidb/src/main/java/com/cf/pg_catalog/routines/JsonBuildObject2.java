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
public class JsonBuildObject2 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1330411738;

    /**
     * The parameter <code>pg_catalog.json_build_object.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonBuildObject2() {
        super("json_build_object", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.OTHER);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
