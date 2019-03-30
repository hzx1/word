package com.service.system;

import java.util.List;

import com.po.Employee;

public interface UserService {
	//登录
	public List<Employee> selectEmployee(Employee employee);
}
