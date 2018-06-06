/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
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
public class Timezone4 extends AbstractRoutine<Time> {

    private static final long serialVersionUID = 1462428539;

    /**
     * The parameter <code>pg_catalog.timezone.RETURN_VALUE</code>.
     */
    public static final Parameter<Time> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIME, false, false);

    /**
     * The parameter <code>pg_catalog.timezone._1</code>.
     */
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), false, true);

    /**
     * The parameter <code>pg_catalog.timezone._2</code>.
     */
    public static final Parameter<Time> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIME, false, true);

    /**
     * Create a new routine call instance
     */
    public Timezone4() {
        super("timezone", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIME);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Time value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Time> field) {
        setField(_2, field);
    }
}
