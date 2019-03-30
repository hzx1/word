package com.po;

public class Prescriptiontemplate {
    private Integer id;

    private String templateName;

    private Integer doctorId;

    private Integer natureId;

    private Integer prescriptiontypeId;

    private Integer classifyId;

    private String note;

    private String diagnosis;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

  
}