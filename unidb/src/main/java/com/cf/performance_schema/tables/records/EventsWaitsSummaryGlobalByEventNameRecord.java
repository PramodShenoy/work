/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables.records;


import com.cf.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
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
public class EventsWaitsSummaryGlobalByEventNameRecord extends TableRecordImpl<EventsWaitsSummaryGlobalByEventNameRecord> implements Record6<String, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 272482454;

    /**
     * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_STAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord value2(ULong value) {
        setCountStar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord value3(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord value4(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord value5(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord value6(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryGlobalByEventNameRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsWaitsSummaryGlobalByEventNameRecord
     */
    public EventsWaitsSummaryGlobalByEventNameRecord() {
        super(EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised EventsWaitsSummaryGlobalByEventNameRecord
     */
    public EventsWaitsSummaryGlobalByEventNameRecord(String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait) {
        super(EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);

        set(0, eventName);
        set(1, countStar);
        set(2, sumTimerWait);
        set(3, minTimerWait);
        set(4, avgTimerWait);
        set(5, maxTimerWait);
    }
}