package com.dao.doctorworkstation;

import java.util.List;

import com.po.Medicalrecordtemplate;

public interface MediCalrecordTemplateMapping {
	//查看病历模板全部
	public List<Medicalrecordtemplate> listMCT();
}