package com.example.ccb.model;

import java.util.Date;

public class JH_JYJ_XFZL {
    private String relatedCriminalsName;

    private Long totalNumber;

    private Long collectiveVisitNumber;

    private Date creatime;

    private Date updatetime;

    private String creater;

    private String updater;

    public String getRelatedCriminalsName() {
        return relatedCriminalsName;
    }

    public void setRelatedCriminalsName(String relatedCriminalsName) {
        this.relatedCriminalsName = relatedCriminalsName;
    }

    public Long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Long getCollectiveVisitNumber() {
        return collectiveVisitNumber;
    }

    public void setCollectiveVisitNumber(Long collectiveVisitNumber) {
        this.collectiveVisitNumber = collectiveVisitNumber;
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
}