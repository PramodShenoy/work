/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables.records;


import com.cf.performance_schema.tables.FileSummaryByInstance;

import javax.annotation.Generated;

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
public class FileSummaryByInstanceRecord extends TableRecordImpl<FileSummaryByInstanceRecord> {

    private static final long serialVersionUID = -1782187464;

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.FILE_NAME</code>.
     */
    public void setFileName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.COUNT_READ</code>.
     */
    public void setCountRead(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.COUNT_READ</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_READ</code>.
     */
    public void setSumTimerRead(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_READ</code>.
     */
    public ULong getSumTimerRead() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_READ</code>.
     */
    public void setMinTimerRead(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_READ</code>.
     */
    public ULong getMinTimerRead() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_READ</code>.
     */
    public void setAvgTimerRead(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_READ</code>.
     */
    public ULong getAvgTimerRead() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_READ</code>.
     */
    public void setMaxTimerRead(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_READ</code>.
     */
    public ULong getMaxTimerRead() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public void setSumNumberOfBytesRead(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public Long getSumNumberOfBytesRead() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.COUNT_WRITE</code>.
     */
    public void setCountWrite(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.COUNT_WRITE</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WRITE</code>.
     */
    public void setSumTimerWrite(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WRITE</code>.
     */
    public ULong getSumTimerWrite() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WRITE</code>.
     */
    public void setMinTimerWrite(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WRITE</code>.
     */
    public ULong getMinTimerWrite() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WRITE</code>.
     */
    public void setAvgTimerWrite(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WRITE</code>.
     */
    public ULong getAvgTimerWrite() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WRITE</code>.
     */
    public void setMaxTimerWrite(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WRITE</code>.
     */
    public ULong getMaxTimerWrite() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public void setSumNumberOfBytesWrite(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public Long getSumNumberOfBytesWrite() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.COUNT_MISC</code>.
     */
    public void setCountMisc(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.COUNT_MISC</code>.
     */
    public ULong getCountMisc() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_MISC</code>.
     */
    public void setSumTimerMisc(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_MISC</code>.
     */
    public ULong getSumTimerMisc() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_MISC</code>.
     */
    public void setMinTimerMisc(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_MISC</code>.
     */
    public ULong getMinTimerMisc() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_MISC</code>.
     */
    public void setAvgTimerMisc(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_MISC</code>.
     */
    public ULong getAvgTimerMisc() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_MISC</code>.
     */
    public void setMaxTimerMisc(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_MISC</code>.
     */
    public ULong getMaxTimerMisc() {
        return (ULong) get(24);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FileSummaryByInstanceRecord
     */
    public FileSummaryByInstanceRecord() {
        super(FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create a detached, initialised FileSummaryByInstanceRecord
     */
    public FileSummaryByInstanceRecord(String fileName, String eventName, ULong objectInstanceBegin, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, Long sumNumberOfBytesRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, Long sumNumberOfBytesWrite, ULong countMisc, ULong sumTimerMisc, ULong minTimerMisc, ULong avgTimerMisc, ULong maxTimerMisc) {
        super(FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE);

        set(0, fileName);
        set(1, eventName);
        set(2, objectInstanceBegin);
        set(3, countStar);
        set(4, sumTimerWait);
        set(5, minTimerWait);
        set(6, avgTimerWait);
        set(7, maxTimerWait);
        set(8, countRead);
        set(9, sumTimerRead);
        set(10, minTimerRead);
        set(11, avgTimerRead);
        set(12, maxTimerRead);
        set(13, sumNumberOfBytesRead);
        set(14, countWrite);
        set(15, sumTimerWrite);
        set(16, minTimerWrite);
        set(17, avgTimerWrite);
        set(18, maxTimerWrite);
        set(19, sumNumberOfBytesWrite);
        set(20, countMisc);
        set(21, sumTimerMisc);
        set(22, minTimerMisc);
        set(23, avgTimerMisc);
        set(24, maxTimerMisc);
    }
}
