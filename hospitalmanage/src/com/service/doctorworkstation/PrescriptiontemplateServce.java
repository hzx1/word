package com.service.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Prescriptiontemplate;

public interface PrescriptiontemplateServce {
	//查看处方模板全部
	public List<Prescriptiontemplate> listPM(@Param("p") Prescriptiontemplate p,@Param("currentpage")Integer currentpage,@Param("pagesize")Integer pagesize);
	//查询总数
	public Integer countPM();
	//添加
	public Integer addPM(Prescriptiontemplate p);
	//id查看
	public Prescriptiontemplate getPM(Integer id);
	//修改
	public Integer updatPM(Prescriptiontemplate p);
	//倒叙第一个
	public Integer order();
}
