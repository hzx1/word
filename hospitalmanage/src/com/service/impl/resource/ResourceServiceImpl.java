package com.service.impl.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.resource.ResourceMapping;
import com.ov.Menu;
import com.po.Resource;
import com.po.Role;
import com.service.resource.ResourceService;


@Transactional
@Service("ResourceService")
public class ResourceServiceImpl implements ResourceService {
	@javax.annotation.Resource
	private  ResourceMapping resourceMapping;
	@Override
	public List<Menu> initLoginTwo(Integer id) {
		Role role = resourceMapping.getRole(id);
		List<Resource> resource = resourceMapping.initLogin(role.getResourceid());
		List<Menu> menuResource = new ArrayList<Menu>();
		for (int i = 0; i < resource.size(); i++) {
			Menu menu = new Menu();
			menu.setResource(resource.get(i));
			menu.setListResource(resourceMapping.initLoginTwo(resource.get(i).getId()));
			menuResource.add(menu);
		}
		return menuResource;
	}

}
