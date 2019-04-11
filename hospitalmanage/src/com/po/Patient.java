package com.po;

public class Patient {
    private Integer id;

    private String cardCode;

    private String patientName;

    private Integer sex;

    private Integer maritalstatusId;

    private String job;

    private Integer patienttypeId;

    private Integer age;

    private Integer insuretypeId;

    private String medicareCode;

    private Integer viptypeId;

    private String tel;

    private String address;

    private String taboo;

    private String drugallergyHistory;
    
    //其他表的字段
    private String patientTypeName;
    private String vipTypeName;
    private String maritalStatusName;
    private String insureTypeName;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

  

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getMaritalstatusId() {
		return maritalstatusId;
	}

	public void setMaritalstatusId(Integer maritalstatusId) {
		this.maritalstatusId = maritalstatusId;
	}

	public Integer getPatienttypeId() {
		return patienttypeId;
	}

	public void setPatienttypeId(Integer patienttypeId) {
		this.patienttypeId = patienttypeId;
	}

	public Integer getInsuretypeId() {
		return insuretypeId;
	}

	public void setInsuretypeId(Integer insuretypeId) {
		this.insuretypeId = insuretypeId;
	}

	public String getMedicareCode() {
		return medicareCode;
	}

	public void setMedicareCode(String medicareCode) {
		this.medicareCode = medicareCode;
	}

	public Integer getViptypeId() {
		return viptypeId;
	}

	public void setViptypeId(Integer viptypeId) {
		this.viptypeId = viptypeId;
	}

	public String getDrugallergyHistory() {
		return drugallergyHistory;
	}

	public void setDrugallergyHistory(String drugallergyHistory) {
		this.drugallergyHistory = drugallergyHistory;
	}

	public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo == null ? null : taboo.trim();
    }

	/**
	 * @return the patientTypeName
	 */
	public String getPatientTypeName() {
		return patientTypeName;
	}

	/**
	 * @param patientTypeName the patientTypeName to set
	 */
	public void setPatientTypeName(String patientTypeName) {
		this.patientTypeName = patientTypeName;
	}

	/**
	 * @return the vipTypeName
	 */
	public String getVipTypeName() {
		return vipTypeName;
	}

	/**
	 * @param vipTypeName the vipTypeName to set
	 */
	public void setVipTypeName(String vipTypeName) {
		this.vipTypeName = vipTypeName;
	}

	/**
	 * @return the maritalStatusName
	 */
	public String getMaritalStatusName() {
		return maritalStatusName;
	}

	/**
	 * @param maritalStatusName the maritalStatusName to set
	 */
	public void setMaritalStatusName(String maritalStatusName) {
		this.maritalStatusName = maritalStatusName;
	}

	/**
	 * @return the insureTypeName
	 */
	public String getInsureTypeName() {
		return insureTypeName;
	}

	/**
	 * @param insureTypeName the insureTypeName to set
	 */
	public void setInsureTypeName(String insureTypeName) {
		this.insureTypeName = insureTypeName;
	}

   
}