package com.service.impl.dispensingmanage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.dispensingmanage.DrugMapper;
import com.po.Drug;
import com.service.dispensingmanage.DrugService;
@Transactional
@Service(value="DrugService")
public class DrugServiceImpl implements DrugService{
	@Autowired
	private DrugMapper dm;
	@Override
	public List<Drug> listD(String contant) {
		// TODO Auto-generated method stub
		return dm.listD(contant);
	}
	
}
