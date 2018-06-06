/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.routines;


import com.cf.pg_catalog.PgCatalog;

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
public class JsonArrayElement extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -2118886275;

    /**
     * The parameter <code>pg_catalog.json_array_element.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * The parameter <code>pg_catalog.json_array_element.from_json</code>.
     */
    public static final Parameter<Object> FROM_JSON = createParameter("from_json", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * The parameter <code>pg_catalog.json_array_element.element_index</code>.
     */
    public static final Parameter<Integer> ELEMENT_INDEX = createParameter("element_index", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonArrayElement() {
        super("json_array_element", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.OTHER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(ELEMENT_INDEX);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(Object value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<Object> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>element_index</code> parameter IN value to the routine
     */
    public void setElementIndex(Integer value) {
        setValue(ELEMENT_INDEX, value);
    }

    /**
     * Set the <code>element_index</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setElementIndex(Field<Integer> field) {
        setField(ELEMENT_INDEX, field);
    }
}
