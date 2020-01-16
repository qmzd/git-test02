package com.example.ccb.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Table;
import java.math.BigDecimal;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ZHXMMZ")
public class Zhxmmz {
    private String id;

    private String department;

    private String pdate;

    private String pdateds;

    private BigDecimal qjts;

    private String remark;

    private String remark1;

    private String remark2;

    private String remark3;

    private String sign;

    private String spost;

    private String xyname;

    private String yscel;

    private String ysqdl;

    private String yxcel;

    private String yxqdl;

    private String zkcel;

    private String zkl;

    private String wsdil;

    private String wxdil;

    private String zdil;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate == null ? null : pdate.trim();
    }

    public String getPdateds() {
        return pdateds;
    }

    public void setPdateds(String pdateds) {
        this.pdateds = pdateds == null ? null : pdateds.trim();
    }

    public BigDecimal getQjts() {
        return qjts;
    }

    public void setQjts(BigDecimal qjts) {
        this.qjts = qjts;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getSpost() {
        return spost;
    }

    public void setSpost(String spost) {
        this.spost = spost == null ? null : spost.trim();
    }

    public String getXyname() {
        return xyname;
    }

    public void setXyname(String xyname) {
        this.xyname = xyname == null ? null : xyname.trim();
    }

    public String getYscel() {
        return yscel;
    }

    public void setYscel(String yscel) {
        this.yscel = yscel == null ? null : yscel.trim();
    }

    public String getYsqdl() {
        return ysqdl;
    }

    public void setYsqdl(String ysqdl) {
        this.ysqdl = ysqdl == null ? null : ysqdl.trim();
    }

    public String getYxcel() {
        return yxcel;
    }

    public void setYxcel(String yxcel) {
        this.yxcel = yxcel == null ? null : yxcel.trim();
    }

    public String getYxqdl() {
        return yxqdl;
    }

    public void setYxqdl(String yxqdl) {
        this.yxqdl = yxqdl == null ? null : yxqdl.trim();
    }

    public String getZkcel() {
        return zkcel;
    }

    public void setZkcel(String zkcel) {
        this.zkcel = zkcel == null ? null : zkcel.trim();
    }

    public String getZkl() {
        return zkl;
    }

    public void setZkl(String zkl) {
        this.zkl = zkl == null ? null : zkl.trim();
    }

    public String getWsdil() {
        return wsdil;
    }

    public void setWsdil(String wsdil) {
        this.wsdil = wsdil == null ? null : wsdil.trim();
    }

    public String getWxdil() {
        return wxdil;
    }

    public void setWxdil(String wxdil) {
        this.wxdil = wxdil == null ? null : wxdil.trim();
    }

    public String getZdil() {
        return zdil;
    }

    public void setZdil(String zdil) {
        this.zdil = zdil == null ? null : zdil.trim();
    }
}