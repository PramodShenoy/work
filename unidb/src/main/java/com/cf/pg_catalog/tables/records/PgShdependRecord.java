/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.tables.records;


import com.cf.pg_catalog.tables.PgShdepend;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShdependRecord extends TableRecordImpl<PgShdependRecord> implements Record7<Long, Long, Long, Integer, Long, Long, String> {

    private static final long serialVersionUID = -675274869;

    /**
     * Setter for <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public void setDbid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public Long getDbid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public void setClassid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public void setObjid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public void setRefclassid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public Long getRefclassid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public void setRefobjid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public Long getRefobjid() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public void setDeptype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public String getDeptype() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Integer, Long, Long, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Integer, Long, Long, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgShdepend.PG_SHDEPEND.DBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgShdepend.PG_SHDEPEND.CLASSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgShdepend.PG_SHDEPEND.OBJID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PgShdepend.PG_SHDEPEND.OBJSUBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgShdepend.PG_SHDEPEND.REFCLASSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgShdepend.PG_SHDEPEND.REFOBJID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgShdepend.PG_SHDEPEND.DEPTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getClassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getObjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getObjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRefclassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getRefobjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDeptype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value1(Long value) {
        setDbid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value2(Long value) {
        setClassid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value3(Long value) {
        setObjid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value4(Integer value) {
        setObjsubid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value5(Long value) {
        setRefclassid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value6(Long value) {
        setRefobjid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord value7(String value) {
        setDeptype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShdependRecord values(Long value1, Long value2, Long value3, Integer value4, Long value5, Long value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShdependRecord
     */
    public PgShdependRecord() {
        super(PgShdepend.PG_SHDEPEND);
    }

    /**
     * Create a detached, initialised PgShdependRecord
     */
    public PgShdependRecord(Long dbid, Long classid, Long objid, Integer objsubid, Long refclassid, Long refobjid, String deptype) {
        super(PgShdepend.PG_SHDEPEND);

        set(0, dbid);
        set(1, classid);
        set(2, objid);
        set(3, objsubid);
        set(4, refclassid);
        set(5, refobjid);
        set(6, deptype);
    }
}
