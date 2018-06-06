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
public class JsonObjectFieldText extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1595736376;

    /**
     * The parameter <code>pg_catalog.json_object_field_text.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.json_object_field_text.from_json</code>.
     */
    public static final Parameter<Object> FROM_JSON = createParameter("from_json", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * The parameter <code>pg_catalog.json_object_field_text.field_name</code>.
     */
    public static final Parameter<String> FIELD_NAME = createParameter("field_name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonObjectFieldText() {
        super("json_object_field_text", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(FIELD_NAME);
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
     * Set the <code>field_name</code> parameter IN value to the routine
     */
    public void setFieldName(String value) {
        setValue(FIELD_NAME, value);
    }

    /**
     * Set the <code>field_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFieldName(Field<String> field) {
        setField(FIELD_NAME, field);
    }
}
