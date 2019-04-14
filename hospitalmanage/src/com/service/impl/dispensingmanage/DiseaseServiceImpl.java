package com.service.impl.dispensingmanage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.dispensingmanage.DiseaseMapper;
import com.po.Disease;
import com.service.dispensingmanage.DiseaseService;

@Transactional
@Service("DiseaseService")
public class DiseaseServiceImpl implements DiseaseService{
	@Autowired
	private DiseaseMapper dm;

	@Override
	public List<Disease> listDisease() {
		// TODO Auto-generated method stub
		return dm.listDisease();
	}
	
}
