/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables.records;


import com.cf.sys.tables.WaitsGlobalByLatency;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
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
public class WaitsGlobalByLatencyRecord extends TableRecordImpl<WaitsGlobalByLatencyRecord> implements Record5<String, ULong, String, String, String> {

    private static final long serialVersionUID = 879653199;

    /**
     * Setter for <code>sys.waits_global_by_latency.events</code>.
     */
    public void setEvents(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.waits_global_by_latency.events</code>.
     */
    public String getEvents() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.waits_global_by_latency.total</code>.
     */
    public void setTotal(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.waits_global_by_latency.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>sys.waits_global_by_latency.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.waits_global_by_latency.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.waits_global_by_latency.avg_latency</code>.
     */
    public void setAvgLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.waits_global_by_latency.avg_latency</code>.
     */
    public String getAvgLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.waits_global_by_latency.max_latency</code>.
     */
    public void setMaxLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.waits_global_by_latency.max_latency</code>.
     */
    public String getMaxLatency() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, ULong, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, ULong, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY.EVENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEvents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEvents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatencyRecord value1(String value) {
        setEvents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatencyRecord value2(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatencyRecord value3(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatencyRecord value4(String value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatencyRecord value5(String value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatencyRecord values(String value1, ULong value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WaitsGlobalByLatencyRecord
     */
    public WaitsGlobalByLatencyRecord() {
        super(WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY);
    }

    /**
     * Create a detached, initialised WaitsGlobalByLatencyRecord
     */
    public WaitsGlobalByLatencyRecord(String events, ULong total, String totalLatency, String avgLatency, String maxLatency) {
        super(WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY);

        set(0, events);
        set(1, total);
        set(2, totalLatency);
        set(3, avgLatency);
        set(4, maxLatency);
    }
}