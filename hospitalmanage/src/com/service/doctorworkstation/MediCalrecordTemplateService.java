package com.service.doctorworkstation;

import java.util.List;

import com.po.Medicalrecordtemplate;

public interface MediCalrecordTemplateService {
	//查看病历模板全部
	public List<Medicalrecordtemplate> listMCT();
	//查询总数
	public Integer countMCT();
}
