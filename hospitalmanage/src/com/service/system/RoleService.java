package com.service.system;

import com.po.Role;

public interface RoleService {
	//根据Employee的positionid来查询
	Role rolePositionid(Integer id);
}
