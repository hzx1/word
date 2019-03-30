package com.po;

import java.util.Date;

public class Prescription {
    private Integer id;

    private Integer registerId;

    private String prescriptionCode;

    private String prescriptionName;

    private Integer doctorId;

    private Integer natureId;

    private Integer prescriptiontypeId;

    private Integer classifyId;

    private String note;

    private String diagnosis;

    private Date prescriptionTime;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public String getPrescriptionCode() {
		return prescriptionCode;
	}

	public void setPrescriptionCode(String prescriptionCode) {
		this.prescriptionCode = prescriptionCode;
	}

	public String getPrescriptionName() {
		return prescriptionName;
	}

	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getNatureId() {
		return natureId;
	}

	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
	}

	public Integer getPrescriptiontypeId() {
		return prescriptiontypeId;
	}

	public void setPrescriptiontypeId(Integer prescriptiontypeId) {
		this.prescriptiontypeId = prescriptiontypeId;
	}

	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Date getPrescriptionTime() {
		return prescriptionTime;
	}

	public void setPrescriptionTime(Date prescriptionTime) {
		this.prescriptionTime = prescriptionTime;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

}