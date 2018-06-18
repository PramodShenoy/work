package com.app;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class QueryRequest {
    private UUID appId;
    private String fromMonth;
    private String toMonth;
    private int fromYear;
    private int toYear;
    private String state;

    public QueryRequest() {

    }

    @Override
    public String toString() {
        return "QueryRequest{" +
                "appId=" + appId +
                ", fromMonth='" + fromMonth + '\'' +
                ", toMonth='" + toMonth + '\'' +
                ", fromYear=" + fromYear +
                ", toYear=" + toYear +
                ", state='" + state + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UUID getAppId() {
        return appId;
    }

    public void setAppId(UUID appId) {
        this.appId = appId;
    }

    public String getFromMonth() {
        return fromMonth;
    }

    public void setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
    }

    public String getToMonth() {
        return toMonth;
    }

    public void setToMonth(String toMonth) {
        this.toMonth = toMonth;
    }

    public int getFromYear() {
        return fromYear;
    }

    public void setFromYear(int fromYear) {
        this.fromYear = fromYear;
    }

    public int getToYear() {
        return toYear;
    }

    public void setToYear(int toYear) {
        this.toYear = toYear;
    }
}
