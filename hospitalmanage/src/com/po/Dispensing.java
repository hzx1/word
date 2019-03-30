package com.po;

import java.util.Date;

public class Dispensing {
    private Integer id;

    private Integer chargeId;

    private Integer dispenSingStatus;

    private Date dispenSingTime;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChargeid() {
        return chargeId;
    }

    public void setChargeid(Integer chargeid) {
        this.chargeId = chargeid;
    }

    public Integer getDispensingstatus() {
        return dispenSingStatus;
    }

    public void setDispensingstatus(Integer dispensingstatus) {
        this.dispenSingStatus = dispensingstatus;
    }

    public Date getDispensingtime() {
        return dispenSingTime;
    }

    public void setDispensingtime(Date dispensingtime) {
        this.dispenSingTime = dispensingtime;
    }

    public Integer getIsvalid() {
        return isvalId;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalId = isvalid;
    }
}