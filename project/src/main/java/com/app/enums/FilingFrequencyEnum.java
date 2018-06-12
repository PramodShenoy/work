package com.app.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FilingFrequencyEnum {

    MONTHLY(1, "MONTHLY"),
    QUARTERLY(2, "QUARTERLY"),
    HALFYEARLY(3, "HALFYEARLY");

    private static final Map<Integer, FilingFrequencyEnum> lookup = new HashMap<>();

    static {
        for (FilingFrequencyEnum s : EnumSet.allOf(FilingFrequencyEnum.class))
            lookup.put(s.id(), s);
    }

    private int id;
    private String label;

    FilingFrequencyEnum(int k, String s) {
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
