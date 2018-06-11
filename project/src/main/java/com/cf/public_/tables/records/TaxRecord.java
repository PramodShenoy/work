/**
 * This class is generated by jOOQ
 */
package com.cf.public_.tables.records;


import com.cf.public_.tables.Tax;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.util.UUID;


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
public class TaxRecord extends UpdatableRecordImpl<TaxRecord> implements Record7<UUID, String, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 828387453;

    /**
     * Create a detached TaxRecord
     */
    public TaxRecord() {
        super(Tax.TAX);
    }

    /**
     * Create a detached, initialised TaxRecord
     */
    public TaxRecord(UUID appId, String state, Integer fromYear, Integer toYear, Integer taxType, Integer filingFreqency, Integer id) {
        super(Tax.TAX);

        set(0, appId);
        set(1, state);
        set(2, fromYear);
        set(3, toYear);
        set(4, taxType);
        set(5, filingFreqency);
        set(6, id);
    }

    /**
     * Getter for <code>public.tax.app_id</code>.
     */
    public UUID getAppId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.tax.app_id</code>.
     */
    public void setAppId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tax.state</code>.
     */
    public String getState() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tax.state</code>.
     */
    public void setState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tax.from_year</code>.
     */
    public Integer getFromYear() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.tax.from_year</code>.
     */
    public void setFromYear(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tax.to_year</code>.
     */
    public Integer getToYear() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.tax.to_year</code>.
     */
    public void setToYear(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tax.tax_type</code>.
     */
    public Integer getTaxType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.tax.tax_type</code>.
     */
    public void setTaxType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tax.filing_freqency</code>.
     */
    public Integer getFilingFreqency() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.tax.filing_freqency</code>.
     */
    public void setFilingFreqency(Integer value) {
        set(5, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>public.tax.id</code>.
     */
    public Integer getId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>public.tax.id</code>.
     */
    public void setId(Integer value) {
        set(6, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, String, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Tax.TAX.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tax.TAX.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Tax.TAX.FROM_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Tax.TAX.TO_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Tax.TAX.TAX_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Tax.TAX.FILING_FREQENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Tax.TAX.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFromYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getToYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTaxType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getFilingFreqency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value1(UUID value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value2(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value3(Integer value) {
        setFromYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value4(Integer value) {
        setToYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value5(Integer value) {
        setTaxType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value6(Integer value) {
        setFilingFreqency(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord value7(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaxRecord values(UUID value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }
}
