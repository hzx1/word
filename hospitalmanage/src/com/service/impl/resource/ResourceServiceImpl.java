package com.service.impl.resource;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.resource.ResourceMapping;
import com.po.Resource;
import com.service.resource.ResourceService;


@Transactional
@Service("ResourceService")
public class ResourceServiceImpl implements ResourceService {
	@javax.annotation.Resource
	private  ResourceMapping resourceMapping;

	@Override
	public List<Resource> initLogin(Integer id) {
		return resourceMapping.initLogin(id);
	}

	@Override
	public List<Resource> initLoginTwo() {
		return resourceMapping.initLoginTwo();
	}

}
