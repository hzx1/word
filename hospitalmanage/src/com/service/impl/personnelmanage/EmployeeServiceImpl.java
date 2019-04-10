package com.service.impl.personnelmanage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.personnelmanage.EmployeeMapper;
import com.po.Employee;
import com.service.personnelmanage.EmployeeService;

@Transactional
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> getGuaHaoYuan() {
		return employeeMapper.getGuaHaoYuan();
	}

}
