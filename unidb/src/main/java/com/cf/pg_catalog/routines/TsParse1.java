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
public class TsParse1 extends AbstractRoutine<Void> {

    private static final long serialVersionUID = -1796805834;

    /**
     * The parameter <code>pg_catalog.ts_parse.parser_oid</code>.
     */
    public static final Parameter<Long> PARSER_OID = createParameter("parser_oid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.ts_parse.txt</code>.
     */
    public static final Parameter<String> TXT = createParameter("txt", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.ts_parse.tokid</code>.
     */
    public static final Parameter<Integer> TOKID = createParameter("tokid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.ts_parse.token</code>.
     */
    public static final Parameter<String> TOKEN = createParameter("token", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public TsParse1() {
        super("ts_parse", PgCatalog.PG_CATALOG);

        addInParameter(PARSER_OID);
        addInParameter(TXT);
        addOutParameter(TOKID);
        addOutParameter(TOKEN);
        setOverloaded(true);
    }

    /**
     * Set the <code>parser_oid</code> parameter IN value to the routine
     */
    public void setParserOid(Long value) {
        setValue(PARSER_OID, value);
    }

    /**
     * Set the <code>txt</code> parameter IN value to the routine
     */
    public void setTxt(String value) {
        setValue(TXT, value);
    }

    /**
     * Get the <code>tokid</code> parameter OUT value from the routine
     */
    public Integer getTokid() {
        return get(TOKID);
    }

    /**
     * Get the <code>token</code> parameter OUT value from the routine
     */
    public String getToken() {
        return get(TOKEN);
    }
}
