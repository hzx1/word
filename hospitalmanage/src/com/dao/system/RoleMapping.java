package com.dao.system;

import com.po.Role;

public interface RoleMapping {
	//根据Employee的positionid来查询
		Role rolePositionid(Integer id);
}
