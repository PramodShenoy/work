/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables;


import com.cf.performance_schema.PerformanceSchema;
import com.cf.performance_schema.enums.EventsTransactionsHistoryLongAccessMode;
import com.cf.performance_schema.enums.EventsTransactionsHistoryLongAutocommit;
import com.cf.performance_schema.enums.EventsTransactionsHistoryLongNestingEventType;
import com.cf.performance_schema.enums.EventsTransactionsHistoryLongState;
import com.cf.performance_schema.tables.records.EventsTransactionsHistoryLongRecord;

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
public class EventsTransactionsHistoryLong extends TableImpl<EventsTransactionsHistoryLongRecord> {

    private static final long serialVersionUID = -1538958205;

    /**
     * The reference instance of <code>performance_schema.events_transactions_history_long</code>
     */
    public static final EventsTransactionsHistoryLong EVENTS_TRANSACTIONS_HISTORY_LONG = new EventsTransactionsHistoryLong();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsHistoryLongRecord> getRecordType() {
        return EventsTransactionsHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.STATE</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongState> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.cf.performance_schema.enums.EventsTransactionsHistoryLongState.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.TRX_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> TRX_ID = createField("TRX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.GTID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> GTID = createField("GTID", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.XID_FORMAT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, Integer> XID_FORMAT_ID = createField("XID_FORMAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.XID_GTRID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> XID_GTRID = createField("XID_GTRID", org.jooq.impl.SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.XID_BQUAL</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> XID_BQUAL = createField("XID_BQUAL", org.jooq.impl.SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.XA_STATE</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> XA_STATE = createField("XA_STATE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.SOURCE</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.TIMER_START</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.TIMER_END</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.ACCESS_MODE</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongAccessMode> ACCESS_MODE = createField("ACCESS_MODE", org.jooq.impl.SQLDataType.VARCHAR(10).asEnumDataType(com.cf.performance_schema.enums.EventsTransactionsHistoryLongAccessMode.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.ISOLATION_LEVEL</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, String> ISOLATION_LEVEL = createField("ISOLATION_LEVEL", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.AUTOCOMMIT</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongAutocommit> AUTOCOMMIT = createField("AUTOCOMMIT", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.cf.performance_schema.enums.EventsTransactionsHistoryLongAutocommit.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.NUMBER_OF_SAVEPOINTS</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> NUMBER_OF_SAVEPOINTS = createField("NUMBER_OF_SAVEPOINTS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> NUMBER_OF_ROLLBACK_TO_SAVEPOINT = createField("NUMBER_OF_ROLLBACK_TO_SAVEPOINT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> NUMBER_OF_RELEASE_SAVEPOINT = createField("NUMBER_OF_RELEASE_SAVEPOINT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.cf.performance_schema.enums.EventsTransactionsHistoryLongNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_history_long</code> table reference
     */
    public EventsTransactionsHistoryLong() {
        this(DSL.name("events_transactions_history_long"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_history_long</code> table reference
     */
    public EventsTransactionsHistoryLong(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_HISTORY_LONG);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_history_long</code> table reference
     */
    public EventsTransactionsHistoryLong(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_HISTORY_LONG);
    }

    private EventsTransactionsHistoryLong(Name alias, Table<EventsTransactionsHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsHistoryLong(Name alias, Table<EventsTransactionsHistoryLongRecord> aliased, Field<?>[] parameters) {
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
    public EventsTransactionsHistoryLong as(String alias) {
        return new EventsTransactionsHistoryLong(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsHistoryLong as(Name alias) {
        return new EventsTransactionsHistoryLong(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsHistoryLong rename(String name) {
        return new EventsTransactionsHistoryLong(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsHistoryLong rename(Name name) {
        return new EventsTransactionsHistoryLong(name, null);
    }
}
