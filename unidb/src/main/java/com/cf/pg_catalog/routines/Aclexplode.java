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
public class Aclexplode extends AbstractRoutine<Void> {

    private static final long serialVersionUID = -768520897;

    /**
     * The parameter <code>pg_catalog.aclexplode.acl</code>.
     */
    public static final Parameter<String[]> ACL = createParameter("acl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.aclexplode.grantor</code>.
     */
    public static final Parameter<Long> GRANTOR = createParameter("grantor", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.aclexplode.grantee</code>.
     */
    public static final Parameter<Long> GRANTEE = createParameter("grantee", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    public static final Parameter<String> PRIVILEGE_TYPE = createParameter("privilege_type", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    public static final Parameter<Boolean> IS_GRANTABLE = createParameter("is_grantable", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public Aclexplode() {
        super("aclexplode", PgCatalog.PG_CATALOG);

        addInParameter(ACL);
        addOutParameter(GRANTOR);
        addOutParameter(GRANTEE);
        addOutParameter(PRIVILEGE_TYPE);
        addOutParameter(IS_GRANTABLE);
    }

    /**
     * Set the <code>acl</code> parameter IN value to the routine
     */
    public void setAcl(String[] value) {
        setValue(ACL, value);
    }

    /**
     * Get the <code>grantor</code> parameter OUT value from the routine
     */
    public Long getGrantor() {
        return get(GRANTOR);
    }

    /**
     * Get the <code>grantee</code> parameter OUT value from the routine
     */
    public Long getGrantee() {
        return get(GRANTEE);
    }

    /**
     * Get the <code>privilege_type</code> parameter OUT value from the routine
     */
    public String getPrivilegeType() {
        return get(PRIVILEGE_TYPE);
    }

    /**
     * Get the <code>is_grantable</code> parameter OUT value from the routine
     */
    public Boolean getIsGrantable() {
        return get(IS_GRANTABLE);
    }
}
