package com.service.impl.daseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.daseinfo.AttriButeDetailMapper;
import com.po.Attributedetail;
import com.service.daseinfo.AttriButeDetailService;
@Transactional
@Service(value="AttriButeDetailService")
public class AttriButeDetailServiceImpl implements AttriButeDetailService{
	@Autowired
	private AttriButeDetailMapper am;
	@Override
	public List<Attributedetail> listABDM(Integer attributeid) {
		// TODO Auto-generated method stub
		return am.listABDM(attributeid);
	}

}
