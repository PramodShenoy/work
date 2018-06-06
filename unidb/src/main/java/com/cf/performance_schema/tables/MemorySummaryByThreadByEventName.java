/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables;


import com.cf.performance_schema.PerformanceSchema;
import com.cf.performance_schema.tables.records.MemorySummaryByThreadByEventNameRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemorySummaryByThreadByEventName extends TableImpl<MemorySummaryByThreadByEventNameRecord> {

    private static final long serialVersionUID = 1537171959;

    /**
     * The reference instance of <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     */
    public static final MemorySummaryByThreadByEventName MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME = new MemorySummaryByThreadByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemorySummaryByThreadByEventNameRecord> getRecordType() {
        return MemorySummaryByThreadByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_ALLOC</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> COUNT_ALLOC = createField("COUNT_ALLOC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_FREE</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> COUNT_FREE = createField("COUNT_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_ALLOC = createField("SUM_NUMBER_OF_BYTES_ALLOC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_FREE = createField("SUM_NUMBER_OF_BYTES_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> LOW_COUNT_USED = createField("LOW_COUNT_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> CURRENT_COUNT_USED = createField("CURRENT_COUNT_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> HIGH_COUNT_USED = createField("HIGH_COUNT_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> LOW_NUMBER_OF_BYTES_USED = createField("LOW_NUMBER_OF_BYTES_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> CURRENT_NUMBER_OF_BYTES_USED = createField("CURRENT_NUMBER_OF_BYTES_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> HIGH_NUMBER_OF_BYTES_USED = createField("HIGH_NUMBER_OF_BYTES_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.memory_summary_by_thread_by_event_name</code> table reference
     */
    public MemorySummaryByThreadByEventName() {
        this(DSL.name("memory_summary_by_thread_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.memory_summary_by_thread_by_event_name</code> table reference
     */
    public MemorySummaryByThreadByEventName(String alias) {
        this(DSL.name(alias), MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.memory_summary_by_thread_by_event_name</code> table reference
     */
    public MemorySummaryByThreadByEventName(Name alias) {
        this(alias, MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    private MemorySummaryByThreadByEventName(Name alias, Table<MemorySummaryByThreadByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemorySummaryByThreadByEventName(Name alias, Table<MemorySummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryByThreadByEventName as(String alias) {
        return new MemorySummaryByThreadByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryByThreadByEventName as(Name alias) {
        return new MemorySummaryByThreadByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByThreadByEventName rename(String name) {
        return new MemorySummaryByThreadByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByThreadByEventName rename(Name name) {
        return new MemorySummaryByThreadByEventName(name, null);
    }
}
