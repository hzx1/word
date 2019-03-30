package com.po;

public class Resource {
    private Integer id;

    private Integer resourceSuperiorId;
    				
    private String resourceName;

    private String resourceUrl;

    private String resourceIcon;

    private Integer rank;

    private Integer isvalId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getResourceSuperiorId() {
		return resourceSuperiorId;
	}

	public void setResourceSuperiorId(Integer resourceSuperiorId) {
		this.resourceSuperiorId = resourceSuperiorId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public String getResourceIcon() {
		return resourceIcon;
	}

	public void setResourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getIsvalId() {
		return isvalId;
	}

	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}

   
}