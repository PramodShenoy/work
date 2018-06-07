/**
 * This class is generated by jOOQ
 */
package com.cf.public_.tables;


import com.cf.public_.Keys;
import com.cf.public_.Public;
import com.cf.public_.tables.records.UniRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class Uni extends TableImpl<UniRecord> {

    /**
     * The reference instance of <code>public.uni</code>
     */
    public static final Uni UNI = new Uni();
    private static final long serialVersionUID = 1718093315;
    /**
     * The column <code>public.uni.id</code>.
     */
    public final TableField<UniRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>public.uni.name</code>.
     */
    public final TableField<UniRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");
    /**
     * The column <code>public.uni.city</code>.
     */
    public final TableField<UniRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");
    /**
     * The column <code>public.uni.country</code>.
     */
    public final TableField<UniRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>public.uni</code> table reference
     */
    public Uni() {
        this("uni", null);
    }

    /**
     * Create an aliased <code>public.uni</code> table reference
     */
    public Uni(String alias) {
        this(alias, UNI);
    }

    private Uni(String alias, Table<UniRecord> aliased) {
        this(alias, aliased, null);
    }

    private Uni(String alias, Table<UniRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UniRecord> getRecordType() {
        return UniRecord.class;
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
    public UniqueKey<UniRecord> getPrimaryKey() {
        return Keys.UNI_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UniRecord>> getKeys() {
        return Arrays.<UniqueKey<UniRecord>>asList(Keys.UNI_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Uni as(String alias) {
        return new Uni(alias, this);
    }

    /**
     * Rename this table
     */
    public Uni rename(String name) {
        return new Uni(name, null);
    }
}
