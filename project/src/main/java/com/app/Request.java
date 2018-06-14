package com.app;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Request {
    private UUID app_id;
    private String from_month;
    private String to_month;
    private int from_year;
    private int to_year;
    private String state;

    public Request() {

    }

    @Override
    public String toString() {
        return "Request{" +
                "app_id=" + app_id +
                ", from_month='" + from_month + '\'' +
                ", to_month='" + to_month + '\'' +
                ", from_year=" + from_year +
                ", to_year=" + to_year +
                ", state='" + state + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UUID getApp_id() {
        return app_id;
    }

    public void setApp_id(UUID app_id) {
        this.app_id = app_id;
    }

    public String getFrom_month() {
        return from_month;
    }

    public void setFrom_month(String from_month) {
        this.from_month = from_month;
    }

    public String getTo_month() {
        return to_month;
    }

    public void setTo_month(String to_month) {
        this.to_month = to_month;
    }

    public int getFrom_year() {
        return from_year;
    }

    public void setFrom_year(int from_year) {
        this.from_year = from_year;
    }

    public int getTo_year() {
        return to_year;
    }

    public void setTo_year(int to_year) {
        this.to_year = to_year;
    }
}
