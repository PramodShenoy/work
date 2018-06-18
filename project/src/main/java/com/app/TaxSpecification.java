package com.app;

public interface TaxSpecification<T> {

    boolean yearSpecified(T obj);

    boolean stateSpecified(T obj);

    //boolean appIdSpecified(T obj);
}
