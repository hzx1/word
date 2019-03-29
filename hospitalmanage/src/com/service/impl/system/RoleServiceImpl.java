package com.service.impl.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.system.RoleMapping;
import com.po.Role;
import com.service.system.RoleService;

@Transactional
@Service(value="roleService")
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleMapping roleMapping;

	@Override
	public Role rolePositionid(Integer id) {
		
		return roleMapping.rolePositionid(id);
	}
	
}
