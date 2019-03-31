package com.ov;

import java.util.List;

import com.po.Resource;

public class Menu {
	private Resource resource;
	private List<Resource> listResource;
	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}
	/**
	 * @return the listResource
	 */
	public List<Resource> getListResource() {
		return listResource;
	}
	/**
	 * @param resource the resource to set
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	/**
	 * @param listResource the listResource to set
	 */
	public void setListResource(List<Resource> listResource) {
		this.listResource = listResource;
	}
	
}
