/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog;


import com.cf.DefaultCatalog;
import org.jooq.Catalog;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PgCatalog extends SchemaImpl {

    /**
     * The reference instance of <code>pg_catalog</code>
     */
    public static final PgCatalog PG_CATALOG = new PgCatalog();
    private static final long serialVersionUID = -1334362760;

    /**
     * No further instances allowed
     */
    private PgCatalog() {
        super("pg_catalog", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }
}
