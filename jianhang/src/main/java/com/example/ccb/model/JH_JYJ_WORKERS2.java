package com.example.ccb.model;

import java.util.Date;

public class JH_JYJ_WORKERS2 {
    private String industry;

    private Integer workersNum;

    private Integer averageSalary;

    private String creater;

    private String updater;

    private Date creatime;

    private Date updatetime;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getWorkersNum() {
        return workersNum;
    }

    public void setWorkersNum(Integer workersNum) {
        this.workersNum = workersNum;
    }

    public Integer getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Integer averageSalary) {
        this.averageSalary = averageSalary;
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