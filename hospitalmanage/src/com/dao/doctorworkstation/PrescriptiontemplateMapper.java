package com.dao.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.po.Prescriptiontemplate;

public interface PrescriptiontemplateMapper {
	//查看处方模板全部
	public List<Prescriptiontemplate> listPM(@Param("p") Prescriptiontemplate p,@Param("currentpage")Integer currentpage,@Param("pagesize")Integer pagesize);
	//查询总数
	public Integer countPM();
}
