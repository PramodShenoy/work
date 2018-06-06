/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.tables;


import com.cf.pg_catalog.PgCatalog;
import com.cf.pg_catalog.tables.records.PgStatXactUserFunctionsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class PgStatXactUserFunctions extends TableImpl<PgStatXactUserFunctionsRecord> {

    private static final long serialVersionUID = 509371664;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_user_functions</code>
     */
    public static final PgStatXactUserFunctions PG_STAT_XACT_USER_FUNCTIONS = new PgStatXactUserFunctions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactUserFunctionsRecord> getRecordType() {
        return PgStatXactUserFunctionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcid</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Long> FUNCID = createField("funcid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.schemaname</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcname</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, String> FUNCNAME = createField("funcname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.calls</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Long> CALLS = createField("calls", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.total_time</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Double> TOTAL_TIME = createField("total_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.self_time</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Double> SELF_TIME = createField("self_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_xact_user_functions</code> table reference
     */
    public PgStatXactUserFunctions() {
        this("pg_stat_xact_user_functions", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code> table reference
     */
    public PgStatXactUserFunctions(String alias) {
        this(alias, PG_STAT_XACT_USER_FUNCTIONS);
    }

    private PgStatXactUserFunctions(String alias, Table<PgStatXactUserFunctionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactUserFunctions(String alias, Table<PgStatXactUserFunctionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatXactUserFunctions as(String alias) {
        return new PgStatXactUserFunctions(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatXactUserFunctions rename(String name) {
        return new PgStatXactUserFunctions(name, null);
    }
}
