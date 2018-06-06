/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables;


import com.cf.performance_schema.PerformanceSchema;
import com.cf.performance_schema.enums.EventsStagesCurrentNestingEventType;
import com.cf.performance_schema.tables.records.EventsStagesCurrentRecord;

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
public class EventsStagesCurrent extends TableImpl<EventsStagesCurrentRecord> {

    private static final long serialVersionUID = 140187965;

    /**
     * The reference instance of <code>performance_schema.events_stages_current</code>
     */
    public static final EventsStagesCurrent EVENTS_STAGES_CURRENT = new EventsStagesCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStagesCurrentRecord> getRecordType() {
        return EventsStagesCurrentRecord.class;
    }

    /**
     * The column <code>performance_schema.events_stages_current.THREAD_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_current.EVENT_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_current.END_EVENT_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.EVENT_NAME</code>.
     */
    public final TableField<EventsStagesCurrentRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_current.SOURCE</code>.
     */
    public final TableField<EventsStagesCurrentRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_stages_current.TIMER_START</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.TIMER_END</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.WORK_COMPLETED</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> WORK_COMPLETED = createField("WORK_COMPLETED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.WORK_ESTIMATED</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> WORK_ESTIMATED = createField("WORK_ESTIMATED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_current.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStagesCurrentRecord, EventsStagesCurrentNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.cf.performance_schema.enums.EventsStagesCurrentNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_stages_current</code> table reference
     */
    public EventsStagesCurrent() {
        this(DSL.name("events_stages_current"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_current</code> table reference
     */
    public EventsStagesCurrent(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_CURRENT);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_current</code> table reference
     */
    public EventsStagesCurrent(Name alias) {
        this(alias, EVENTS_STAGES_CURRENT);
    }

    private EventsStagesCurrent(Name alias, Table<EventsStagesCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesCurrent(Name alias, Table<EventsStagesCurrentRecord> aliased, Field<?>[] parameters) {
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
    public EventsStagesCurrent as(String alias) {
        return new EventsStagesCurrent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrent as(Name alias) {
        return new EventsStagesCurrent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesCurrent rename(String name) {
        return new EventsStagesCurrent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesCurrent rename(Name name) {
        return new EventsStagesCurrent(name, null);
    }
}
