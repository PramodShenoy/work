/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.tables;


import com.cf.pg_catalog.PgCatalog;
import com.cf.pg_catalog.tables.records.PgUserRecord;

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
public class PgUser extends TableImpl<PgUserRecord> {

    private static final long serialVersionUID = -330822598;

    /**
     * The reference instance of <code>pg_catalog.pg_user</code>
     */
    public static final PgUser PG_USER = new PgUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserRecord> getRecordType() {
        return PgUserRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user.usename</code>.
     */
    public final TableField<PgUserRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usesysid</code>.
     */
    public final TableField<PgUserRecord, Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public final TableField<PgUserRecord, Boolean> USECREATEDB = createField("usecreatedb", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usesuper</code>.
     */
    public final TableField<PgUserRecord, Boolean> USESUPER = createField("usesuper", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.userepl</code>.
     */
    public final TableField<PgUserRecord, Boolean> USEREPL = createField("userepl", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public final TableField<PgUserRecord, Boolean> USEBYPASSRLS = createField("usebypassrls", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.passwd</code>.
     */
    public final TableField<PgUserRecord, String> PASSWD = createField("passwd", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_user.valuntil</code>.
     */
    public final TableField<PgUserRecord, Object> VALUNTIL = createField("valuntil", org.jooq.impl.DefaultDataType.getDefaultDataType("abstime"), this, "");

    /**
     * The column <code>pg_catalog.pg_user.useconfig</code>.
     */
    public final TableField<PgUserRecord, String[]> USECONFIG = createField("useconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser() {
        this("pg_user", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser(String alias) {
        this(alias, PG_USER);
    }

    private PgUser(String alias, Table<PgUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUser(String alias, Table<PgUserRecord> aliased, Field<?>[] parameters) {
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
    public PgUser as(String alias) {
        return new PgUser(alias, this);
    }

    /**
     * Rename this table
     */
    public PgUser rename(String name) {
        return new PgUser(name, null);
    }
}
