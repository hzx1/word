package com.dao.registermanage;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Attributedetail;
import com.po.Department;
import com.po.Employee;
import com.po.Patient;
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
	public List<Employee> getDoctorsTwo(@Param("id")Integer id);
	public List<Registertype> getTypeName();
	public  Register findLast();
	public Register countinfo();
	public List<Register> pageFind(@Param("currentpage")Integer currentpage,@Param("pageSize")Integer pageSize);
	public int addPatient(Patient pt);
	public List<Patient> getPatientByCode(@Param("code")String code);
	public int add(Register rs);
	public int delect(@Param("id")Integer id);
	public List<Register> getLiShi(@Param("rs")Register rs,@Param("pageSize")Integer pageSize,@Param("currentpage")Integer currentpage);
}
