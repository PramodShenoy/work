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
public class Btint2sortsupport extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 974513972;

    /**
     * The parameter <code>pg_catalog.btint2sortsupport._1</code>.
     */
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * Create a new routine call instance
     */
    public Btint2sortsupport() {
        super("btint2sortsupport", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }
}
