package com.app;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Request {
    UUID app_id;
    String fm;
    String tm;
    int fy;
    int ty;

    public Request() {

    }

    @Override
    public String toString() {
        return "Request{" +
                "app_id=" + app_id +
                ", fm='" + fm + '\'' +
                ", tm='" + tm + '\'' +
                ", fy=" + fy +
                ", ty=" + ty +
                '}';
    }

    public UUID getApp_id() {
        return app_id;
    }

    public void setApp_id(UUID app_id) {
        this.app_id = app_id;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public int getFy() {
        return fy;
    }

    public void setFy(int fy) {
        this.fy = fy;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }
}
