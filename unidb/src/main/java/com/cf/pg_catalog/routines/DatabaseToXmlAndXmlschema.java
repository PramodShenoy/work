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
public class DatabaseToXmlAndXmlschema extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1217253168;

    /**
     * The parameter <code>pg_catalog.database_to_xml_and_xmlschema.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("xml"), false, false);

    /**
     * The parameter <code>pg_catalog.database_to_xml_and_xmlschema.nulls</code>.
     */
    public static final Parameter<Boolean> NULLS = createParameter("nulls", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.database_to_xml_and_xmlschema.tableforest</code>.
     */
    public static final Parameter<Boolean> TABLEFOREST = createParameter("tableforest", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.database_to_xml_and_xmlschema.targetns</code>.
     */
    public static final Parameter<String> TARGETNS = createParameter("targetns", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public DatabaseToXmlAndXmlschema() {
        super("database_to_xml_and_xmlschema", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("xml"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(NULLS);
        addInParameter(TABLEFOREST);
        addInParameter(TARGETNS);
    }

    /**
     * Set the <code>nulls</code> parameter IN value to the routine
     */
    public void setNulls(Boolean value) {
        setValue(NULLS, value);
    }

    /**
     * Set the <code>nulls</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNulls(Field<Boolean> field) {
        setField(NULLS, field);
    }

    /**
     * Set the <code>tableforest</code> parameter IN value to the routine
     */
    public void setTableforest(Boolean value) {
        setValue(TABLEFOREST, value);
    }

    /**
     * Set the <code>tableforest</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTableforest(Field<Boolean> field) {
        setField(TABLEFOREST, field);
    }

    /**
     * Set the <code>targetns</code> parameter IN value to the routine
     */
    public void setTargetns(String value) {
        setValue(TARGETNS, value);
    }

    /**
     * Set the <code>targetns</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTargetns(Field<String> field) {
        setField(TARGETNS, field);
    }
}
