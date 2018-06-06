/**
 * This class is generated by jOOQ
 */
package com.cf.jooq.tables;


import com.cf.jooq.Jooq;
import com.cf.jooq.Keys;
import com.cf.jooq.tables.records.UniRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Uni extends TableImpl<UniRecord> {

    private static final long serialVersionUID = 733584825;

    /**
     * The reference instance of <code>jooq.uni</code>
     */
    public static final Uni UNI = new Uni();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UniRecord> getRecordType() {
        return UniRecord.class;
    }

    /**
     * The column <code>jooq.uni.id</code>.
     */
    public final TableField<UniRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq.uni.name</code>.
     */
    public final TableField<UniRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>jooq.uni.city</code>.
     */
    public final TableField<UniRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>jooq.uni.country</code>.
     */
    public final TableField<UniRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>jooq.uni</code> table reference
     */
    public Uni() {
        this("uni", null);
    }

    /**
     * Create an aliased <code>jooq.uni</code> table reference
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
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooq.JOOQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UniRecord> getPrimaryKey() {
        return Keys.KEY_UNI_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UniRecord>> getKeys() {
        return Arrays.<UniqueKey<UniRecord>>asList(Keys.KEY_UNI_PRIMARY);
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