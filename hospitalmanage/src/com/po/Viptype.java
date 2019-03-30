package com.po;

public class Viptype {
    private Integer id;

    private String typeCode;

    private String typeName;

    private Integer typeDiscount;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypecode() {
        return typeCode;
    }

    public void setTypecode(String typecode) {
        this.typeCode = typecode == null ? null : typecode.trim();
    }

    public String getTypename() {
        return typeName;
    }

    public void setTypename(String typename) {
        this.typeName = typename == null ? null : typename.trim();
    }

    public Integer getTypediscount() {
        return typeDiscount;
    }

    public void setTypediscount(Integer typediscount) {
        this.typeDiscount = typediscount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}