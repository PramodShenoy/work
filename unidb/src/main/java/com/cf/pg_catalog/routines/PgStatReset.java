/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import javax.annotation.Generated;

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
public class PgStatReset extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 903885072;

    /**
     * Create a new routine call instance
     */
    public PgStatReset() {
        super("pg_stat_reset", PgCatalog.PG_CATALOG);
    }
}
