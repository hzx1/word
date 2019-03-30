package com.service.resource;

import java.util.List;

import com.dao.resource.ResourceMapping;
import com.po.Resource;

public interface ResourceService {
	public List<Resource> initLogin(Integer id);
}
