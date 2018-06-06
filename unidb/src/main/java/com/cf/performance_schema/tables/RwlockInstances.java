/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema.tables;


import com.cf.performance_schema.PerformanceSchema;
import com.cf.performance_schema.tables.records.RwlockInstancesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
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
public class RwlockInstances extends TableImpl<RwlockInstancesRecord> {

    private static final long serialVersionUID = 794892762;

    /**
     * The reference instance of <code>performance_schema.rwlock_instances</code>
     */
    public static final RwlockInstances RWLOCK_INSTANCES = new RwlockInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RwlockInstancesRecord> getRecordType() {
        return RwlockInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.rwlock_instances.NAME</code>.
     */
    public final TableField<RwlockInstancesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<RwlockInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
     */
    public final TableField<RwlockInstancesRecord, ULong> WRITE_LOCKED_BY_THREAD_ID = createField("WRITE_LOCKED_BY_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
     */
    public final TableField<RwlockInstancesRecord, UInteger> READ_LOCKED_BY_COUNT = createField("READ_LOCKED_BY_COUNT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances() {
        this(DSL.name("rwlock_instances"), null);
    }

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances(String alias) {
        this(DSL.name(alias), RWLOCK_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances(Name alias) {
        this(alias, RWLOCK_INSTANCES);
    }

    private RwlockInstances(Name alias, Table<RwlockInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RwlockInstances(Name alias, Table<RwlockInstancesRecord> aliased, Field<?>[] parameters) {
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
    public RwlockInstances as(String alias) {
        return new RwlockInstances(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RwlockInstances as(Name alias) {
        return new RwlockInstances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RwlockInstances rename(String name) {
        return new RwlockInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RwlockInstances rename(Name name) {
        return new RwlockInstances(name, null);
    }
}