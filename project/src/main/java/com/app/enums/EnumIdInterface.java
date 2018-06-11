package com.app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface EnumIdInterface {
    @JsonProperty("id")
    public int id();

    @JsonProperty("name")
    public String name();

    @JsonProperty("label")
    public String label();
}