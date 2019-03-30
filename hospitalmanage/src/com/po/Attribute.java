package com.po;

public class Attribute {
    private Integer id;

    private String attriButeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttributename() {
        return attriButeName;
    }

    public void setAttributename(String attributename) {
        this.attriButeName = attributename == null ? null : attributename.trim();
    }
}