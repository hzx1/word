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
    private String  insuretypeName;
    
	public int getSex() {
		return sex;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getInsureTypeName() {
		return insureTypeName;
	}

	public void setInsureTypeName(String insureTypeName) {
		this.insureTypeName = insureTypeName;
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

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getDrugallergyhistory() {
		return drugallergyhistory;
	}

	public void setDrugallergyhistory(String drugallergyhistory) {
		this.drugallergyhistory = drugallergyhistory;
	}

	public String getInsuretypeName() {
		return insuretypeName;
	}

	public void setInsuretypeName(String insuretypeName) {
		this.insuretypeName = insuretypeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	/**
	 * @return the patientId
	 */
	public Integer getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the departmentname
	 */
	public String getDepartmentname() {
		return departmentName;
	}

	/**
	 * @param departmentname the departmentname to set
	 */
	public void setDepartmentname(String departmentname) {
		this.departmentName = departmentname;
	}

	/**
	 * @return the doctorname
	 */
	public String getDoctorname() {
		return doctorName;
	}

	/**
	 * @param doctorname the doctorname to set
	 */
	public void setDoctorname(String doctorname) {
		this.doctorName = doctorname;
	}

	/**
	 * @return the registerpersonname
	 */
	public String getRegisterpersonname() {
		return registerPersonName;
	}

	/**
	 * @param registerpersonname the registerpersonname to set
	 */
	public void setRegisterpersonname(String registerpersonname) {
		this.registerPersonName = registerpersonname;
	}

	/**
	 * @return the typesum
	 */
	public BigDecimal getTypesum() {
		return typeSum;
	}

	/**
	 * @param typesum the typesum to set
	 */
	public void setTypesum(BigDecimal typesum) {
		this.typeSum = typesum;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the registerPersonName
	 */
	public String getRegisterPersonName() {
		return registerPersonName;
	}

	/**
	 * @param registerPersonName the registerPersonName to set
	 */
	public void setRegisterPersonName(String registerPersonName) {
		this.registerPersonName = registerPersonName;
	}

	/**
	 * @return the typeSum
	 */
	public BigDecimal getTypeSum() {
		return typeSum;
	}

	/**
	 * @param typeSum the typeSum to set
	 */
	public void setTypeSum(BigDecimal typeSum) {
		this.typeSum = typeSum;
	}

	/**
	 * @return the sumRegisterSum
	 */
	public BigDecimal getSumRegisterSum() {
		return sumRegisterSum;
	}

	/**
	 * @param sumRegisterSum the sumRegisterSum to set
	 */
	public void setSumRegisterSum(BigDecimal sumRegisterSum) {
		this.sumRegisterSum = sumRegisterSum;
	}

	/**
	 * @return the countRegister
	 */
	public Integer getCountRegister() {
		return countRegister;
	}

	/**
	 * @param countRegister the countRegister to set
	 */
	public void setCountRegister(Integer countRegister) {
		this.countRegister = countRegister;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the cardCode
	 */
	public String getCardCode() {
		return cardCode;
	}

	/**
	 * @param cardCode the cardCode to set
	 */
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
    
}