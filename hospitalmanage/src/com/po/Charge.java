package com.po;

import java.math.BigDecimal;
import java.util.Date;

public class Charge {
    private Integer id;

    private Integer prescriptionId;

    private String receiptCode;

    private String invoiceCode;

    private Integer chargeStatus;

    private Integer disCount;

    private Integer priviLege;

    private BigDecimal beforeReceivable;

    private BigDecimal afterReceivable;

    private BigDecimal mediCareCanpay;

    private BigDecimal cost;

    private Integer operatIonpersonId;

    private Date chargeTime;

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

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public Integer getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(Integer chargeStatus) {
		this.chargeStatus = chargeStatus;
	}

	public Integer getDisCount() {
		return disCount;
	}

	public void setDisCount(Integer disCount) {
		this.disCount = disCount;
	}

	public Integer getPriviLege() {
		return priviLege;
	}

	public void setPriviLege(Integer priviLege) {
		this.priviLege = priviLege;
	}

	public BigDecimal getBeforeReceivable() {
		return beforeReceivable;
	}

	public void setBeforeReceivable(BigDecimal beforeReceivable) {
		this.beforeReceivable = beforeReceivable;
	}

	public BigDecimal getAfterReceivable() {
		return afterReceivable;
	}

	public void setAfterReceivable(BigDecimal afterReceivable) {
		this.afterReceivable = afterReceivable;
	}

	public BigDecimal getMediCareCanpay() {
		return mediCareCanpay;
	}

	public void setMediCareCanpay(BigDecimal mediCareCanpay) {
		this.mediCareCanpay = mediCareCanpay;
	}

	public Integer getOperatIonpersonId() {
		return operatIonpersonId;
	}

	public void setOperatIonpersonId(Integer operatIonpersonId) {
		this.operatIonpersonId = operatIonpersonId;
	}

	public Date getChargeTime() {
		return chargeTime;
	}

	public void setChargeTime(Date chargeTime) {
		this.chargeTime = chargeTime;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

	public String getReceiptcode() {
        return receiptCode;
    }

    public void setReceiptcode(String receiptcode) {
        this.receiptCode = receiptcode == null ? null : receiptcode.trim();
    }

    public String getInvoicecode() {
        return invoiceCode;
    }

    public void setInvoicecode(String invoicecode) {
        this.invoiceCode = invoicecode == null ? null : invoicecode.trim();
    }


    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

   

  
}