/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import java.sql.Timestamp;

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
public class PgPreparedXact extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 432612579;

    /**
     * The parameter <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public static final Parameter<Long> TRANSACTION = createParameter("transaction", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public static final Parameter<String> GID = createParameter("gid", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public static final Parameter<Timestamp> PREPARED = createParameter("prepared", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public static final Parameter<Long> OWNERID = createParameter("ownerid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public static final Parameter<Long> DBID = createParameter("dbid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgPreparedXact() {
        super("pg_prepared_xact", PgCatalog.PG_CATALOG);

        addOutParameter(TRANSACTION);
        addOutParameter(GID);
        addOutParameter(PREPARED);
        addOutParameter(OWNERID);
        addOutParameter(DBID);
    }

    /**
     * Get the <code>transaction</code> parameter OUT value from the routine
     */
    public Long getTransaction() {
        return get(TRANSACTION);
    }

    /**
     * Get the <code>gid</code> parameter OUT value from the routine
     */
    public String getGid() {
        return get(GID);
    }

    /**
     * Get the <code>prepared</code> parameter OUT value from the routine
     */
    public Timestamp getPrepared() {
        return get(PREPARED);
    }

    /**
     * Get the <code>ownerid</code> parameter OUT value from the routine
     */
    public Long getOwnerid() {
        return get(OWNERID);
    }

    /**
     * Get the <code>dbid</code> parameter OUT value from the routine
     */
    public Long getDbid() {
        return get(DBID);
    }
}
