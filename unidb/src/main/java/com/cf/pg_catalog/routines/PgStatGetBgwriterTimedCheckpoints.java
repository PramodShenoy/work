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
public class PgStatGetBgwriterTimedCheckpoints extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -1131611129;

    /**
     * The parameter <code>pg_catalog.pg_stat_get_bgwriter_timed_checkpoints.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatGetBgwriterTimedCheckpoints() {
        super("pg_stat_get_bgwriter_timed_checkpoints", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
    }
}
