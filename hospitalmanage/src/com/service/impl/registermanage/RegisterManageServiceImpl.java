package com.service.impl.registermanage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.registermanage.RegisterManage;
import com.po.Attributedetail;
import com.po.Department;
import com.po.Employee;
import com.po.Patienttype;
import com.po.Register;
import com.po.Registertype;
import com.po.Viptype;
import com.service.registermanage.RegisterManageService;

@Transactional
@Service("RegisterManageService")
public class RegisterManageServiceImpl implements RegisterManageService{

	@Resource
	private RegisterManage registerManage;
	
	@Override
	public List<Attributedetail> getByName(String name) {
		return registerManage.getByName(name);
	}

	@Override
	public List<Viptype> getVipList() {
		return registerManage.getVipList();
	}

	@Override
	public List<Patienttype> getTypeList() {
		return registerManage.getTypeList();
	}

	@Override
	public List<Department> getDepartmentList() {
		return registerManage.getDepartmentList();
	}

	@Override
	public List<Employee> getDoctors() {
		return registerManage.getDoctors();
	}

	@Override
	public List<Registertype> getTypeName() {
		return registerManage.getTypeName();
	}

	@Override
	public List<Register> findLast() {
		return registerManage.findLast();
	}

	@Override
	public Register countinfo() {
		return registerManage.countinfo();
	}
	
}
