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
public class JsonArrayElements extends AbstractRoutine<Void> {

    private static final long serialVersionUID = -1442607061;

    /**
     * The parameter <code>pg_catalog.json_array_elements.from_json</code>.
     */
    public static final Parameter<Object> FROM_JSON = createParameter("from_json", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * The parameter <code>pg_catalog.json_array_elements.value</code>.
     */
    public static final Parameter<Object> VALUE = createParameter("value", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonArrayElements() {
        super("json_array_elements", PgCatalog.PG_CATALOG);

        addInParameter(FROM_JSON);
        addOutParameter(VALUE);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(Object value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Get the <code>value</code> parameter OUT value from the routine
     */
    public Object getValue() {
        return get(VALUE);
    }
}
