package com.service.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Medicalrecord;

public interface MedicalrecordService {
	//查看全部
	public List<Medicalrecord> listMM(Medicalrecord m,Integer currentpage,Integer pagesize);
	//查看有多少条数据
	public Integer countMM();
	//添加
	public Integer addmm(Medicalrecord m);
	//病例编号
	public Medicalrecord getMM(String medicalrecordcode);
	//id查询
	public Medicalrecord getIdMM(Integer id);
	//x修改
		public Integer updateMM(Medicalrecord m);
}
