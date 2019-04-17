package com.service.impl.registermanage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.registermanage.RegisterManage;
import com.po.Attributedetail;
import com.po.Department;
import com.po.Employee;
import com.po.Patient;
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
	public Register findLast() {
		return registerManage.findLast();
	}

	@Override
	public Register countinfo() {
		return registerManage.countinfo();
	}

	@Override
	public List<Register> pageFind(Integer currentpage, Integer pageSize) {
		return registerManage.pageFind(currentpage, pageSize);
	}

	@Override
	public int addPatient(Patient pt) {
		return registerManage.addPatient(pt);
	}

	@Override
	public List<Patient> getPatientByCode(String code) {
		return registerManage.getPatientByCode(code);
	}

	@Override
	public int add(Register rs) {
		return registerManage.add(rs);
	}

	@Override
	public List<Employee> getDoctorsTwo(Integer id) {
		return registerManage.getDoctorsTwo(id);
	}

	@Override
	public int delect(Integer id) {
		return registerManage.delect(id);
	}

	@Override
	public List<Register> getLiShi(Register rs, Integer pageSize, Integer currentpage) {
		return registerManage.getLiShi(rs, pageSize, currentpage);
	}
	
	
	
	
}