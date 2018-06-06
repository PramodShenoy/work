/*
 * This file is generated by jOOQ.
*/
package com.cf.library;


import com.cf.library.tables.Author;
import com.cf.library.tables.Book;
import com.cf.library.tables.BookStore;
import com.cf.library.tables.BookToBookStore;
import com.cf.library.tables.records.AuthorRecord;
import com.cf.library.tables.records.BookRecord;
import com.cf.library.tables.records.BookStoreRecord;
import com.cf.library.tables.records.BookToBookStoreRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>library</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_STORE_PRIMARY;
    public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_TO_BOOK_STORE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;
    public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BS_NAME = ForeignKeys0.FK_B2BS_BS_NAME;
    public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_B_ID = ForeignKeys0.FK_B2BS_B_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = Internal.createUniqueKey(Author.AUTHOR, "KEY_author_PRIMARY", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = Internal.createUniqueKey(Book.BOOK, "KEY_book_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_PRIMARY = Internal.createUniqueKey(BookStore.BOOK_STORE, "KEY_book_store_PRIMARY", BookStore.BOOK_STORE.NAME);
        public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "KEY_book_to_book_store_PRIMARY", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = Internal.createForeignKey(com.cf.library.Keys.KEY_AUTHOR_PRIMARY, Book.BOOK, "fk_t_book_author_id", Book.BOOK.AUTHOR_ID);
        public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BS_NAME = Internal.createForeignKey(com.cf.library.Keys.KEY_BOOK_STORE_PRIMARY, BookToBookStore.BOOK_TO_BOOK_STORE, "fk_b2bs_bs_name", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
        public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_B_ID = Internal.createForeignKey(com.cf.library.Keys.KEY_BOOK_PRIMARY, BookToBookStore.BOOK_TO_BOOK_STORE, "fk_b2bs_b_id", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }
}