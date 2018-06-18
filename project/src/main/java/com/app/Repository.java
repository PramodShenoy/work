package com.app;

import java.util.List;

public interface Repository<T> {

    void insertTaxFilingRecord(T data);

    void deleteTaxFilingRecord(T data);

    void updateTaxFilingRecord(T data);

    List<T> query(QueryRequest queryRequest);

}