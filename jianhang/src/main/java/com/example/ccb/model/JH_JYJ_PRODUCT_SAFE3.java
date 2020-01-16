package com.example.ccb.model;

import java.util.Date;

public class JH_JYJ_PRODUCT_SAFE3 {
    private String safeMoneyFrom;

    private Integer money;

    private String creater;

    private String updater;

    private Date creatime;

    private Date updatetime;

    public String getSafeMoneyFrom() {
        return safeMoneyFrom;
    }

    public void setSafeMoneyFrom(String safeMoneyFrom) {
        this.safeMoneyFrom = safeMoneyFrom;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
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