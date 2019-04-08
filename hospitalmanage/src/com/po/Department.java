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

	public String getDeparTmentCode() {
		return deparTmentCode;
	}

	public void setDeparTmentCode(String deparTmentCode) {
		this.deparTmentCode = deparTmentCode;
	}

	public String getDeparTmentName() {
		return deparTmentName;
	}

	public void setDeparTmentName(String deparTmentName) {
		this.deparTmentName = deparTmentName;
	}

	public String getPinyinCode() {
		return pinyinCode;
	}

	public void setPinyinCode(String pinyinCode) {
		this.pinyinCode = pinyinCode;
	}

	public String getWubiCode() {
		return wubiCode;
	}

	public void setWubiCode(String wubiCode) {
		this.wubiCode = wubiCode;
	}

	public BigDecimal getRegisTersum() {
		return regisTersum;
	}

	public void setRegisTersum(BigDecimal regisTersum) {
		this.regisTersum = regisTersum;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getIsregIster() {
		return isregIster;
	}

	public void setIsregIster(Integer isregIster) {
		this.isregIster = isregIster;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}