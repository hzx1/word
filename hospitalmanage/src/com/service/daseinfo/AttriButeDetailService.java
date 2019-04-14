package com.service.daseinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Attributedetail;

public interface AttriButeDetailService {
	//根据属性id查询attributeid
		public List<Attributedetail> listABDM(@Param("attributeid")Integer attributeid);
}
