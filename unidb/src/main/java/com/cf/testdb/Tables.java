/*
 * This file is generated by jOOQ.
*/
package com.cf.testdb;


import com.cf.testdb.tables.Laptop;
import com.cf.testdb.tables.Uni;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in testdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>testdb.laptop</code>.
     */
    public static final Laptop LAPTOP = com.cf.testdb.tables.Laptop.LAPTOP;

    /**
     * The table <code>testdb.uni</code>.
     */
    public static final Uni UNI = com.cf.testdb.tables.Uni.UNI;
}
