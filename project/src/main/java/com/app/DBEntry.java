package com.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.util.UUID;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DBEntry {
    UUID app_id;
    @GeneratedValue
    int id;
    int from_year;
    String state;

    @Override
    public String toString() {
        return "DBEntry{" +
                "app_id=" + app_id +
                ", id=" + id +
                ", from_year=" + from_year +
                ", state='" + state + '\'' +
                ", to_year=" + to_year +
                ", tax_type=" + tax_type +
                ", filing_frequency=" + filing_frequency +
                ", jan='" + jan + '\'' +
                ", feb='" + feb + '\'' +
                ", mar='" + mar + '\'' +
                ", apr='" + apr + '\'' +
                ", may='" + may + '\'' +
                ", jun='" + jun + '\'' +
                ", jul='" + jul + '\'' +
                ", aug='" + aug + '\'' +
                ", sep='" + sep + '\'' +
                ", oct='" + oct + '\'' +
                ", nov='" + nov + '\'' +
                ", dec='" + dec + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    int to_year;
    int tax_type;
    int filing_frequency;
    String jan;
    String feb;
    String mar;
    String apr;
    String may;
    String jun;
    String jul;
    String aug;
    String sep;
    String oct;
    String nov;
    String dec;


    public DBEntry() {
    }

    public UUID getApp_id() {
        return app_id;
    }

    public void setApp_id(UUID app_id) {
        this.app_id = app_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTax_type() {
        return tax_type;
    }

    public void setTax_type(int tax_type) {
        this.tax_type = tax_type;
    }

    public int getFiling_frequency() {
        return filing_frequency;
    }

    public void setFiling_frequency(int filing_frequency) {
        this.filing_frequency = filing_frequency;
    }

    public String getJan() {
        return jan;
    }

    public void setJan(String jan) {
        this.jan = jan;
    }

    public String getFeb() {
        return feb;
    }

    public void setFeb(String feb) {
        this.feb = feb;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getApr() {
        return apr;
    }

    public void setApr(String apr) {
        this.apr = apr;
    }

    public String getMay() {
        return may;
    }

    public void setMay(String may) {
        this.may = may;
    }

    public String getJun() {
        return jun;
    }

    public void setJun(String jun) {
        this.jun = jun;
    }

    public String getJul() {
        return jul;
    }

    public void setJul(String jul) {
        this.jul = jul;
    }

    public String getAug() {
        return aug;
    }

    public void setAug(String aug) {
        this.aug = aug;
    }

    public String getSep() {
        return sep;
    }

    public void setSep(String sep) {
        this.sep = sep;
    }

    public String getOct() {
        return oct;
    }

    public void setOct(String oct) {
        this.oct = oct;
    }

    public String getNov() {
        return nov;
    }

    public void setNov(String nov) {
        this.nov = nov;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
