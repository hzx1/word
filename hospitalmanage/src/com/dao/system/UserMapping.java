package com.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Employee;

public interface UserMapping {
	//登录
	public List<Employee> selectEmployee(Employee employee);
	//修改密码
	public int updatepwe(@Param("psw")String psw,@Param("id")Integer id);
	//科室id查询
	public List<Employee> listidUM(Integer id);
	//查看医生
	public List<Employee> doctor(@Param("isdoctor")Integer isdoctor);
	
}
