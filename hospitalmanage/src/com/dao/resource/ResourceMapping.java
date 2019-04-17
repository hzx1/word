package com.dao.resource;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Resource;
import com.po.Role;

public interface ResourceMapping {
	public Role getRole(@Param("id")Integer id);
	public List<Resource> initLogin(@Param("id")String id);
	public List<Resource> initLoginTwo(@Param("id")Integer id);
}
