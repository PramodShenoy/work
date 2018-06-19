package com.app.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TaxTypeEnum implements EnumIdInterface {

    VAT(10, "VAT"),
    ST(20, "ST"),
    CST(30, "CST");

    private static final Map<Integer, TaxTypeEnum> lookup = new HashMap<>();

    static {
        for (TaxTypeEnum s : EnumSet.allOf(TaxTypeEnum.class))
            lookup.put(s.id(), s);
    }

    private int id;
    private String label;

    TaxTypeEnum(int k, String s) {
        id = k;
        label = s;
    }

    public static TaxTypeEnum from(int id) throws Exception {
        if (lookup.get(id) == null) throw new Exception("invalid MonthEnum value");
        return lookup.get(id);
    }

    public int id() {
        return id;
    }

    public String label() {
        return label;
    }
}
