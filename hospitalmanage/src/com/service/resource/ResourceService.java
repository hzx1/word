package com.service.resource;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dao.resource.ResourceMapping;
import com.ov.Menu;
import com.po.Resource;

public interface ResourceService {
	public List<Menu> initLoginTwo(Integer id);
}
