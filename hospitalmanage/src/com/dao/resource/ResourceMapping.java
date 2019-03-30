package com.dao.resource;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Resource;

public interface ResourceMapping {
	public List<Resource> initLogin(@Param("id")Integer id);
	public List<Resource> initLoginTwo();
}
