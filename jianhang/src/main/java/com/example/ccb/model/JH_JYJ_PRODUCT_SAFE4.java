package com.example.ccb.model;

import java.util.Date;

public class JH_JYJ_PRODUCT_SAFE4 {
    private String safeScreenOrg;

    private Integer screenTimes;

    private String creater;

    private String updater;

    private Date creatime;

    private Date updatetime;

    public String getSafeScreenOrg() {
        return safeScreenOrg;
    }

    public void setSafeScreenOrg(String safeScreenOrg) {
        this.safeScreenOrg = safeScreenOrg;
    }

    public Integer getScreenTimes() {
        return screenTimes;
    }

    public void setScreenTimes(Integer screenTimes) {
        this.screenTimes = screenTimes;
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