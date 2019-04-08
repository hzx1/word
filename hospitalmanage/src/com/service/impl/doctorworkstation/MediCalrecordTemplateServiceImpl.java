package com.service.impl.doctorworkstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.doctorworkstation.MediCalrecordTemplateMapping;
import com.po.Medicalrecordtemplate;
import com.service.doctorworkstation.MediCalrecordTemplateService;

@Transactional
@Service("MediCalrecordTemplateService")
public class MediCalrecordTemplateServiceImpl implements MediCalrecordTemplateService {
		@Autowired
		private MediCalrecordTemplateMapping mCTM;
		//查看病历模板全部
		@Override
		public List<Medicalrecordtemplate> listMCT() {
			// TODO Auto-generated method stub
			return mCTM.listMCT();
		}
		//查询总数
		@Override
		public Integer countMCT() {
			// TODO Auto-generated method stub
			return mCTM.countMCT();
		}
		
}
