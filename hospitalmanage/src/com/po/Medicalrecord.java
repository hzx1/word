package com.po;

import java.util.Date;

public class Medicalrecord {
    private Integer id;

    private Integer registerId;

    private String medicalrecordCode;

    private String medicalrecordName;

    private Integer doctorId;

    private Integer diseaseId;

    private String note;

    private String patienappeal;

    private String medicalhistory;

    private String physicalstatus;

    private String primaryDiagnosis;

    private String opinion;

    private Date recordTime;

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

	public String getMedicalrecordCode() {
		return medicalrecordCode;
	}

	public void setMedicalrecordCode(String medicalrecordCode) {
		this.medicalrecordCode = medicalrecordCode;
	}

	public String getMedicalrecordName() {
		return medicalrecordName;
	}

	public void setMedicalrecordName(String medicalrecordName) {
		this.medicalrecordName = medicalrecordName;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(Integer diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPatienappeal() {
		return patienappeal;
	}

	public void setPatienappeal(String patienappeal) {
		this.patienappeal = patienappeal;
	}

	public String getMedicalhistory() {
		return medicalhistory;
	}

	public void setMedicalhistory(String medicalhistory) {
		this.medicalhistory = medicalhistory;
	}

	public String getPhysicalstatus() {
		return physicalstatus;
	}

	public void setPhysicalstatus(String physicalstatus) {
		this.physicalstatus = physicalstatus;
	}

	public String getPrimaryDiagnosis() {
		return primaryDiagnosis;
	}

	public void setPrimaryDiagnosis(String primaryDiagnosis) {
		this.primaryDiagnosis = primaryDiagnosis;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

 
}