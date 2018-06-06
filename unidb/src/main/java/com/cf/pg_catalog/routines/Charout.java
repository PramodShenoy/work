/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

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
public class Charout extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -498071017;

    /**
     * The parameter <code>pg_catalog.charout.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"), false, false);

    /**
     * The parameter <code>pg_catalog.charout._1</code>.
     */
    public static final Parameter<String> _1 = createParameter("_1", org.jooq.impl.SQLDataType.CHAR, false, true);

    /**
     * Create a new routine call instance
     */
    public Charout() {
        super("charout", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
        setField(_1, field);
    }
}
