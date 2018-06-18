package com.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxFilingRecord {

    private UUID appId;
    @GeneratedValue
    private int id;
    private String state;
    private int fromYear;
    private int toYear;
    private String taxType;
    private String filingFrequency;
    private BigDecimal jan;
    private BigDecimal feb;
    private BigDecimal mar;
    private BigDecimal apr;
    private BigDecimal may;
    private BigDecimal jun;
    private BigDecimal jul;
    private BigDecimal aug;
    private BigDecimal sep;
    private BigDecimal oct;
    private BigDecimal nov;
    private BigDecimal dec;
    private List<BigDecimal> filingValues;

    public TaxFilingRecord() {
        filingValues = new ArrayList<>();
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
        filingValues.add(jan);
        this.jan = jan;
    }

    public BigDecimal getFeb() {
        return feb;
    }

    public void setFeb(BigDecimal feb) {
        filingValues.add(feb);
        this.feb = feb;
    }

    public BigDecimal getMar() {
        return mar;
    }

    public void setMar(BigDecimal mar) {
        filingValues.add(mar);
        this.mar = mar;
    }

    public BigDecimal getApr() {
        return apr;
    }

    public void setApr(BigDecimal apr) {
        filingValues.add(apr);
        this.apr = apr;
    }

    public BigDecimal getMay() {
        return may;
    }

    public void setMay(BigDecimal may) {
        filingValues.add(may);
        this.may = may;
    }

    public BigDecimal getJun() {
        return jun;
    }

    public void setJun(BigDecimal jun) {
        filingValues.add(jun);
        this.jun = jun;
    }

    public BigDecimal getJul() {
        return jul;
    }

    public void setJul(BigDecimal jul) {
        filingValues.add(jul);
        this.jul = jul;
    }

    public BigDecimal getAug() {
        return aug;
    }

    public void setAug(BigDecimal aug) {
        filingValues.add(aug);
        this.aug = aug;
    }

    public BigDecimal getSep() {
        return sep;
    }

    public void setSep(BigDecimal sep) {
        filingValues.add(sep);
        this.sep = sep;
    }

    public BigDecimal getOct() {
        return oct;
    }

    public void setOct(BigDecimal oct) {
        filingValues.add(oct);
        this.oct = oct;
    }

    public BigDecimal getNov() {
        return nov;
    }

    public void setNov(BigDecimal nov) {
        filingValues.add(nov);
        this.nov = nov;
    }

    public BigDecimal getDec() {
        return dec;
    }

    public void setDec(BigDecimal dec) {
        filingValues.add(dec);
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

    public List<BigDecimal> getFilingValues() {
        return filingValues;
    }
}
