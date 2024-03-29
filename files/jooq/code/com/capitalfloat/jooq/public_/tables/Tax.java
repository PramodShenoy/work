/**
 * This class is generated by jOOQ
 */
package com.capitalfloat.jooq.public_.tables;


import com.capitalfloat.jooq.public_.Keys;
import com.capitalfloat.jooq.public_.Public;
import com.capitalfloat.jooq.public_.tables.records.TaxRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Tax extends TableImpl<TaxRecord> {

    private static final long serialVersionUID = -1046904148;

    /**
     * The reference instance of <code>public.tax</code>
     */
    public static final Tax TAX = new Tax();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaxRecord> getRecordType() {
        return TaxRecord.class;
    }

    /**
     * The column <code>public.tax.app_id</code>.
     */
    public final TableField<TaxRecord, UUID> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.tax.state</code>.
     */
    public final TableField<TaxRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.tax.from_year</code>.
     */
    public final TableField<TaxRecord, Integer> FROM_YEAR = createField("from_year", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tax.to_year</code>.
     */
    public final TableField<TaxRecord, Integer> TO_YEAR = createField("to_year", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tax.tax_type</code>.
     */
    public final TableField<TaxRecord, Integer> TAX_TYPE = createField("tax_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tax.filing_freqency</code>.
     */
    public final TableField<TaxRecord, Integer> FILING_FREQENCY = createField("filing_freqency", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tax.id</code>.
     */
    public final TableField<TaxRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tax_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.tax</code> table reference
     */
    public Tax() {
        this("tax", null);
    }

    /**
     * Create an aliased <code>public.tax</code> table reference
     */
    public Tax(String alias) {
        this(alias, TAX);
    }

    private Tax(String alias, Table<TaxRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tax(String alias, Table<TaxRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TaxRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TaxRecord> getPrimaryKey() {
        return Keys.TAX_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TaxRecord>> getKeys() {
        return Arrays.<UniqueKey<TaxRecord>>asList(Keys.TAX_APP_ID_STATE_FROM_YEAR_TO_YEAR_TAX_TYPE_KEY, Keys.TAX_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tax as(String alias) {
        return new Tax(alias, this);
    }

    /**
     * Rename this table
     */
    public Tax rename(String name) {
        return new Tax(name, null);
    }
}
