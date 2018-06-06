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
public class PgEventTriggerDdlCommands extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 724028796;

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    public static final Parameter<Long> CLASSID = createParameter("classid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    public static final Parameter<Long> OBJID = createParameter("objid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    public static final Parameter<Integer> OBJSUBID = createParameter("objsubid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    public static final Parameter<String> COMMAND_TAG = createParameter("command_tag", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    public static final Parameter<String> OBJECT_TYPE = createParameter("object_type", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    public static final Parameter<String> SCHEMA_NAME = createParameter("schema_name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    public static final Parameter<String> OBJECT_IDENTITY = createParameter("object_identity", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    public static final Parameter<Boolean> IN_EXTENSION = createParameter("in_extension", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_ddl_commands.command</code>.
     */
    public static final Parameter<Object> COMMAND = createParameter("command", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_ddl_command"), false, false);

    /**
     * Create a new routine call instance
     */
    public PgEventTriggerDdlCommands() {
        super("pg_event_trigger_ddl_commands", PgCatalog.PG_CATALOG);

        addOutParameter(CLASSID);
        addOutParameter(OBJID);
        addOutParameter(OBJSUBID);
        addOutParameter(COMMAND_TAG);
        addOutParameter(OBJECT_TYPE);
        addOutParameter(SCHEMA_NAME);
        addOutParameter(OBJECT_IDENTITY);
        addOutParameter(IN_EXTENSION);
        addOutParameter(COMMAND);
    }

    /**
     * Get the <code>classid</code> parameter OUT value from the routine
     */
    public Long getClassid() {
        return get(CLASSID);
    }

    /**
     * Get the <code>objid</code> parameter OUT value from the routine
     */
    public Long getObjid() {
        return get(OBJID);
    }

    /**
     * Get the <code>objsubid</code> parameter OUT value from the routine
     */
    public Integer getObjsubid() {
        return get(OBJSUBID);
    }

    /**
     * Get the <code>command_tag</code> parameter OUT value from the routine
     */
    public String getCommandTag() {
        return get(COMMAND_TAG);
    }

    /**
     * Get the <code>object_type</code> parameter OUT value from the routine
     */
    public String getObjectType() {
        return get(OBJECT_TYPE);
    }

    /**
     * Get the <code>schema_name</code> parameter OUT value from the routine
     */
    public String getSchemaName() {
        return get(SCHEMA_NAME);
    }

    /**
     * Get the <code>object_identity</code> parameter OUT value from the routine
     */
    public String getObjectIdentity() {
        return get(OBJECT_IDENTITY);
    }

    /**
     * Get the <code>in_extension</code> parameter OUT value from the routine
     */
    public Boolean getInExtension() {
        return get(IN_EXTENSION);
    }

    /**
     * Get the <code>command</code> parameter OUT value from the routine
     */
    public Object getCommand() {
        return get(COMMAND);
    }
}
