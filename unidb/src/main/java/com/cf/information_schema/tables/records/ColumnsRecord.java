/*
 * This file is generated by jOOQ.
*/
package com.cf.information_schema.tables.records;


import com.cf.information_schema.tables.Columns;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> implements Record21<String, String, String, String, ULong, String, String, String, ULong, ULong, ULong, ULong, ULong, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 2083031762;

    /**
     * Setter for <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    public ULong getOrdinalPosition() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public void setColumnDefault(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public String getColumnDefault() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    public void setIsNullable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    public String getIsNullable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    public void setDataType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public void setCharacterMaximumLength(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public ULong getCharacterMaximumLength() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public void setCharacterOctetLength(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public ULong getCharacterOctetLength() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public void setNumericPrecision(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public ULong getNumericPrecision() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    public void setNumericScale(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    public ULong getNumericScale() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    public void setDatetimePrecision(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    public ULong getDatetimePrecision() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    public void setCollationName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    public void setColumnType(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    public String getColumnType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    public void setColumnKey(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    public String getColumnKey() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.EXTRA</code>.
     */
    public void setExtra(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.EXTRA</code>.
     */
    public String getExtra() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    public void setPrivileges(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    public String getPrivileges() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    public void setColumnComment(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    public String getColumnComment() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public void setGenerationExpression(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public String getGenerationExpression() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, ULong, String, String, String, ULong, ULong, ULong, ULong, ULong, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, ULong, String, String, String, ULong, ULong, ULong, ULong, ULong, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Columns.COLUMNS.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Columns.COLUMNS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Columns.COLUMNS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Columns.COLUMNS.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return Columns.COLUMNS.ORDINAL_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Columns.COLUMNS.COLUMN_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Columns.COLUMNS.IS_NULLABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Columns.COLUMNS.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return Columns.COLUMNS.CHARACTER_MAXIMUM_LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return Columns.COLUMNS.CHARACTER_OCTET_LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return Columns.COLUMNS.NUMERIC_PRECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return Columns.COLUMNS.NUMERIC_SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return Columns.COLUMNS.DATETIME_PRECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Columns.COLUMNS.CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Columns.COLUMNS.COLLATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Columns.COLUMNS.COLUMN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Columns.COLUMNS.COLUMN_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Columns.COLUMNS.EXTRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Columns.COLUMNS.PRIVILEGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return Columns.COLUMNS.COLUMN_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return Columns.COLUMNS.GENERATION_EXPRESSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getColumnDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIsNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getCharacterMaximumLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getCharacterOctetLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getNumericPrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getNumericScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component13() {
        return getDatetimePrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getColumnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getColumnKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getExtra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getPrivileges();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getColumnComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getGenerationExpression();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getColumnDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIsNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getCharacterMaximumLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getCharacterOctetLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getNumericPrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getNumericScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getDatetimePrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getColumnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getColumnKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getExtra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getPrivileges();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getColumnComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getGenerationExpression();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value5(ULong value) {
        setOrdinalPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value6(String value) {
        setColumnDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value7(String value) {
        setIsNullable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value8(String value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value9(ULong value) {
        setCharacterMaximumLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value10(ULong value) {
        setCharacterOctetLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value11(ULong value) {
        setNumericPrecision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value12(ULong value) {
        setNumericScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value13(ULong value) {
        setDatetimePrecision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value14(String value) {
        setCharacterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value15(String value) {
        setCollationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value16(String value) {
        setColumnType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value17(String value) {
        setColumnKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value18(String value) {
        setExtra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value19(String value) {
        setPrivileges(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value20(String value) {
        setColumnComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord value21(String value) {
        setGenerationExpression(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnsRecord values(String value1, String value2, String value3, String value4, ULong value5, String value6, String value7, String value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnsRecord
     */
    public ColumnsRecord() {
        super(Columns.COLUMNS);
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    public ColumnsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, ULong ordinalPosition, String columnDefault, String isNullable, String dataType, ULong characterMaximumLength, ULong characterOctetLength, ULong numericPrecision, ULong numericScale, ULong datetimePrecision, String characterSetName, String collationName, String columnType, String columnKey, String extra, String privileges, String columnComment, String generationExpression) {
        super(Columns.COLUMNS);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, columnName);
        set(4, ordinalPosition);
        set(5, columnDefault);
        set(6, isNullable);
        set(7, dataType);
        set(8, characterMaximumLength);
        set(9, characterOctetLength);
        set(10, numericPrecision);
        set(11, numericScale);
        set(12, datetimePrecision);
        set(13, characterSetName);
        set(14, collationName);
        set(15, columnType);
        set(16, columnKey);
        set(17, extra);
        set(18, privileges);
        set(19, columnComment);
        set(20, generationExpression);
    }
}
