package com.po;

public class Prescriptiontemplatedetail {
    private Integer id;

    private Integer prescriptiontemplateId;

    private Integer drugId;

    private Integer eachDosage;

    private Integer dosageQuantity;

    private Integer medicineformId;

    private Integer medicineFrequencyId;

    private Integer medicineAmount;

    private String note;

    private Integer isvalId;
    
    private String drugcode;
    private String drugName;
    private String medicineformName;
    private String medicinefrequencyName;
    
	public String getDrugcode() {
		return drugcode;
	}

	public void setDrugcode(String drugcode) {
		this.drugcode = drugcode;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getMedicineformName() {
		return medicineformName;
	}

	public void setMedicineformName(String medicineformName) {
		this.medicineformName = medicineformName;
	}

	public String getMedicinefrequencyName() {
		return medicinefrequencyName;
	}

	public void setMedicinefrequencyName(String medicinefrequencyName) {
		this.medicinefrequencyName = medicinefrequencyName;
	}

	
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public Integer getPrescriptiontemplateId() {
		return prescriptiontemplateId;
	}

	public void setPrescriptiontemplateId(Integer prescriptiontemplateId) {
		this.prescriptiontemplateId = prescriptiontemplateId;
	}

	public Integer getDrugId() {
		return drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}

	public Integer getEachDosage() {
		return eachDosage;
	}

	public void setEachDosage(Integer eachDosage) {
		this.eachDosage = eachDosage;
	}

	public Integer getDosageQuantity() {
		return dosageQuantity;
	}

	public void setDosageQuantity(Integer dosageQuantity) {
		this.dosageQuantity = dosageQuantity;
	}

	public Integer getMedicineformId() {
		return medicineformId;
	}

	public void setMedicineformId(Integer medicineformId) {
		this.medicineformId = medicineformId;
	}

	public Integer getMedicineFrequencyId() {
		return medicineFrequencyId;
	}

	public void setMedicineFrequencyId(Integer medicineFrequencyId) {
		this.medicineFrequencyId = medicineFrequencyId;
	}

	public Integer getMedicineAmount() {
		return medicineAmount;
	}

	public void setMedicineAmount(Integer medicineAmount) {
		this.medicineAmount = medicineAmount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}
    
}