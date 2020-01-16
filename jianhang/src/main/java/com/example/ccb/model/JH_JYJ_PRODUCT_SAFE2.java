package com.example.ccb.model;

import java.util.Date;

public class JH_JYJ_PRODUCT_SAFE2 {
    private String safeIndustry;

    private Integer investmentAmount;

    private String creater;

    private String updater;

    private Date creatime;

    private Date updatetime;

    public String getSafeIndustry() {
        return safeIndustry;
    }

    public void setSafeIndustry(String safeIndustry) {
        this.safeIndustry = safeIndustry;
    }

    public Integer getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(Integer investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}