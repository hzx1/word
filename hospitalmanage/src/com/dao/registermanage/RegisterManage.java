package com.dao.registermanage;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Attributedetail;
import com.po.Department;
import com.po.Employee;
import com.po.Patienttype;
import com.po.Register;
import com.po.Registertype;
import com.po.Viptype;

public interface RegisterManage {
	public List<Attributedetail> getByName(@Param("name")String name);
	public List<Viptype> getVipList();
	public List<Patienttype> getTypeList();
	public List<Department> getDepartmentList();
	public List<Employee> getDoctors();
	public List<Registertype> getTypeName();
	public List<Register> findLast();
	public Register countinfo();
}