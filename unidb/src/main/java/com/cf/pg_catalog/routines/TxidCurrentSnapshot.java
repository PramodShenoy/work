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
public class TxidCurrentSnapshot extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -632403547;

    /**
     * The parameter <code>pg_catalog.txid_current_snapshot.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("txid_snapshot"), false, false);

    /**
     * Create a new routine call instance
     */
    public TxidCurrentSnapshot() {
        super("txid_current_snapshot", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("txid_snapshot"));

        setReturnParameter(RETURN_VALUE);
    }
}
