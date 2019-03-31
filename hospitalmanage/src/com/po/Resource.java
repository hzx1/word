package com.po;

public class Resource {
    private Integer id;

    private Integer resourceSuperiorId;
    				
    private String resourceName;

    private String resourceUrl;

    private String resourceIcon;

    private Integer rank;

    private Integer isvalId;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the resourceSuperiorId
	 */
	public Integer getResourceSuperiorId() {
		return resourceSuperiorId;
	}

	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * @return the resourceUrl
	 */
	public String getResourceUrl() {
		return resourceUrl;
	}

	/**
	 * @return the resourceIcon
	 */
	public String getResourceIcon() {
		return resourceIcon;
	}

	/**
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * @return the isvalId
	 */
	public Integer getIsvalId() {
		return isvalId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param resourceSuperiorId the resourceSuperiorId to set
	 */
	public void setResourceSuperiorId(Integer resourceSuperiorId) {
		this.resourceSuperiorId = resourceSuperiorId;
	}

	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	/**
	 * @param resourceUrl the resourceUrl to set
	 */
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	/**
	 * @param resourceIcon the resourceIcon to set
	 */
	public void setResourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * @param isvalId the isvalId to set
	 */
	public void setIsvalId(Integer isvalId) {
		this.isvalId = isvalId;
	}



   
}