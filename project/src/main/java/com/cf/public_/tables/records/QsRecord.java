/**
 * This class is generated by jOOQ
 */
package com.cf.public_.tables.records;


import com.cf.public_.tables.Qs;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class QsRecord extends TableRecordImpl<QsRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1334593931;

    /**
     * Create a detached QsRecord
     */
    public QsRecord() {
        super(Qs.QS);
    }

    /**
     * Create a detached, initialised QsRecord
     */
    public QsRecord(Integer id, Integer rating) {
        super(Qs.QS);

        set(0, id);
        set(1, rating);
    }

    /**
     * Getter for <code>public.qs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.qs.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>public.qs.rating</code>.
     */
    public Integer getRating() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.qs.rating</code>.
     */
    public void setRating(Integer value) {
        set(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Qs.QS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Qs.QS.RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public QsRecord value2(Integer value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QsRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }
}
