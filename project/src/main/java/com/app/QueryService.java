package com.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class QueryService implements TaxSpecificationInterface<QueryRequest> {

    @Autowired
    private TaxRepository taxRepository;

    public List<TaxFilingRecord> query(QueryRequest queryRequest) {
        if (stateSpecified(queryRequest))
            return taxRepository.queryWithState(queryRequest);
        else if (yearSpecified(queryRequest))
            return taxRepository.queryWithYearRange(queryRequest);
        else
            return taxRepository.queryWithAppIdOnly(queryRequest);
    }

    @Override
    public boolean stateSpecified(QueryRequest obj) {
        return obj.getState() != null;
    }

    @Override
    public boolean yearSpecified(QueryRequest obj) {
        return obj.getFromYear() != 0 && obj.getToYear() != 0;
    }
}
