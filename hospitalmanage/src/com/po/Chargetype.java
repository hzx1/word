package com.po;

public class Chargetype {
    private Integer id;

    private String typeCode;

    private String typeName;

    private String itemMark;

    private Integer disCount;

    private String note;

    private Integer isvalId;

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


    public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getItemMark() {
		return itemMark;
	}

	public void setItemMark(String itemMark) {
		this.itemMark = itemMark;
	}

	public Integer getDisCount() {
		return disCount;
	}

	public void setDisCount(Integer disCount) {
		this.disCount = disCount;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

	public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

  
}