package com.dao.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Medicalrecord;

public interface MedicalrecordMapper {
	//查看全部
	public List<Medicalrecord> listMM(@Param("m")Medicalrecord m,@Param("currentpage")Integer currentpage,@Param("pagesize")Integer pagesize);
	//查看有多少条数据
	public Integer countMM();
	//添加
	public Integer addmm(Medicalrecord m);
	//病例编号
	public Medicalrecord getMM(@Param("medicalrecordcode")String medicalrecordcode);
	//id查询
	public Medicalrecord getIdMM(@Param("id")Integer id);
	//x修改
	public Integer updateMM(Medicalrecord m);
}
