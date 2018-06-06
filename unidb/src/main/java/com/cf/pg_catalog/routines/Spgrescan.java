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
public class Spgrescan extends AbstractRoutine<Void> {

    private static final long serialVersionUID = -356313730;

    /**
     * The parameter <code>pg_catalog.spgrescan._1</code>.
     */
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.spgrescan._2</code>.
     */
    public static final Parameter<Object> _2 = createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.spgrescan._3</code>.
     */
    public static final Parameter<Object> _3 = createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.spgrescan._4</code>.
     */
    public static final Parameter<Object> _4 = createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.spgrescan._5</code>.
     */
    public static final Parameter<Object> _5 = createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * Create a new routine call instance
     */
    public Spgrescan() {
        super("spgrescan", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Object value) {
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
    public void set__5(Object value) {
        setValue(_5, value);
    }
}
