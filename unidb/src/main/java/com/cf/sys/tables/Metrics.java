/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables;


import com.cf.sys.Sys;
import com.cf.sys.tables.records.MetricsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Metrics extends TableImpl<MetricsRecord> {

    private static final long serialVersionUID = -2081851836;

    /**
     * The reference instance of <code>sys.metrics</code>
     */
    public static final Metrics METRICS = new Metrics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetricsRecord> getRecordType() {
        return MetricsRecord.class;
    }

    /**
     * The column <code>sys.metrics.Variable_name</code>.
     */
    public final TableField<MetricsRecord, String> VARIABLE_NAME = createField("Variable_name", org.jooq.impl.SQLDataType.VARCHAR(193), this, "");

    /**
     * The column <code>sys.metrics.Variable_value</code>.
     */
    public final TableField<MetricsRecord, String> VARIABLE_VALUE = createField("Variable_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.metrics.Type</code>.
     */
    public final TableField<MetricsRecord, String> TYPE = createField("Type", org.jooq.impl.SQLDataType.VARCHAR(210), this, "");

    /**
     * The column <code>sys.metrics.Enabled</code>.
     */
    public final TableField<MetricsRecord, String> ENABLED = createField("Enabled", org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>sys.metrics</code> table reference
     */
    public Metrics() {
        this(DSL.name("metrics"), null);
    }

    /**
     * Create an aliased <code>sys.metrics</code> table reference
     */
    public Metrics(String alias) {
        this(DSL.name(alias), METRICS);
    }

    /**
     * Create an aliased <code>sys.metrics</code> table reference
     */
    public Metrics(Name alias) {
        this(alias, METRICS);
    }

    private Metrics(Name alias, Table<MetricsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Metrics(Name alias, Table<MetricsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Metrics as(String alias) {
        return new Metrics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Metrics as(Name alias) {
        return new Metrics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Metrics rename(String name) {
        return new Metrics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Metrics rename(Name name) {
        return new Metrics(name, null);
    }
}
