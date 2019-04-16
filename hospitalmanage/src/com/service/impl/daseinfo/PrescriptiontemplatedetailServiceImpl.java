package com.service.impl.daseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.daseinfo.PrescriptiontemplatedetailMapper;
import com.po.Prescriptiontemplatedetail;
import com.service.daseinfo.PrescriptiontemplatedetailService;

@Transactional
@Service(value="PrescriptiontemplatedetailService")
public class PrescriptiontemplatedetailServiceImpl implements PrescriptiontemplatedetailService {
	@Autowired
	private PrescriptiontemplatedetailMapper ptm;
	@Override
	public List<Prescriptiontemplatedetail> listPTM(Integer id) {
		// TODO Auto-generated method stub
		return ptm.listPTM(id);
	}
	@Override
	public Integer addPTM(Prescriptiontemplatedetail pd) {
		// TODO Auto-generated method stub
		return ptm.addPTM(pd);
	}
	@Override
	public Integer duPTM(Integer id) {
		// TODO Auto-generated method stub
		return ptm.duPTM(id);
	}

}
