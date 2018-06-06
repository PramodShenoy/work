/*
 * This file is generated by jOOQ.
*/
package com.cf.information_schema.tables.records;


import com.cf.information_schema.tables.InnodbFtDefaultStopword;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class InnodbFtDefaultStopwordRecord extends TableRecordImpl<InnodbFtDefaultStopwordRecord> implements Record1<String> {

    private static final long serialVersionUID = -1843214048;

    /**
     * Setter for <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    public void setValue(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    public String getValue() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFtDefaultStopwordRecord value1(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFtDefaultStopwordRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord() {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);
    }

    /**
     * Create a detached, initialised InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord(String value) {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);

        set(0, value);
    }
}
