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
    			   
    private String patientappeal;
    			   
    private String medicalhistory;

    private String physicalstatus;

    private String primaryDiagnosis;

    private String opinion;

    private Date recordTime;

    private Integer isvalId;
    //fitstatus
    private String cardcode;
    private String patientName;
    private String registerCode;
    private String departmentName;
    private String employeeName;
    private String diseaseName;
    private Integer departmentId;
    
    public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}


	public String getPatientappeal() {
		return patientappeal;
	}

	public void setPatientappeal(String patientappeal) {
		this.patientappeal = patientappeal;
	}

	public String getCardcode() {
		return cardcode;
	}

	public void setCardcode(String cardcode) {
		this.cardcode = cardcode;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getRegisterCode() {
		return registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

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