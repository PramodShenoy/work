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
public class Hashcostestimate extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 1632113963;

    /**
     * The parameter <code>pg_catalog.hashcostestimate._1</code>.
     */
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.hashcostestimate._2</code>.
     */
    public static final Parameter<Object> _2 = createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.hashcostestimate._3</code>.
     */
    public static final Parameter<Object> _3 = createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.hashcostestimate._4</code>.
     */
    public static final Parameter<Object> _4 = createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.hashcostestimate._5</code>.
     */
    public static final Parameter<Object> _5 = createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.hashcostestimate._6</code>.
     */
    public static final Parameter<Object> _6 = createParameter("_6", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.hashcostestimate._7</code>.
     */
    public static final Parameter<Object> _7 = createParameter("_7", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * Create a new routine call instance
     */
    public Hashcostestimate() {
        super("hashcostestimate", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        addInParameter(_6);
        addInParameter(_7);
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

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    public void set__6(Object value) {
        setValue(_6, value);
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    public void set__7(Object value) {
        setValue(_7, value);
    }
}
