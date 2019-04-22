package com.service.system;

import java.util.List;

import com.po.Employee;

public interface UserService {
	//登录
	public List<Employee> selectEmployee(Employee employee);
	//修改密码
	public int updatepwe(String psw,Integer id);
	//科室id查询
	public List<Employee> listidUM(Integer id);
	//查看医生
	public List<Employee> doctor(Integer isdoctor);
		
}
