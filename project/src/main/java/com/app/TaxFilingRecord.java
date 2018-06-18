package com.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.math.BigDecimal;
import java.util.UUID;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxFilingRecord {

    UUID appId;
    @GeneratedValue
    int id;
    String state;
    int fromYear;
    int toYear;
    String taxType;
    String filingFrequency;
    BigDecimal jan;
    BigDecimal feb;
    BigDecimal mar;
    BigDecimal apr;
    BigDecimal may;
    BigDecimal jun;
    BigDecimal jul;
    BigDecimal aug;
    BigDecimal sep;
    BigDecimal oct;
    BigDecimal nov;
    BigDecimal dec;

    public TaxFilingRecord() {
    }


    public UUID getAppId() {
        return appId;
    }

    public void setAppId(UUID appId) {
        this.appId = appId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getFilingFrequency() {
        return filingFrequency;
    }

    public void setFilingFrequency(String filingFrequency) {
        this.filingFrequency = filingFrequency;
    }

    public BigDecimal getJan() {
        return jan;
    }

    public void setJan(BigDecimal jan) {
        this.jan = jan;
    }

    public BigDecimal getFeb() {
        return feb;
    }

    public void setFeb(BigDecimal feb) {
        this.feb = feb;
    }

    public BigDecimal getMar() {
        return mar;
    }

    public void setMar(BigDecimal mar) {
        this.mar = mar;
    }

    public BigDecimal getApr() {
        return apr;
    }

    public void setApr(BigDecimal apr) {
        this.apr = apr;
    }

    public BigDecimal getMay() {
        return may;
    }

    public void setMay(BigDecimal may) {
        this.may = may;
    }

    public BigDecimal getJun() {
        return jun;
    }

    public void setJun(BigDecimal jun) {
        this.jun = jun;
    }

    public BigDecimal getJul() {
        return jul;
    }

    public void setJul(BigDecimal jul) {
        this.jul = jul;
    }

    public BigDecimal getAug() {
        return aug;
    }

    public void setAug(BigDecimal aug) {
        this.aug = aug;
    }

    public BigDecimal getSep() {
        return sep;
    }

    public void setSep(BigDecimal sep) {
        this.sep = sep;
    }

    public BigDecimal getOct() {
        return oct;
    }

    public void setOct(BigDecimal oct) {
        this.oct = oct;
    }

    public BigDecimal getNov() {
        return nov;
    }

    public void setNov(BigDecimal nov) {
        this.nov = nov;
    }

    public BigDecimal getDec() {
        return dec;
    }

    public void setDec(BigDecimal dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return "TaxFilingRecord{" +
                "appId=" + appId +
                ", id=" + id +
                ", state='" + state + '\'' +
                ", fromYear=" + fromYear +
                ", toYear=" + toYear +
                ", taxType='" + taxType + '\'' +
                ", filingFrequency='" + filingFrequency + '\'' +
                ", jan=" + jan +
                ", feb=" + feb +
                ", mar=" + mar +
                ", apr=" + apr +
                ", may=" + may +
                ", jun=" + jun +
                ", jul=" + jul +
                ", aug=" + aug +
                ", sep=" + sep +
                ", oct=" + oct +
                ", nov=" + nov +
                ", dec=" + dec +
                '}';
    }
}
