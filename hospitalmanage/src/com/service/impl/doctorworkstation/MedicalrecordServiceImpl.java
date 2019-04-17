package com.service.impl.doctorworkstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.doctorworkstation.MedicalrecordMapper;
import com.po.Medicalrecord;
import com.service.doctorworkstation.MedicalrecordService;

@Transactional
@Service(value="MedicalrecordService")
public class MedicalrecordServiceImpl implements MedicalrecordService{
	@Autowired
	private MedicalrecordMapper mm;

	@Override
	public List<Medicalrecord> listMM(Medicalrecord m,Integer currentpage,Integer pagesize) {
		// TODO Auto-generated method stub
		return mm.listMM(m, (currentpage-1)*pagesize, pagesize);
	}

	@Override
	public Integer countMM() {
		// TODO Auto-generated method stub
		return mm.countMM();
	}

	@Override
	public Integer addmm(Medicalrecord m) {
		// TODO Auto-generated method stub
		return mm.addmm(m);
	}

	@Override
	public Medicalrecord getMM(String medicalrecordcode) {
		// TODO Auto-generated method stub
		return mm.getMM(medicalrecordcode);
	}

	@Override
	public Medicalrecord getIdMM(Integer id) {
		// TODO Auto-generated method stub
		return mm.getIdMM(id);
	}

	@Override
	public Integer updateMM(Medicalrecord m) {
		// TODO Auto-generated method stub
		return mm.updateMM(m);
	}
}
