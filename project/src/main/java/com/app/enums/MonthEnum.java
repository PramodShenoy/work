package com.app.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum MonthEnum implements EnumIdInterface {

    apr(4, "apr"),
    may(5, "may"),
    jun(6, "jun"),
    jul(7, "jul"),
    aug(8, "aug"),
    sep(9, "sep"),
    oct(10, "oct"),
    nov(11, "nov"),
    dec(12, "dec"),
    jan(1, "jan"),
    feb(2, "feb"),
    mar(3, "mar");


    private static final Map<Integer, MonthEnum> lookup = new HashMap<>();

    static {
        for (MonthEnum s : EnumSet.allOf(MonthEnum.class))
            lookup.put(s.id(), s);
    }

    private int id;
    private String label;

    MonthEnum(int k, String s) {
        id = k;
        label = s;
    }

    public static MonthEnum from(int id) throws Exception {
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
