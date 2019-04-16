package com.dao.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Medicalrecord;

public interface MedicalrecordMapper {
	//查看全部
	public List<Medicalrecord> listMM(@Param("m")Medicalrecord m,@Param("currentpage")Integer currentpage,@Param("pagesize")Integer pagesize);
	//查看有多少条数据
	public Integer countMM();
}
