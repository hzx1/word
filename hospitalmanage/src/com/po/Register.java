package com.po;

import java.math.BigDecimal;
import java.util.Date;

public class Register {
    private Integer id;

    private Integer patientId;

    private Integer registerTypeId;

    private String registerCode;

    private Integer departmentId;

    private Integer doctorId;

    private BigDecimal registerSum;

    private Date registerTime;

    private Integer registerStatus;

    private Integer registerPersonId;

    private Integer isvalId;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

 

    public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getRegisterTypeId() {
		return registerTypeId;
	}

	public void setRegisterTypeId(Integer registerTypeId) {
		this.registerTypeId = registerTypeId;
	}

	public String getRegisterCode() {
		return registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public BigDecimal getRegisterSum() {
		return registerSum;
	}

	public void setRegisterSum(BigDecimal registerSum) {
		this.registerSum = registerSum;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Integer getRegisterStatus() {
		return registerStatus;
	}

	public void setRegisterStatus(Integer registerStatus) {
		this.registerStatus = registerStatus;
	}

	public Integer getRegisterPersonId() {
		return registerPersonId;
	}

	public void setRegisterPersonId(Integer registerPersonId) {
		this.registerPersonId = registerPersonId;
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
        this.note = note == null ? null : note.trim();
    }
}