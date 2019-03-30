package com.dao.system;

import java.util.List;

import com.po.Employee;

public interface UserMapping {
	//登录
	public List<Employee> selectEmployee(Employee employee);
}
