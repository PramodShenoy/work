/**
 * This class is generated by jOOQ
 */
package com.cf.pg_toast_temp_1;


import com.cf.DefaultCatalog;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.impl.SchemaImpl;


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
public class PgToastTemp_1 extends SchemaImpl {

    private static final long serialVersionUID = 1609764364;

    /**
     * The reference instance of <code>pg_toast_temp_1</code>
     */
    public static final PgToastTemp_1 PG_TOAST_TEMP_1 = new PgToastTemp_1();

    /**
     * No further instances allowed
     */
    private PgToastTemp_1() {
        super("pg_toast_temp_1", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }
}
