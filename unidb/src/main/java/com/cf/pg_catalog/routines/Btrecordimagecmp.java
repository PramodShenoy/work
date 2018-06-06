/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Record;
import org.jooq.impl.AbstractRoutine;


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
public class Btrecordimagecmp extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 710038694;

    /**
     * The parameter <code>pg_catalog.btrecordimagecmp.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.btrecordimagecmp._1</code>.
     */
    public static final Parameter<Record> _1 = createParameter("_1", org.jooq.impl.SQLDataType.RECORD, false, true);

    /**
     * The parameter <code>pg_catalog.btrecordimagecmp._2</code>.
     */
    public static final Parameter<Record> _2 = createParameter("_2", org.jooq.impl.SQLDataType.RECORD, false, true);

    /**
     * Create a new routine call instance
     */
    public Btrecordimagecmp() {
        super("btrecordimagecmp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Record value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Record> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Record value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Record> field) {
        setField(_2, field);
    }
}
