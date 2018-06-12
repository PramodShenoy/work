/**
 * This class is generated by jOOQ
 */
package com.cf.public_.tables;


import com.cf.public_.Keys;
import com.cf.public_.Public;
import com.cf.public_.tables.records.FilingsRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


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
public class Filings extends TableImpl<FilingsRecord> {

    /**
     * The reference instance of <code>public.filings</code>
     */
    public static final Filings FILINGS = new Filings();
    private static final long serialVersionUID = -720015026;
    /**
     * The column <code>public.filings.id</code>.
     */
    public final TableField<FilingsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>public.filings.jan</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> JAN = createField("jan", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.feb</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> FEB = createField("feb", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.mar</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> MAR = createField("mar", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.apr</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> APR = createField("apr", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.may</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> MAY = createField("may", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.jun</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> JUN = createField("jun", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.jul</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> JUL = createField("jul", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.aug</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> AUG = createField("aug", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.sep</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> SEP = createField("sep", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.oct</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> OCT = createField("oct", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.nov</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> NOV = createField("nov", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");
    /**
     * The column <code>public.filings.dec</code>.
     */
    public final TableField<FilingsRecord, BigDecimal> DEC = createField("dec", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");

    /**
     * Create a <code>public.filings</code> table reference
     */
    public Filings() {
        this("filings", null);
    }

    /**
     * Create an aliased <code>public.filings</code> table reference
     */
    public Filings(String alias) {
        this(alias, FILINGS);
    }

    private Filings(String alias, Table<FilingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Filings(String alias, Table<FilingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilingsRecord> getRecordType() {
        return FilingsRecord.class;
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
    public UniqueKey<FilingsRecord> getPrimaryKey() {
        return Keys.FILINGS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilingsRecord>> getKeys() {
        return Arrays.<UniqueKey<FilingsRecord>>asList(Keys.FILINGS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FilingsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilingsRecord, ?>>asList(Keys.FILINGS__FILINGS_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Filings as(String alias) {
        return new Filings(alias, this);
    }

    /**
     * Rename this table
     */
    public Filings rename(String name) {
        return new Filings(name, null);
    }
}