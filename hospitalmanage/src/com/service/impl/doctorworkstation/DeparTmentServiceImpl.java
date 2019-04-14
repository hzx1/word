package com.service.impl.doctorworkstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.doctorworkstation.DeparTmentMapper;
import com.po.Department;
import com.service.doctorworkstation.DeparTmentService;
@Transactional
@Service("DeparTmentService")
public class DeparTmentServiceImpl implements DeparTmentService{
	@Autowired
	private DeparTmentMapper dtm;
	@Override
	public List<Department> listDTM() {
		// TODO Auto-generated method stub
		return dtm.listDTM();
	}
	@Override
	public Department getDTM(Integer id) {
		// TODO Auto-generated method stub
		return dtm.getDTM(id);
	}
	@Override
	public Department getEDTM(Integer id) {
		// TODO Auto-generated method stub
		return dtm.getEDTM(id);
	}

}
