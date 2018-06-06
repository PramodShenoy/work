/**
 * This class is generated by jOOQ
 */
package com.cf.pg_catalog.tables.records;


import com.cf.pg_catalog.tables.PgRoles;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


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
public class PgRolesRecord extends TableRecordImpl<PgRolesRecord> implements Record13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, Timestamp, Boolean, String[], Long> {

    private static final long serialVersionUID = 50935706;

    /**
     * Setter for <code>pg_catalog.pg_roles.rolname</code>.
     */
    public void setRolname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolname</code>.
     */
    public String getRolname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolsuper</code>.
     */
    public void setRolsuper(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolsuper</code>.
     */
    public Boolean getRolsuper() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolinherit</code>.
     */
    public void setRolinherit(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolinherit</code>.
     */
    public Boolean getRolinherit() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolcreaterole</code>.
     */
    public void setRolcreaterole(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolcreaterole</code>.
     */
    public Boolean getRolcreaterole() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolcreatedb</code>.
     */
    public void setRolcreatedb(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolcreatedb</code>.
     */
    public Boolean getRolcreatedb() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolcanlogin</code>.
     */
    public void setRolcanlogin(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolcanlogin</code>.
     */
    public Boolean getRolcanlogin() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolreplication</code>.
     */
    public void setRolreplication(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolreplication</code>.
     */
    public Boolean getRolreplication() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolconnlimit</code>.
     */
    public void setRolconnlimit(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolconnlimit</code>.
     */
    public Integer getRolconnlimit() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolpassword</code>.
     */
    public void setRolpassword(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolpassword</code>.
     */
    public String getRolpassword() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolvaliduntil</code>.
     */
    public void setRolvaliduntil(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolvaliduntil</code>.
     */
    public Timestamp getRolvaliduntil() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolbypassrls</code>.
     */
    public void setRolbypassrls(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolbypassrls</code>.
     */
    public Boolean getRolbypassrls() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolconfig</code>.
     */
    public void setRolconfig(String[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolconfig</code>.
     */
    public String[] getRolconfig() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.oid</code>.
     */
    public void setOid(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.oid</code>.
     */
    public Long getOid() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, Timestamp, Boolean, String[], Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, Timestamp, Boolean, String[], Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgRoles.PG_ROLES.ROLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return PgRoles.PG_ROLES.ROLSUPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgRoles.PG_ROLES.ROLINHERIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgRoles.PG_ROLES.ROLCREATEROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgRoles.PG_ROLES.ROLCREATEDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgRoles.PG_ROLES.ROLCANLOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgRoles.PG_ROLES.ROLREPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return PgRoles.PG_ROLES.ROLCONNLIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return PgRoles.PG_ROLES.ROLPASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return PgRoles.PG_ROLES.ROLVALIDUNTIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return PgRoles.PG_ROLES.ROLBYPASSRLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field12() {
        return PgRoles.PG_ROLES.ROLCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return PgRoles.PG_ROLES.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRolname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getRolsuper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getRolinherit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getRolcreaterole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getRolcreatedb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getRolcanlogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getRolreplication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRolconnlimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRolpassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getRolvaliduntil();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getRolbypassrls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value12() {
        return getRolconfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value1(String value) {
        setRolname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value2(Boolean value) {
        setRolsuper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value3(Boolean value) {
        setRolinherit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value4(Boolean value) {
        setRolcreaterole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value5(Boolean value) {
        setRolcreatedb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value6(Boolean value) {
        setRolcanlogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value7(Boolean value) {
        setRolreplication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value8(Integer value) {
        setRolconnlimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value9(String value) {
        setRolpassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value10(Timestamp value) {
        setRolvaliduntil(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value11(Boolean value) {
        setRolbypassrls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value12(String[] value) {
        setRolconfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord value13(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRolesRecord values(String value1, Boolean value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6, Boolean value7, Integer value8, String value9, Timestamp value10, Boolean value11, String[] value12, Long value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgRolesRecord
     */
    public PgRolesRecord() {
        super(PgRoles.PG_ROLES);
    }

    /**
     * Create a detached, initialised PgRolesRecord
     */
    public PgRolesRecord(String rolname, Boolean rolsuper, Boolean rolinherit, Boolean rolcreaterole, Boolean rolcreatedb, Boolean rolcanlogin, Boolean rolreplication, Integer rolconnlimit, String rolpassword, Timestamp rolvaliduntil, Boolean rolbypassrls, String[] rolconfig, Long oid) {
        super(PgRoles.PG_ROLES);

        set(0, rolname);
        set(1, rolsuper);
        set(2, rolinherit);
        set(3, rolcreaterole);
        set(4, rolcreatedb);
        set(5, rolcanlogin);
        set(6, rolreplication);
        set(7, rolconnlimit);
        set(8, rolpassword);
        set(9, rolvaliduntil);
        set(10, rolbypassrls);
        set(11, rolconfig);
        set(12, oid);
    }
}
