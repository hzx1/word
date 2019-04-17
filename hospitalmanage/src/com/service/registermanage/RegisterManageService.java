package com.service.registermanage;

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

public interface RegisterManageService {
	public List<Attributedetail> getByName(String name);
	/**
	 * 会员列表
	 * @return
	 */
	public List<Viptype> getVipList();
	/**
	 * 病人类型
	 * @return
	 */
	public List<Patienttype> getTypeList();
	/**
	 * 科室列表
	 * @return
	 */
	public List<Department> getDepartmentList();
	/**
	 * 医生列表
	 * @return
	 */
	public List<Employee> getDoctors();
	/**
	 * 挂号费
	 * @return
	 */
	public List<Registertype> getTypeName();
	/**
	 * 上一位挂号人信息
	 * @return
	 */
	public Register findLast();
	/**
	 * 计算价格
	 * @return
	 */
	public Register countinfo();
	/**
	 * 分页查询病人信息
	 * @param currentpage
	 * @param pageSize
	 * @return
	 */
	public List<Register> pageFind(Integer currentpage,Integer pageSize);
	/**
	 * 新增病人
	 * @param pt
	 * @return
	 */
	public int addPatient(Patient pt);
	/**
	 * 病人卡号模糊查询
	 * @param code
	 * @return
	 */
	public List<Patient> getPatientByCode(String code);
	/**
	 * 挂号
	 * @param rs
	 * @return
	 */
	public int add(Register rs);
	
	/**
	 * 根据科室查询医生
	 * @param id
	 * @return
	 */
	public List<Employee> getDoctorsTwo(Integer id);
	/**
	 * 删除病人
	 * @param id
	 * @return
	 */
	public int delect(Integer id);
	/**
	 * 查询历史
	 * @param rs
	 * @param pageSize
	 * @param currentpage
	 * @return
	 */
	public List<Register> getLiShi(Register rs,Integer pageSize,Integer currentpage);
	
}