package com.po;

public class Role {
    private Integer id;

    private String roleName;

    private String positionId;

    private String resourceId;

    private String note;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return roleName;
    }

    public void setRolename(String rolename) {
        this.roleName = rolename == null ? null : rolename.trim();
    }

    public String getPositionid() {
        return positionId;
    }

    public void setPositionid(String positionid) {
        this.positionId = positionid == null ? null : positionid.trim();
    }

    public String getResourceid() {
        return resourceId;
    }

    public void setResourceid(String resourceid) {
        this.resourceId = resourceid == null ? null : resourceid.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getIsvalid() {
        return isvalId;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalId = isvalid;
    }
}