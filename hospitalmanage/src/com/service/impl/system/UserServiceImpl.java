package com.service.impl.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.system.UserMapping;
import com.po.Employee;
import com.service.system.UserService;
@Transactional
@Service(value="userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapping userMapping;
	@Override
	public List<Employee> selectEmployee(Employee employee) {
		// TODO Auto-generated method 
		return userMapping.selectEmployee(employee);
	}

}
