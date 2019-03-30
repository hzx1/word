package com.po;

public class Useunit {
    private Integer id;

    private String unitName;

    private String tel;

    private Integer postCode;

    private String phone;

    private String fax;

    private String addRess;

    private Integer bankId;

    private String bankacCount;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitname() {
        return unitName;
    }

    public void setUnitname(String unitname) {
        this.unitName = unitname == null ? null : unitname.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getPostcode() {
        return postCode;
    }

    public void setPostcode(Integer postcode) {
        this.postCode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAddress() {
        return addRess;
    }

    public void setAddress(String address) {
        this.addRess = address == null ? null : address.trim();
    }

    public Integer getBankid() {
        return bankId;
    }

    public void setBankid(Integer bankid) {
        this.bankId = bankid;
    }

    public String getBankaccount() {
        return bankacCount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankacCount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}