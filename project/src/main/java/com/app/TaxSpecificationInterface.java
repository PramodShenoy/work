package com.app;

public interface TaxSpecificationInterface<T> {

    boolean yearSpecified(T obj);

    boolean stateSpecified(T obj);
}
