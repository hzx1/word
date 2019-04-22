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
	//登录
	@Override
	public List<Employee> selectEmployee(Employee employee) {
		// TODO Auto-generated method 
		return userMapping.selectEmployee(employee);
	}
	//修改密码
	@Override
	public int updatepwe(String psw, Integer id) {
		// TODO Auto-generated method stub
		return userMapping.updatepwe(psw, id);
	}
	@Override
	public List<Employee> listidUM(Integer id) {
		// TODO Auto-generated method stub
		return userMapping.listidUM(id);
	}
	@Override
	public List<Employee> doctor() {
		// TODO Auto-generated method stub
		return userMapping.doctor();
	}

}
