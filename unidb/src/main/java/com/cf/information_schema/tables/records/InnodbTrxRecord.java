/*
 * This file is generated by jOOQ.
*/
package com.cf.information_schema.tables.records;


import com.cf.information_schema.tables.InnodbTrx;

import java.sql.Timestamp;

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
public class InnodbTrxRecord extends TableRecordImpl<InnodbTrxRecord> {

    private static final long serialVersionUID = -902980787;

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_id</code>.
     */
    public void setTrxId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_id</code>.
     */
    public String getTrxId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_state</code>.
     */
    public void setTrxState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_state</code>.
     */
    public String getTrxState() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_started</code>.
     */
    public void setTrxStarted(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_started</code>.
     */
    public Timestamp getTrxStarted() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
     */
    public void setTrxRequestedLockId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
     */
    public String getTrxRequestedLockId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_wait_started</code>.
     */
    public void setTrxWaitStarted(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_wait_started</code>.
     */
    public Timestamp getTrxWaitStarted() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_weight</code>.
     */
    public void setTrxWeight(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_weight</code>.
     */
    public ULong getTrxWeight() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
     */
    public void setTrxMysqlThreadId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
     */
    public ULong getTrxMysqlThreadId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_query</code>.
     */
    public void setTrxQuery(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_query</code>.
     */
    public String getTrxQuery() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_operation_state</code>.
     */
    public void setTrxOperationState(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_operation_state</code>.
     */
    public String getTrxOperationState() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
     */
    public void setTrxTablesInUse(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
     */
    public ULong getTrxTablesInUse() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
     */
    public void setTrxTablesLocked(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
     */
    public ULong getTrxTablesLocked() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
     */
    public void setTrxLockStructs(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
     */
    public ULong getTrxLockStructs() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
     */
    public void setTrxLockMemoryBytes(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
     */
    public ULong getTrxLockMemoryBytes() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
     */
    public void setTrxRowsLocked(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
     */
    public ULong getTrxRowsLocked() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
     */
    public void setTrxRowsModified(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
     */
    public ULong getTrxRowsModified() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
     */
    public void setTrxConcurrencyTickets(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
     */
    public ULong getTrxConcurrencyTickets() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
     */
    public void setTrxIsolationLevel(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
     */
    public String getTrxIsolationLevel() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
     */
    public void setTrxUniqueChecks(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
     */
    public Integer getTrxUniqueChecks() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
     */
    public void setTrxForeignKeyChecks(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
     */
    public Integer getTrxForeignKeyChecks() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
     */
    public void setTrxLastForeignKeyError(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
     */
    public String getTrxLastForeignKeyError() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_latched</code>.
     */
    public void setTrxAdaptiveHashLatched(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_latched</code>.
     */
    public Integer getTrxAdaptiveHashLatched() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_timeout</code>.
     */
    public void setTrxAdaptiveHashTimeout(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_timeout</code>.
     */
    public ULong getTrxAdaptiveHashTimeout() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
     */
    public void setTrxIsReadOnly(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
     */
    public Integer getTrxIsReadOnly() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
     */
    public void setTrxAutocommitNonLocking(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
     */
    public Integer getTrxAutocommitNonLocking() {
        return (Integer) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbTrxRecord
     */
    public InnodbTrxRecord() {
        super(InnodbTrx.INNODB_TRX);
    }

    /**
     * Create a detached, initialised InnodbTrxRecord
     */
    public InnodbTrxRecord(String trxId, String trxState, Timestamp trxStarted, String trxRequestedLockId, Timestamp trxWaitStarted, ULong trxWeight, ULong trxMysqlThreadId, String trxQuery, String trxOperationState, ULong trxTablesInUse, ULong trxTablesLocked, ULong trxLockStructs, ULong trxLockMemoryBytes, ULong trxRowsLocked, ULong trxRowsModified, ULong trxConcurrencyTickets, String trxIsolationLevel, Integer trxUniqueChecks, Integer trxForeignKeyChecks, String trxLastForeignKeyError, Integer trxAdaptiveHashLatched, ULong trxAdaptiveHashTimeout, Integer trxIsReadOnly, Integer trxAutocommitNonLocking) {
        super(InnodbTrx.INNODB_TRX);

        set(0, trxId);
        set(1, trxState);
        set(2, trxStarted);
        set(3, trxRequestedLockId);
        set(4, trxWaitStarted);
        set(5, trxWeight);
        set(6, trxMysqlThreadId);
        set(7, trxQuery);
        set(8, trxOperationState);
        set(9, trxTablesInUse);
        set(10, trxTablesLocked);
        set(11, trxLockStructs);
        set(12, trxLockMemoryBytes);
        set(13, trxRowsLocked);
        set(14, trxRowsModified);
        set(15, trxConcurrencyTickets);
        set(16, trxIsolationLevel);
        set(17, trxUniqueChecks);
        set(18, trxForeignKeyChecks);
        set(19, trxLastForeignKeyError);
        set(20, trxAdaptiveHashLatched);
        set(21, trxAdaptiveHashTimeout);
        set(22, trxIsReadOnly);
        set(23, trxAutocommitNonLocking);
    }
}
