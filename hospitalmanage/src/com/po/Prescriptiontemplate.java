package com.po;

import java.util.ArrayList;
import java.util.List;

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
    
    private List<Prescriptiontemplatedetail> detail=new ArrayList<Prescriptiontemplatedetail>();
    public List<Prescriptiontemplatedetail> getDetail() {
		return detail;
	}

	public void setDetail(List<Prescriptiontemplatedetail> detail) {
		this.detail = detail;
	}

	private Integer departmentId;
	private String employeeName;
    private String prescriptionTypeName;
    private String classifyName;
    private String departmentName;
    
    public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
    public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPrescriptionTypeName() {
		return prescriptionTypeName;
	}

	public void setPrescriptionTypeName(String prescriptionTypeName) {
		this.prescriptionTypeName = prescriptionTypeName;
	}

	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

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