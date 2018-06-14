package com.app.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TaxTypeEnum {

    VAT(10, "VAT"),
    ST(20, "ST"),
    CST(30, "CST");

    private static final Map<Integer, FilingFrequencyEnum> lookup = new HashMap<>();

    static {
        for (FilingFrequencyEnum s : EnumSet.allOf(FilingFrequencyEnum.class))
            lookup.put(s.id(), s);
    }

    private int id;
    private String label;

    TaxTypeEnum(int k, String s) {
        id = k;
        label = s;
    }

    public static FilingFrequencyEnum from(int id) throws Exception {
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
