/**
 * This class is generated by jOOQ
 */
package com.cf.pg_toast;


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
public class PgToast extends SchemaImpl {

    private static final long serialVersionUID = -2113883856;

    /**
     * The reference instance of <code>pg_toast</code>
     */
    public static final PgToast PG_TOAST = new PgToast();

    /**
     * No further instances allowed
     */
    private PgToast() {
        super("pg_toast", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }
}
