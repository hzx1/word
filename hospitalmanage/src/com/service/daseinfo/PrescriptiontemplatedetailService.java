package com.service.daseinfo;

import java.util.List;

import com.po.Prescriptiontemplatedetail;

public interface PrescriptiontemplatedetailService {
	//根据处方模板id来查询
	public List<Prescriptiontemplatedetail> listPTM(Integer id);
	//添加
	public Integer addPTM(Prescriptiontemplatedetail pd);
	//删除
		public Integer duPTM(Integer id);
}
