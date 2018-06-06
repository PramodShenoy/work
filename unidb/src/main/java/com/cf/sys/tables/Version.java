/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables;


import com.cf.sys.Sys;
import com.cf.sys.tables.records.VersionRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Version extends TableImpl<VersionRecord> {

    private static final long serialVersionUID = 282964663;

    /**
     * The reference instance of <code>sys.version</code>
     */
    public static final Version VERSION = new Version();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VersionRecord> getRecordType() {
        return VersionRecord.class;
    }

    /**
     * The column <code>sys.version.sys_version</code>.
     */
    public final TableField<VersionRecord, String> SYS_VERSION = createField("sys_version", org.jooq.impl.SQLDataType.VARCHAR(5).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.version.mysql_version</code>.
     */
    public final TableField<VersionRecord, String> MYSQL_VERSION = createField("mysql_version", org.jooq.impl.SQLDataType.VARCHAR(23).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>sys.version</code> table reference
     */
    public Version() {
        this(DSL.name("version"), null);
    }

    /**
     * Create an aliased <code>sys.version</code> table reference
     */
    public Version(String alias) {
        this(DSL.name(alias), VERSION);
    }

    /**
     * Create an aliased <code>sys.version</code> table reference
     */
    public Version(Name alias) {
        this(alias, VERSION);
    }

    private Version(Name alias, Table<VersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Version(Name alias, Table<VersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Version as(String alias) {
        return new Version(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Version as(Name alias) {
        return new Version(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(String name) {
        return new Version(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(Name name) {
        return new Version(name, null);
    }
}
