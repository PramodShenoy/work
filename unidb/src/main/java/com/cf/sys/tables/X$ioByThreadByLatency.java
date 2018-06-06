/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables;


import com.cf.sys.Sys;
import com.cf.sys.tables.records.X$ioByThreadByLatencyRecord;

import java.math.BigDecimal;
import java.math.BigInteger;

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
public class X$ioByThreadByLatency extends TableImpl<X$ioByThreadByLatencyRecord> {

    private static final long serialVersionUID = 1036141910;

    /**
     * The reference instance of <code>sys.x$io_by_thread_by_latency</code>
     */
    public static final X$ioByThreadByLatency X$IO_BY_THREAD_BY_LATENCY = new X$ioByThreadByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$ioByThreadByLatencyRecord> getRecordType() {
        return X$ioByThreadByLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$io_by_thread_by_latency.user</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, BigInteger> TOTAL = createField("total", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total_latency</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, BigInteger> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.min_latency</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, ULong> MIN_LATENCY = createField("min_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.avg_latency</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, BigDecimal> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.DECIMAL(24, 4), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.max_latency</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.thread_id</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, ULong> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.processlist_id</code>.
     */
    public final TableField<X$ioByThreadByLatencyRecord, ULong> PROCESSLIST_ID = createField("processlist_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * Create a <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    public X$ioByThreadByLatency() {
        this(DSL.name("x$io_by_thread_by_latency"), null);
    }

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    public X$ioByThreadByLatency(String alias) {
        this(DSL.name(alias), X$IO_BY_THREAD_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    public X$ioByThreadByLatency(Name alias) {
        this(alias, X$IO_BY_THREAD_BY_LATENCY);
    }

    private X$ioByThreadByLatency(Name alias, Table<X$ioByThreadByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$ioByThreadByLatency(Name alias, Table<X$ioByThreadByLatencyRecord> aliased, Field<?>[] parameters) {
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
    public X$ioByThreadByLatency as(String alias) {
        return new X$ioByThreadByLatency(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioByThreadByLatency as(Name alias) {
        return new X$ioByThreadByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioByThreadByLatency rename(String name) {
        return new X$ioByThreadByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioByThreadByLatency rename(Name name) {
        return new X$ioByThreadByLatency(name, null);
    }
}
