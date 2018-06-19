package com.app.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TaxErrorEnum implements EnumIdInterface {

    SUCCESS(0, "SUCCESS"),
    INSERT_ERROR(10, "ERORR IN INSERTING"),
    UPDATE_ERROR(20, "ERROR IN UPDATING"),
    DELETE_ERROR(30, "ERROR IN DELETING");

    private static final Map<Integer, TaxErrorEnum> lookup = new HashMap<>();

    static {
        for (TaxErrorEnum s : EnumSet.allOf(TaxErrorEnum.class))
            lookup.put(s.id(), s);
    }

    private int id;
    private String label;

    TaxErrorEnum(int k, String s) {
        id = k;
        label = s;
    }

    public static TaxErrorEnum from(int id) throws Exception {
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
