package com.dao.system;

import com.po.Employee;

public interface UserMapping {
	//登录
	public Employee selectEmployee(Employee employee);
}
