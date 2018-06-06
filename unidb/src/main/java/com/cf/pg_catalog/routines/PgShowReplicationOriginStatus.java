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
public class PgShowReplicationOriginStatus extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 840752820;

    /**
     * The parameter <code>pg_catalog.pg_show_replication_origin_status.local_id</code>.
     */
    public static final Parameter<Long> LOCAL_ID = createParameter("local_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_replication_origin_status.external_id</code>.
     */
    public static final Parameter<String> EXTERNAL_ID = createParameter("external_id", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_replication_origin_status.remote_lsn</code>.
     */
    public static final Parameter<Object> REMOTE_LSN = createParameter("remote_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_replication_origin_status.local_lsn</code>.
     */
    public static final Parameter<Object> LOCAL_LSN = createParameter("local_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), false, false);

    /**
     * Create a new routine call instance
     */
    public PgShowReplicationOriginStatus() {
        super("pg_show_replication_origin_status", PgCatalog.PG_CATALOG);

        addOutParameter(LOCAL_ID);
        addOutParameter(EXTERNAL_ID);
        addOutParameter(REMOTE_LSN);
        addOutParameter(LOCAL_LSN);
    }

    /**
     * Get the <code>local_id</code> parameter OUT value from the routine
     */
    public Long getLocalId() {
        return get(LOCAL_ID);
    }

    /**
     * Get the <code>external_id</code> parameter OUT value from the routine
     */
    public String getExternalId() {
        return get(EXTERNAL_ID);
    }

    /**
     * Get the <code>remote_lsn</code> parameter OUT value from the routine
     */
    public Object getRemoteLsn() {
        return get(REMOTE_LSN);
    }

    /**
     * Get the <code>local_lsn</code> parameter OUT value from the routine
     */
    public Object getLocalLsn() {
        return get(LOCAL_LSN);
    }
}
