package com.po;

public class Disease {
    private Integer id;

    private String diseaseCode;

    private String diseaseName;

    private String diseaseExplain;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseasecode() {
        return diseaseCode;
    }

    public void setDiseasecode(String diseasecode) {
        this.diseaseCode = diseasecode == null ? null : diseasecode.trim();
    }

    public String getDiseasename() {
        return diseaseName;
    }

    public void setDiseasename(String diseasename) {
        this.diseaseName = diseasename == null ? null : diseasename.trim();
    }

    public String getDiseaseexplain() {
        return diseaseExplain;
    }

    public void setDiseaseexplain(String diseaseexplain) {
        this.diseaseExplain = diseaseexplain == null ? null : diseaseexplain.trim();
    }

    public Integer getIsvalid() {
        return isvalId;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalId = isvalid;
    }
}