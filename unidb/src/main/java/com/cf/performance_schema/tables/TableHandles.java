/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables;


import com.cf.performance_schema.PerformanceSchema;
import com.cf.performance_schema.tables.records.TableHandlesRecord;

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
public class TableHandles extends TableImpl<TableHandlesRecord> {

    private static final long serialVersionUID = 1493093221;

    /**
     * The reference instance of <code>performance_schema.table_handles</code>
     */
    public static final TableHandles TABLE_HANDLES = new TableHandles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableHandlesRecord> getRecordType() {
        return TableHandlesRecord.class;
    }

    /**
     * The column <code>performance_schema.table_handles.OBJECT_TYPE</code>.
     */
    public final TableField<TableHandlesRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OBJECT_SCHEMA</code>.
     */
    public final TableField<TableHandlesRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OBJECT_NAME</code>.
     */
    public final TableField<TableHandlesRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<TableHandlesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OWNER_THREAD_ID</code>.
     */
    public final TableField<TableHandlesRecord, ULong> OWNER_THREAD_ID = createField("OWNER_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.table_handles.OWNER_EVENT_ID</code>.
     */
    public final TableField<TableHandlesRecord, ULong> OWNER_EVENT_ID = createField("OWNER_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.table_handles.INTERNAL_LOCK</code>.
     */
    public final TableField<TableHandlesRecord, String> INTERNAL_LOCK = createField("INTERNAL_LOCK", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_handles.EXTERNAL_LOCK</code>.
     */
    public final TableField<TableHandlesRecord, String> EXTERNAL_LOCK = createField("EXTERNAL_LOCK", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>performance_schema.table_handles</code> table reference
     */
    public TableHandles() {
        this(DSL.name("table_handles"), null);
    }

    /**
     * Create an aliased <code>performance_schema.table_handles</code> table reference
     */
    public TableHandles(String alias) {
        this(DSL.name(alias), TABLE_HANDLES);
    }

    /**
     * Create an aliased <code>performance_schema.table_handles</code> table reference
     */
    public TableHandles(Name alias) {
        this(alias, TABLE_HANDLES);
    }

    private TableHandles(Name alias, Table<TableHandlesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableHandles(Name alias, Table<TableHandlesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableHandles as(String alias) {
        return new TableHandles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableHandles as(Name alias) {
        return new TableHandles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableHandles rename(String name) {
        return new TableHandles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableHandles rename(Name name) {
        return new TableHandles(name, null);
    }
}
