/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import javax.annotation.Generated;

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
public class Utf8ToIso8859_1 extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 1147558813;

    /**
     * The parameter <code>pg_catalog.utf8_to_iso8859_1._1</code>.
     */
    public static final Parameter<Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>pg_catalog.utf8_to_iso8859_1._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>pg_catalog.utf8_to_iso8859_1._3</code>.
     */
    public static final Parameter<Object> _3 = createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"), false, true);

    /**
     * The parameter <code>pg_catalog.utf8_to_iso8859_1._4</code>.
     */
    public static final Parameter<Object> _4 = createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.utf8_to_iso8859_1._5</code>.
     */
    public static final Parameter<Integer> _5 = createParameter("_5", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Utf8ToIso8859_1() {
        super("utf8_to_iso8859_1", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Object value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Object value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Integer value) {
        setValue(_5, value);
    }
}
