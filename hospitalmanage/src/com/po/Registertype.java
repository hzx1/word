package com.po;

import java.math.BigDecimal;

public class Registertype {
    private Integer id;

    private String typeCode;

    private String typeName;

    private BigDecimal typeSum;

    private String note;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public BigDecimal getTypeSum() {
		return typeSum;
	}

	public void setTypeSum(BigDecimal typeSum) {
		this.typeSum = typeSum;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

   
}