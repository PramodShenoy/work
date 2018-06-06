/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables;


import com.cf.sys.Sys;
import com.cf.sys.tables.records.X$hostSummaryByStagesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class X$hostSummaryByStages extends TableImpl<X$hostSummaryByStagesRecord> {

    private static final long serialVersionUID = -1520962377;

    /**
     * The reference instance of <code>sys.x$host_summary_by_stages</code>
     */
    public static final X$hostSummaryByStages X$HOST_SUMMARY_BY_STAGES = new X$hostSummaryByStages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryByStagesRecord> getRecordType() {
        return X$hostSummaryByStagesRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_stages.host</code>.
     */
    public final TableField<X$hostSummaryByStagesRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.x$host_summary_by_stages.event_name</code>.
     */
    public final TableField<X$hostSummaryByStagesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_stages.total</code>.
     */
    public final TableField<X$hostSummaryByStagesRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_stages.total_latency</code>.
     */
    public final TableField<X$hostSummaryByStagesRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_stages.avg_latency</code>.
     */
    public final TableField<X$hostSummaryByStagesRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$host_summary_by_stages</code> table reference
     */
    public X$hostSummaryByStages() {
        this(DSL.name("x$host_summary_by_stages"), null);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_stages</code> table reference
     */
    public X$hostSummaryByStages(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY_BY_STAGES);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_stages</code> table reference
     */
    public X$hostSummaryByStages(Name alias) {
        this(alias, X$HOST_SUMMARY_BY_STAGES);
    }

    private X$hostSummaryByStages(Name alias, Table<X$hostSummaryByStagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByStages(Name alias, Table<X$hostSummaryByStagesRecord> aliased, Field<?>[] parameters) {
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
    public X$hostSummaryByStages as(String alias) {
        return new X$hostSummaryByStages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStages as(Name alias) {
        return new X$hostSummaryByStages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByStages rename(String name) {
        return new X$hostSummaryByStages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByStages rename(Name name) {
        return new X$hostSummaryByStages(name, null);
    }
}
