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
public class PgShowAllSettings extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 1173814699;

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.name</code>.
     */
    public static final Parameter<String> NAME = createParameter("name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.setting</code>.
     */
    public static final Parameter<String> SETTING = createParameter("setting", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.unit</code>.
     */
    public static final Parameter<String> UNIT = createParameter("unit", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.category</code>.
     */
    public static final Parameter<String> CATEGORY = createParameter("category", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.short_desc</code>.
     */
    public static final Parameter<String> SHORT_DESC = createParameter("short_desc", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.extra_desc</code>.
     */
    public static final Parameter<String> EXTRA_DESC = createParameter("extra_desc", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.context</code>.
     */
    public static final Parameter<String> CONTEXT = createParameter("context", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.vartype</code>.
     */
    public static final Parameter<String> VARTYPE = createParameter("vartype", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.source</code>.
     */
    public static final Parameter<String> SOURCE = createParameter("source", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.min_val</code>.
     */
    public static final Parameter<String> MIN_VAL = createParameter("min_val", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.max_val</code>.
     */
    public static final Parameter<String> MAX_VAL = createParameter("max_val", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.enumvals</code>.
     */
    public static final Parameter<String[]> ENUMVALS = createParameter("enumvals", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.boot_val</code>.
     */
    public static final Parameter<String> BOOT_VAL = createParameter("boot_val", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.reset_val</code>.
     */
    public static final Parameter<String> RESET_VAL = createParameter("reset_val", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.sourcefile</code>.
     */
    public static final Parameter<String> SOURCEFILE = createParameter("sourcefile", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.sourceline</code>.
     */
    public static final Parameter<Integer> SOURCELINE = createParameter("sourceline", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_show_all_settings.pending_restart</code>.
     */
    public static final Parameter<Boolean> PENDING_RESTART = createParameter("pending_restart", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public PgShowAllSettings() {
        super("pg_show_all_settings", PgCatalog.PG_CATALOG);

        addOutParameter(NAME);
        addOutParameter(SETTING);
        addOutParameter(UNIT);
        addOutParameter(CATEGORY);
        addOutParameter(SHORT_DESC);
        addOutParameter(EXTRA_DESC);
        addOutParameter(CONTEXT);
        addOutParameter(VARTYPE);
        addOutParameter(SOURCE);
        addOutParameter(MIN_VAL);
        addOutParameter(MAX_VAL);
        addOutParameter(ENUMVALS);
        addOutParameter(BOOT_VAL);
        addOutParameter(RESET_VAL);
        addOutParameter(SOURCEFILE);
        addOutParameter(SOURCELINE);
        addOutParameter(PENDING_RESTART);
    }

    /**
     * Get the <code>name</code> parameter OUT value from the routine
     */
    public String getName_() {
        return get(NAME);
    }

    /**
     * Get the <code>setting</code> parameter OUT value from the routine
     */
    public String getSetting() {
        return get(SETTING);
    }

    /**
     * Get the <code>unit</code> parameter OUT value from the routine
     */
    public String getUnit() {
        return get(UNIT);
    }

    /**
     * Get the <code>category</code> parameter OUT value from the routine
     */
    public String getCategory() {
        return get(CATEGORY);
    }

    /**
     * Get the <code>short_desc</code> parameter OUT value from the routine
     */
    public String getShortDesc() {
        return get(SHORT_DESC);
    }

    /**
     * Get the <code>extra_desc</code> parameter OUT value from the routine
     */
    public String getExtraDesc() {
        return get(EXTRA_DESC);
    }

    /**
     * Get the <code>context</code> parameter OUT value from the routine
     */
    public String getContext() {
        return get(CONTEXT);
    }

    /**
     * Get the <code>vartype</code> parameter OUT value from the routine
     */
    public String getVartype() {
        return get(VARTYPE);
    }

    /**
     * Get the <code>source</code> parameter OUT value from the routine
     */
    public String getSource() {
        return get(SOURCE);
    }

    /**
     * Get the <code>min_val</code> parameter OUT value from the routine
     */
    public String getMinVal() {
        return get(MIN_VAL);
    }

    /**
     * Get the <code>max_val</code> parameter OUT value from the routine
     */
    public String getMaxVal() {
        return get(MAX_VAL);
    }

    /**
     * Get the <code>enumvals</code> parameter OUT value from the routine
     */
    public String[] getEnumvals() {
        return get(ENUMVALS);
    }

    /**
     * Get the <code>boot_val</code> parameter OUT value from the routine
     */
    public String getBootVal() {
        return get(BOOT_VAL);
    }

    /**
     * Get the <code>reset_val</code> parameter OUT value from the routine
     */
    public String getResetVal() {
        return get(RESET_VAL);
    }

    /**
     * Get the <code>sourcefile</code> parameter OUT value from the routine
     */
    public String getSourcefile() {
        return get(SOURCEFILE);
    }

    /**
     * Get the <code>sourceline</code> parameter OUT value from the routine
     */
    public Integer getSourceline() {
        return get(SOURCELINE);
    }

    /**
     * Get the <code>pending_restart</code> parameter OUT value from the routine
     */
    public Boolean getPendingRestart() {
        return get(PENDING_RESTART);
    }
}
