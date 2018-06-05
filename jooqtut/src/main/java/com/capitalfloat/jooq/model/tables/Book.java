/**
 * This class is generated by jOOQ
 */
package com.capitalfloat.jooq.model.tables;


import com.capitalfloat.jooq.model.Keys;
import com.capitalfloat.jooq.model.Library;
import com.capitalfloat.jooq.model.tables.records.BookRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Book extends TableImpl<BookRecord> {

    private static final long serialVersionUID = 397033495;

    /**
     * The reference instance of <code>library.book</code>
     */
    public static final Book BOOK = new Book();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookRecord> getRecordType() {
        return BookRecord.class;
    }

    /**
     * The column <code>library.book.id</code>.
     */
    public final TableField<BookRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>library.book.author_id</code>.
     */
    public final TableField<BookRecord, Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>library.book.title</code>.
     */
    public final TableField<BookRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

    /**
     * The column <code>library.book.published_in</code>.
     */
    public final TableField<BookRecord, Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>library.book.rec_timestamp</code>.
     */
    public final TableField<BookRecord, Timestamp> REC_TIMESTAMP = createField("rec_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>library.book</code> table reference
     */
    public Book() {
        this("book", null);
    }

    /**
     * Create an aliased <code>library.book</code> table reference
     */
    public Book(String alias) {
        this(alias, BOOK);
    }

    private Book(String alias, Table<BookRecord> aliased) {
        this(alias, aliased, null);
    }

    private Book(String alias, Table<BookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Library.LIBRARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookRecord>> getKeys() {
        return Arrays.<UniqueKey<BookRecord>>asList(Keys.KEY_BOOK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookRecord, ?>>asList(Keys.FK_T_BOOK_AUTHOR_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book as(String alias) {
        return new Book(alias, this);
    }

    /**
     * Rename this table
     */
    public Book rename(String name) {
        return new Book(name, null);
    }
}