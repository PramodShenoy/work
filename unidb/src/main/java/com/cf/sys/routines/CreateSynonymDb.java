/*
 * This file is generated by jOOQ.
*/
package com.cf.sys.routines;


import com.cf.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Takes a source database name and synonym name, and then creates the 
 *  synonym database with views that point to all of the tables within
 *  the source database.
 *  
 *  Useful for creating a "ps" synonym for "performance_schema",
 *  or "is" instead of "information_schema", for example.
 *  
 *  Parameters
 *  
 *  in_db_name (VARCHAR(64)):
 *  The database name that you would like to create a synonym for.
 *  in_synonym (VARCHAR(64)):
 *  The database synonym name.
 *  
 *  Example
 *  
 *  mysql&gt; SHOW DATABASES;
 *  +--------------------+
 *  | Database           |
 *  +--------------------+
 *  | information_schema |
 *  | mysql              |
 *  | performance_schema |
 *  | sys                |
 *  | test               |
 *  +--------------------+
 *  5 rows in set (0.00 sec)
 *  
 *  mysql&gt; CALL sys.create_synonym_db('performance_schema', 'ps');
 *  +---------------------------------------+
 *  | summary                               |
 *  +---------------------------------------+
 *  | Created 74 views in the `ps` database |
 *  +---------------------------------------+
 *  1 row in set (8.57 sec)
 *  
 *  Query OK, 0 rows affected (8.57 sec)
 *  
 *  mysql&gt; SHOW DATABASES;
 *  +--------------------+
 *  | Database           |
 *  +--------------------+
 *  | information_schema |
 *  | mysql              |
 *  | performance_schema |
 *  | ps                 |
 *  | sys                |
 *  | test               |
 *  +--------------------+
 *  6 rows in set (0.00 sec)
 *  
 *  mysql&gt; SHOW FULL TABLES FROM ps;
 *  +------------------------------------------------------+------------+
 *  | Tables_in_ps                                         | Table_type |
 *  +------------------------------------------------------+------------+
 *  | accounts                                             | VIEW       |
 *  | cond_instances                                       | VIEW       |
 *  | events_stages_current                                | VIEW       |
 *  | events_stages_history                                | VIEW       |
 *  ...
 *  
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CreateSynonymDb extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1441957030;

    /**
     * The parameter <code>sys.create_synonym_db.in_db_name</code>.
     */
    public static final Parameter<String> IN_DB_NAME = createParameter("in_db_name", org.jooq.impl.SQLDataType.VARCHAR(64), false, false);

    /**
     * The parameter <code>sys.create_synonym_db.in_synonym</code>.
     */
    public static final Parameter<String> IN_SYNONYM = createParameter("in_synonym", org.jooq.impl.SQLDataType.VARCHAR(64), false, false);

    /**
     * Create a new routine call instance
     */
    public CreateSynonymDb() {
        super("create_synonym_db", Sys.SYS);

        addInParameter(IN_DB_NAME);
        addInParameter(IN_SYNONYM);
    }

    /**
     * Set the <code>in_db_name</code> parameter IN value to the routine
     */
    public void setInDbName(String value) {
        setValue(IN_DB_NAME, value);
    }

    /**
     * Set the <code>in_synonym</code> parameter IN value to the routine
     */
    public void setInSynonym(String value) {
        setValue(IN_SYNONYM, value);
    }
}
