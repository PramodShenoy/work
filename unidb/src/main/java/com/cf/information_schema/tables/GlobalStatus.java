/*
 * This file is generated by jOOQ.
*/
package com.cf.information_schema.tables;


import com.cf.information_schema.InformationSchema;
import com.cf.information_schema.tables.records.GlobalStatusRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class GlobalStatus extends TableImpl<GlobalStatusRecord> {

    private static final long serialVersionUID = 642251408;

    /**
     * The reference instance of <code>information_schema.GLOBAL_STATUS</code>
     */
    public static final GlobalStatus GLOBAL_STATUS = new GlobalStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalStatusRecord> getRecordType() {
        return GlobalStatusRecord.class;
    }

    /**
     * The column <code>information_schema.GLOBAL_STATUS.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.GLOBAL_STATUS.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>information_schema.GLOBAL_STATUS</code> table reference
     */
    public GlobalStatus() {
        this(DSL.name("GLOBAL_STATUS"), null);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_STATUS</code> table reference
     */
    public GlobalStatus(String alias) {
        this(DSL.name(alias), GLOBAL_STATUS);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_STATUS</code> table reference
     */
    public GlobalStatus(Name alias) {
        this(alias, GLOBAL_STATUS);
    }

    private GlobalStatus(Name alias, Table<GlobalStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalStatus(Name alias, Table<GlobalStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatus as(String alias) {
        return new GlobalStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatus as(Name alias) {
        return new GlobalStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalStatus rename(String name) {
        return new GlobalStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalStatus rename(Name name) {
        return new GlobalStatus(name, null);
    }
}