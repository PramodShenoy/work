/*
 * This file is generated by jOOQ.
*/
package com.cf.mysql.tables;


import com.cf.mysql.Indexes;
import com.cf.mysql.Keys;
import com.cf.mysql.Mysql;
import com.cf.mysql.tables.records.SlaveWorkerInfoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Worker Information
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveWorkerInfo extends TableImpl<SlaveWorkerInfoRecord> {

    private static final long serialVersionUID = 406360538;

    /**
     * The reference instance of <code>mysql.slave_worker_info</code>
     */
    public static final SlaveWorkerInfo SLAVE_WORKER_INFO = new SlaveWorkerInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlaveWorkerInfoRecord> getRecordType() {
        return SlaveWorkerInfoRecord.class;
    }

    /**
     * The column <code>mysql.slave_worker_info.Id</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, UInteger> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Relay_log_name</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, String> RELAY_LOG_NAME = createField("Relay_log_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Relay_log_pos</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, ULong> RELAY_LOG_POS = createField("Relay_log_pos", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Master_log_name</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, String> MASTER_LOG_NAME = createField("Master_log_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Master_log_pos</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, ULong> MASTER_LOG_POS = createField("Master_log_pos", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_relay_log_name</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, String> CHECKPOINT_RELAY_LOG_NAME = createField("Checkpoint_relay_log_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_relay_log_pos</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, ULong> CHECKPOINT_RELAY_LOG_POS = createField("Checkpoint_relay_log_pos", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_master_log_name</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, String> CHECKPOINT_MASTER_LOG_NAME = createField("Checkpoint_master_log_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_master_log_pos</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, ULong> CHECKPOINT_MASTER_LOG_POS = createField("Checkpoint_master_log_pos", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_seqno</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, UInteger> CHECKPOINT_SEQNO = createField("Checkpoint_seqno", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_group_size</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, UInteger> CHECKPOINT_GROUP_SIZE = createField("Checkpoint_group_size", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_group_bitmap</code>.
     */
    public final TableField<SlaveWorkerInfoRecord, byte[]> CHECKPOINT_GROUP_BITMAP = createField("Checkpoint_group_bitmap", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Channel_name</code>. The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public final TableField<SlaveWorkerInfoRecord, String> CHANNEL_NAME = createField("Channel_name", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "The channel on which the slave is connected to a source. Used in Multisource Replication");

    /**
     * Create a <code>mysql.slave_worker_info</code> table reference
     */
    public SlaveWorkerInfo() {
        this(DSL.name("slave_worker_info"), null);
    }

    /**
     * Create an aliased <code>mysql.slave_worker_info</code> table reference
     */
    public SlaveWorkerInfo(String alias) {
        this(DSL.name(alias), SLAVE_WORKER_INFO);
    }

    /**
     * Create an aliased <code>mysql.slave_worker_info</code> table reference
     */
    public SlaveWorkerInfo(Name alias) {
        this(alias, SLAVE_WORKER_INFO);
    }

    private SlaveWorkerInfo(Name alias, Table<SlaveWorkerInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SlaveWorkerInfo(Name alias, Table<SlaveWorkerInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Worker Information");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SLAVE_WORKER_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SlaveWorkerInfoRecord> getPrimaryKey() {
        return Keys.KEY_SLAVE_WORKER_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SlaveWorkerInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SlaveWorkerInfoRecord>>asList(Keys.KEY_SLAVE_WORKER_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlaveWorkerInfo as(String alias) {
        return new SlaveWorkerInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlaveWorkerInfo as(Name alias) {
        return new SlaveWorkerInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveWorkerInfo rename(String name) {
        return new SlaveWorkerInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveWorkerInfo rename(Name name) {
        return new SlaveWorkerInfo(name, null);
    }
}
