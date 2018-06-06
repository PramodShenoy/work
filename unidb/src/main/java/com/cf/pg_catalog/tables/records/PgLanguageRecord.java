/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.tables.records;


import com.cf.pg_catalog.tables.PgLanguage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgLanguageRecord extends TableRecordImpl<PgLanguageRecord> implements Record8<String, Long, Boolean, Boolean, Long, Long, Long, String[]> {

    private static final long serialVersionUID = 1654705298;

    /**
     * Setter for <code>pg_catalog.pg_language.lanname</code>.
     */
    public void setLanname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanname</code>.
     */
    public String getLanname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanowner</code>.
     */
    public void setLanowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanowner</code>.
     */
    public Long getLanowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanispl</code>.
     */
    public void setLanispl(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanispl</code>.
     */
    public Boolean getLanispl() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public void setLanpltrusted(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public Boolean getLanpltrusted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public void setLanplcallfoid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public Long getLanplcallfoid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.laninline</code>.
     */
    public void setLaninline(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.laninline</code>.
     */
    public Long getLaninline() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public void setLanvalidator(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public Long getLanvalidator() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanacl</code>.
     */
    public void setLanacl(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanacl</code>.
     */
    public String[] getLanacl() {
        return (String[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Long, Boolean, Boolean, Long, Long, Long, String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Long, Boolean, Boolean, Long, Long, Long, String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgLanguage.PG_LANGUAGE.LANNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgLanguage.PG_LANGUAGE.LANOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgLanguage.PG_LANGUAGE.LANISPL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgLanguage.PG_LANGUAGE.LANPLTRUSTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgLanguage.PG_LANGUAGE.LANPLCALLFOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgLanguage.PG_LANGUAGE.LANINLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgLanguage.PG_LANGUAGE.LANVALIDATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return PgLanguage.PG_LANGUAGE.LANACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLanname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getLanowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getLanispl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getLanpltrusted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getLanplcallfoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getLaninline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getLanvalidator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getLanacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value1(String value) {
        setLanname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value2(Long value) {
        setLanowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value3(Boolean value) {
        setLanispl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value4(Boolean value) {
        setLanpltrusted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value5(Long value) {
        setLanplcallfoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value6(Long value) {
        setLaninline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value7(Long value) {
        setLanvalidator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord value8(String[] value) {
        setLanacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLanguageRecord values(String value1, Long value2, Boolean value3, Boolean value4, Long value5, Long value6, Long value7, String[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLanguageRecord
     */
    public PgLanguageRecord() {
        super(PgLanguage.PG_LANGUAGE);
    }

    /**
     * Create a detached, initialised PgLanguageRecord
     */
    public PgLanguageRecord(String lanname, Long lanowner, Boolean lanispl, Boolean lanpltrusted, Long lanplcallfoid, Long laninline, Long lanvalidator, String[] lanacl) {
        super(PgLanguage.PG_LANGUAGE);

        set(0, lanname);
        set(1, lanowner);
        set(2, lanispl);
        set(3, lanpltrusted);
        set(4, lanplcallfoid);
        set(5, laninline);
        set(6, lanvalidator);
        set(7, lanacl);
    }
}
