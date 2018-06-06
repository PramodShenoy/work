/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.tables;


import com.cf.pg_catalog.PgCatalog;
import com.cf.pg_catalog.tables.records.PgIndexRecord;

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
public class PgIndex extends TableImpl<PgIndexRecord> {

    private static final long serialVersionUID = 1983727749;

    /**
     * The reference instance of <code>pg_catalog.pg_index</code>
     */
    public static final PgIndex PG_INDEX = new PgIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgIndexRecord> getRecordType() {
        return PgIndexRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public final TableField<PgIndexRecord, Long> INDEXRELID = createField("indexrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indrelid</code>.
     */
    public final TableField<PgIndexRecord, Long> INDRELID = createField("indrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indnatts</code>.
     */
    public final TableField<PgIndexRecord, Short> INDNATTS = createField("indnatts", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisunique</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISUNIQUE = createField("indisunique", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISPRIMARY = createField("indisprimary", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISEXCLUSION = createField("indisexclusion", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDIMMEDIATE = createField("indimmediate", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISCLUSTERED = createField("indisclustered", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISVALID = createField("indisvalid", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDCHECKXMIN = createField("indcheckxmin", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisready</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISREADY = createField("indisready", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indislive</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISLIVE = createField("indislive", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISREPLIDENT = createField("indisreplident", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indkey</code>.
     */
    public final TableField<PgIndexRecord, Object[]> INDKEY = createField("indkey", org.jooq.impl.DefaultDataType.getDefaultDataType("int2vector").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indcollation</code>.
     */
    public final TableField<PgIndexRecord, Long[]> INDCOLLATION = createField("indcollation", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indclass</code>.
     */
    public final TableField<PgIndexRecord, Long[]> INDCLASS = createField("indclass", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indoption</code>.
     */
    public final TableField<PgIndexRecord, Object[]> INDOPTION = createField("indoption", org.jooq.impl.DefaultDataType.getDefaultDataType("int2vector").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indexprs</code>.
     */
    public final TableField<PgIndexRecord, Object> INDEXPRS = createField("indexprs", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indpred</code>.
     */
    public final TableField<PgIndexRecord, Object> INDPRED = createField("indpred", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

    /**
     * Create a <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex() {
        this("pg_index", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex(String alias) {
        this(alias, PG_INDEX);
    }

    private PgIndex(String alias, Table<PgIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgIndex(String alias, Table<PgIndexRecord> aliased, Field<?>[] parameters) {
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
    public PgIndex as(String alias) {
        return new PgIndex(alias, this);
    }

    /**
     * Rename this table
     */
    public PgIndex rename(String name) {
        return new PgIndex(name, null);
    }
}
