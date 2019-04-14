package com.dao.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Department;

public interface DeparTmentMapper {
	//查看所有科室
	public List<Department> listDTM();
	//根据id来查询科室
	public Department getDTM(@Param("id")Integer id);
	//根据登录的名字来查询科室
	public Department getEDTM(@Param("id")Integer id);
	
}
