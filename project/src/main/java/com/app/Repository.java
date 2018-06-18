package com.app;

import com.app.enums.TaxErrorEnum;

import java.util.List;

public interface Repository<T> {

    TaxErrorEnum insertTaxFilingRecord(T data);

    TaxErrorEnum deleteTaxFilingRecord(T data);

    TaxErrorEnum updateTaxFilingRecord(T data);

    List<T> query(QueryRequest queryRequest);

}