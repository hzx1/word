package com.po;

import java.math.BigDecimal;

public class Department {
    private Integer id;

    private String deparTmentCode;

    private String deparTmentName;

    private String pinyinCode;

    private String wubiCode;

    private BigDecimal regisTersum;

    private String site;

    private Integer isregIster;

    private Integer isvalId;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentcode() {
        return deparTmentCode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.deparTmentCode = departmentcode == null ? null : departmentcode.trim();
    }

    public String getDepartmentname() {
        return deparTmentName;
    }

    public void setDepartmentname(String departmentname) {
        this.deparTmentName = departmentname == null ? null : departmentname.trim();
    }

    public String getPinyincode() {
        return pinyinCode;
    }

    public void setPinyincode(String pinyincode) {
        this.pinyinCode = pinyincode == null ? null : pinyincode.trim();
    }

    public String getWubicode() {
        return wubiCode;
    }

    public void setWubicode(String wubicode) {
        this.wubiCode = wubicode == null ? null : wubicode.trim();
    }

    public BigDecimal getRegistersum() {
        return regisTersum;
    }

    public void setRegistersum(BigDecimal registersum) {
        this.regisTersum = registersum;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getIsregister() {
        return isregIster;
    }

    public void setIsregister(Integer isregister) {
        this.isregIster = isregister;
    }

    public Integer getIsvalid() {
        return isvalId;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalId = isvalid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}