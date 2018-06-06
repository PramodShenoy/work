/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables.records;


import com.cf.sys.tables.X$ioGlobalByFileByLatency;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class X$ioGlobalByFileByLatencyRecord extends TableRecordImpl<X$ioGlobalByFileByLatencyRecord> implements Record9<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -1452244652;

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.file</code>.
     */
    public void setFile(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.file</code>.
     */
    public String getFile() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.total</code>.
     */
    public void setTotal(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.count_read</code>.
     */
    public void setCountRead(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.count_read</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.read_latency</code>.
     */
    public void setReadLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.read_latency</code>.
     */
    public ULong getReadLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.count_write</code>.
     */
    public void setCountWrite(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.count_write</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.write_latency</code>.
     */
    public void setWriteLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.write_latency</code>.
     */
    public ULong getWriteLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.count_misc</code>.
     */
    public void setCountMisc(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.count_misc</code>.
     */
    public ULong getCountMisc() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$io_global_by_file_by_latency.misc_latency</code>.
     */
    public void setMiscLatency(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_file_by_latency.misc_latency</code>.
     */
    public ULong getMiscLatency() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.COUNT_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.READ_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.COUNT_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.WRITE_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.COUNT_MISC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY.MISC_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getFile();
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
    public ULong component3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getCountRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getReadLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getCountWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getWriteLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getCountMisc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getMiscLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFile();
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
    public ULong value3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getCountRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getReadLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getCountWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getWriteLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getCountMisc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getMiscLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value1(String value) {
        setFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value2(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value3(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value4(ULong value) {
        setCountRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value5(ULong value) {
        setReadLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value6(ULong value) {
        setCountWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value7(ULong value) {
        setWriteLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value8(ULong value) {
        setCountMisc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord value9(ULong value) {
        setMiscLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByFileByLatencyRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$ioGlobalByFileByLatencyRecord
     */
    public X$ioGlobalByFileByLatencyRecord() {
        super(X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    /**
     * Create a detached, initialised X$ioGlobalByFileByLatencyRecord
     */
    public X$ioGlobalByFileByLatencyRecord(String file, ULong total, ULong totalLatency, ULong countRead, ULong readLatency, ULong countWrite, ULong writeLatency, ULong countMisc, ULong miscLatency) {
        super(X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY);

        set(0, file);
        set(1, total);
        set(2, totalLatency);
        set(3, countRead);
        set(4, readLatency);
        set(5, countWrite);
        set(6, writeLatency);
        set(7, countMisc);
        set(8, miscLatency);
    }
}
