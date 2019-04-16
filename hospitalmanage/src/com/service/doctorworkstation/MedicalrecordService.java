package com.service.doctorworkstation;

import java.util.List;

import com.po.Medicalrecord;

public interface MedicalrecordService {
	//查看全部
	public List<Medicalrecord> listMM(Medicalrecord m,Integer currentpage,Integer pagesize);
	//查看有多少条数据
	public Integer countMM();
}
