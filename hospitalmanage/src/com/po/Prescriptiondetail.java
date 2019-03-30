package com.po;

public class Prescriptiondetail {
    private Integer id;

    private Integer prescriptionId;

    private Integer drugId;

    private Integer eachDosage;

    private Integer dosageQuantity;

    private Integer medicineFormid;

    private Integer medicineFrequencyid;

    private Integer medicineAmount;

    private String note;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public Integer getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
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

	public Integer getMedicineFormid() {
		return medicineFormid;
	}

	public void setMedicineFormid(Integer medicineFormid) {
		this.medicineFormid = medicineFormid;
	}

	public Integer getMedicineFrequencyid() {
		return medicineFrequencyid;
	}

	public void setMedicineFrequencyid(Integer medicineFrequencyid) {
		this.medicineFrequencyid = medicineFrequencyid;
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