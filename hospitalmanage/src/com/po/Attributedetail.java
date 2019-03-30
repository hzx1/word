package com.po;

public class Attributedetail {
    private Integer id;

    private Integer attriButeId;

    private String detailName;

    private String detailenName;

    private String note;

    private Integer isvalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  
    public Integer getAttriButeId() {
		return attriButeId;
	}

	public void setAttriButeId(Integer attriButeId) {
		this.attriButeId = attriButeId;
	}

	public String getDetailName() {
		return detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	public String getDetailenName() {
		return detailenName;
	}

	public void setDetailenName(String detailenName) {
		this.detailenName = detailenName;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

	public String getDetailname() {
        return detailName;
    }

    public void setDetailname(String detailname) {
        this.detailName = detailname == null ? null : detailname.trim();
    }

    public String getDetailenname() {
        return detailenName;
    }

    public void setDetailenname(String detailenname) {
        this.detailenName = detailenname == null ? null : detailenname.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

   
}