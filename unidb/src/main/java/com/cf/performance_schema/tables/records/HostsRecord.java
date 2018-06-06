/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables.records;


import com.cf.performance_schema.tables.Hosts;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class HostsRecord extends TableRecordImpl<HostsRecord> implements Record3<String, Long, Long> {

    private static final long serialVersionUID = 61678695;

    /**
     * Setter for <code>performance_schema.hosts.HOST</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.hosts.HOST</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.hosts.CURRENT_CONNECTIONS</code>.
     */
    public void setCurrentConnections(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.hosts.CURRENT_CONNECTIONS</code>.
     */
    public Long getCurrentConnections() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>performance_schema.hosts.TOTAL_CONNECTIONS</code>.
     */
    public void setTotalConnections(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.hosts.TOTAL_CONNECTIONS</code>.
     */
    public Long getTotalConnections() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Hosts.HOSTS.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Hosts.HOSTS.CURRENT_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Hosts.HOSTS.TOTAL_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCurrentConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getTotalConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCurrentConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getTotalConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostsRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostsRecord value2(Long value) {
        setCurrentConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostsRecord value3(Long value) {
        setTotalConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostsRecord values(String value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HostsRecord
     */
    public HostsRecord() {
        super(Hosts.HOSTS);
    }

    /**
     * Create a detached, initialised HostsRecord
     */
    public HostsRecord(String host, Long currentConnections, Long totalConnections) {
        super(Hosts.HOSTS);

        set(0, host);
        set(1, currentConnections);
        set(2, totalConnections);
    }
}
