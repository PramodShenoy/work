package com.app;

import java.util.List;

public interface Repository<T> {

    void insertData(T data);

    void delete(T data);

    void update(T data);

    List<T> query(QueryRequest queryRequest);

}