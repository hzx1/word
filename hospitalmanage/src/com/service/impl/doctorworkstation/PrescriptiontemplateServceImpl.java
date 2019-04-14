package com.service.impl.doctorworkstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.doctorworkstation.PrescriptiontemplateMapper;
import com.po.Prescriptiontemplate;
import com.service.doctorworkstation.PrescriptiontemplateServce;

@Transactional
@Service("PrescriptiontemplateServce")
public class PrescriptiontemplateServceImpl implements PrescriptiontemplateServce{
	@Autowired
	private PrescriptiontemplateMapper pm;

	@Override
	public List<Prescriptiontemplate> listPM(Prescriptiontemplate p, Integer currentpage, Integer pagesize) {
		// TODO Auto-generated method stub
		return pm.listPM(p, (currentpage-1)*pagesize, pagesize);
	}

	@Override
	public Integer countPM() {
		// TODO Auto-generated method stub
		return pm.countPM();
	}
}
