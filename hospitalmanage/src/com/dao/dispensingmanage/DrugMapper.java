package com.dao.dispensingmanage;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Drug;

public interface DrugMapper {
	//模糊查询
	public List<Drug> listD(@Param("contant") String contant);
}
