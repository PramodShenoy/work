/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables;


import com.cf.sys.Sys;
import com.cf.sys.tables.records.UserSummaryByFileIoTypeRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class UserSummaryByFileIoType extends TableImpl<UserSummaryByFileIoTypeRecord> {

    private static final long serialVersionUID = -1771124914;

    /**
     * The reference instance of <code>sys.user_summary_by_file_io_type</code>
     */
    public static final UserSummaryByFileIoType USER_SUMMARY_BY_FILE_IO_TYPE = new UserSummaryByFileIoType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSummaryByFileIoTypeRecord> getRecordType() {
        return UserSummaryByFileIoTypeRecord.class;
    }

    /**
     * The column <code>sys.user_summary_by_file_io_type.user</code>.
     */
    public final TableField<UserSummaryByFileIoTypeRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.event_name</code>.
     */
    public final TableField<UserSummaryByFileIoTypeRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.total</code>.
     */
    public final TableField<UserSummaryByFileIoTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.latency</code>.
     */
    public final TableField<UserSummaryByFileIoTypeRecord, String> LATENCY = createField("latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.max_latency</code>.
     */
    public final TableField<UserSummaryByFileIoTypeRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.user_summary_by_file_io_type</code> table reference
     */
    public UserSummaryByFileIoType() {
        this(DSL.name("user_summary_by_file_io_type"), null);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_file_io_type</code> table reference
     */
    public UserSummaryByFileIoType(String alias) {
        this(DSL.name(alias), USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_file_io_type</code> table reference
     */
    public UserSummaryByFileIoType(Name alias) {
        this(alias, USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    private UserSummaryByFileIoType(Name alias, Table<UserSummaryByFileIoTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSummaryByFileIoType(Name alias, Table<UserSummaryByFileIoTypeRecord> aliased, Field<?>[] parameters) {
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
    public UserSummaryByFileIoType as(String alias) {
        return new UserSummaryByFileIoType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByFileIoType as(Name alias) {
        return new UserSummaryByFileIoType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByFileIoType rename(String name) {
        return new UserSummaryByFileIoType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByFileIoType rename(Name name) {
        return new UserSummaryByFileIoType(name, null);
    }
}
