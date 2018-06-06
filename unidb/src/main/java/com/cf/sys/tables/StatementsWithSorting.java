/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.tables;


import com.cf.sys.Sys;
import com.cf.sys.tables.records.StatementsWithSortingRecord;

import java.math.BigInteger;
import java.sql.Timestamp;

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
public class StatementsWithSorting extends TableImpl<StatementsWithSortingRecord> {

    private static final long serialVersionUID = -29930980;

    /**
     * The reference instance of <code>sys.statements_with_sorting</code>
     */
    public static final StatementsWithSorting STATEMENTS_WITH_SORTING = new StatementsWithSorting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatementsWithSortingRecord> getRecordType() {
        return StatementsWithSortingRecord.class;
    }

    /**
     * The column <code>sys.statements_with_sorting.query</code>.
     */
    public final TableField<StatementsWithSortingRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_sorting.db</code>.
     */
    public final TableField<StatementsWithSortingRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.statements_with_sorting.exec_count</code>.
     */
    public final TableField<StatementsWithSortingRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_sorting.total_latency</code>.
     */
    public final TableField<StatementsWithSortingRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_sorting.sort_merge_passes</code>.
     */
    public final TableField<StatementsWithSortingRecord, ULong> SORT_MERGE_PASSES = createField("sort_merge_passes", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_sorting.avg_sort_merges</code>.
     */
    public final TableField<StatementsWithSortingRecord, BigInteger> AVG_SORT_MERGES = createField("avg_sort_merges", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.statements_with_sorting.sorts_using_scans</code>.
     */
    public final TableField<StatementsWithSortingRecord, ULong> SORTS_USING_SCANS = createField("sorts_using_scans", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_sorting.sort_using_range</code>.
     */
    public final TableField<StatementsWithSortingRecord, ULong> SORT_USING_RANGE = createField("sort_using_range", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_sorting.rows_sorted</code>.
     */
    public final TableField<StatementsWithSortingRecord, ULong> ROWS_SORTED = createField("rows_sorted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_sorting.avg_rows_sorted</code>.
     */
    public final TableField<StatementsWithSortingRecord, BigInteger> AVG_ROWS_SORTED = createField("avg_rows_sorted", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.statements_with_sorting.first_seen</code>.
     */
    public final TableField<StatementsWithSortingRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.statements_with_sorting.last_seen</code>.
     */
    public final TableField<StatementsWithSortingRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.statements_with_sorting.digest</code>.
     */
    public final TableField<StatementsWithSortingRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>sys.statements_with_sorting</code> table reference
     */
    public StatementsWithSorting() {
        this(DSL.name("statements_with_sorting"), null);
    }

    /**
     * Create an aliased <code>sys.statements_with_sorting</code> table reference
     */
    public StatementsWithSorting(String alias) {
        this(DSL.name(alias), STATEMENTS_WITH_SORTING);
    }

    /**
     * Create an aliased <code>sys.statements_with_sorting</code> table reference
     */
    public StatementsWithSorting(Name alias) {
        this(alias, STATEMENTS_WITH_SORTING);
    }

    private StatementsWithSorting(Name alias, Table<StatementsWithSortingRecord> aliased) {
        this(alias, aliased, null);
    }

    private StatementsWithSorting(Name alias, Table<StatementsWithSortingRecord> aliased, Field<?>[] parameters) {
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
    public StatementsWithSorting as(String alias) {
        return new StatementsWithSorting(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithSorting as(Name alias) {
        return new StatementsWithSorting(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithSorting rename(String name) {
        return new StatementsWithSorting(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithSorting rename(Name name) {
        return new StatementsWithSorting(name, null);
    }
}
