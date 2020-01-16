package com.example.ccb.model;

import java.util.Date;

public class JH_JYJ_PRODUCT_SAFE {
    private String eduOrgName;

    private Integer peopleNum;

    private String creater;

    private String updater;

    private Date creatime;

    private Date updatetime;

    public String getEduOrgName() {
        return eduOrgName;
    }

    public void setEduOrgName(String eduOrgName) {
        this.eduOrgName = eduOrgName;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
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