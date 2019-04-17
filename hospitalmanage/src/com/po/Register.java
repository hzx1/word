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
    //其它表的字段
    private String typeName;
    private String departmentName;
    private String doctorName;
    private String registerPersonName;
    private String patientName;
    private String cardCode;
    private BigDecimal typeSum;
    private BigDecimal sumRegisterSum;
    private Integer countRegister;
    
    
    
    private String begintime;
	private String endtime;
	private String insureTypeName;
	private int sex;
	private int age;
	private String tel;
    private String drugallergyhistory;
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
		this.note = note;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getRegisterPersonName() {
		return registerPersonName;
	}
	public void setRegisterPersonName(String registerPersonName) {
		this.registerPersonName = registerPersonName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public BigDecimal getTypeSum() {
		return typeSum;
	}
	public void setTypeSum(BigDecimal typeSum) {
		this.typeSum = typeSum;
	}
	public BigDecimal getSumRegisterSum() {
		return sumRegisterSum;
	}
	public void setSumRegisterSum(BigDecimal sumRegisterSum) {
		this.sumRegisterSum = sumRegisterSum;
	}
	public Integer getCountRegister() {
		return countRegister;
	}
	public void setCountRegister(Integer countRegister) {
		this.countRegister = countRegister;
	}
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getInsureTypeName() {
		return insureTypeName;
	}
	public void setInsureTypeName(String insureTypeName) {
		this.insureTypeName = insureTypeName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDrugallergyhistory() {
		return drugallergyhistory;
	}
	public void setDrugallergyhistory(String drugallergyhistory) {
		this.drugallergyhistory = drugallergyhistory;
	}

    

 
}