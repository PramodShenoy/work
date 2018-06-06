/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

import java.math.BigDecimal;

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
public class Avg1 extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 477113061;

    /**
     * The parameter <code>pg_catalog.avg.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>pg_catalog.avg._1</code>.
     */
    public static final Parameter<Long> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public Avg1() {
        super("avg", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Long> field) {
        setField(_1, field);
    }
}
