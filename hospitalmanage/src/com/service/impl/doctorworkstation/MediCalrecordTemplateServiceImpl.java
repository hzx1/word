package com.service.impl.doctorworkstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.doctorworkstation.MediCalrecordTemplateMapping;
import com.ov.PagingVo;
import com.po.Medicalrecordtemplate;
import com.service.doctorworkstation.MediCalrecordTemplateService;

@Transactional
@Service("MediCalrecordTemplateService")
public class MediCalrecordTemplateServiceImpl implements MediCalrecordTemplateService {
		@Autowired
		private MediCalrecordTemplateMapping mCTM;
		//查看病历模板全部
		@Override
		public List<Medicalrecordtemplate> listMCT(Medicalrecordtemplate m,Integer currentpage,Integer pagesize) {
			// TODO Auto-generated method stub
			return mCTM.listMCT(m, (currentpage-1)*pagesize, pagesize);
		}
		//查询总数
		@Override
		public Integer countMCT() {
			// TODO Auto-generated method stub
			return mCTM.countMCT();
		}
		@Override
		public Integer addMCT(Medicalrecordtemplate m) {
			// TODO Auto-generated method stub
			return mCTM.addMCT(m);
		}
		@Override
		public Medicalrecordtemplate getMCT(String templatecode) {
			// TODO Auto-generated method stub
			return mCTM.getMCT(templatecode);
		}
		//根据id查询
		@Override
		public Medicalrecordtemplate getIdMCT(Integer id) {
			// TODO Auto-generated method stub
			return mCTM.getIdMCT(id);
		}
		@Override
		public Integer updatMCT(Medicalrecordtemplate m) {
			// TODO Auto-generated method stub
			return mCTM.updatMCT(m);
		}
		@Override
		public Integer delMCT(Integer id) {
			// TODO Auto-generated method stub
			return mCTM.delMCT(id);
		}
		@Override
		public List<Medicalrecordtemplate> listnameMCT(String contant) {
			// TODO Auto-generated method stub
			return mCTM.listnameMCT(contant);
		}
		@Override
		public Medicalrecordtemplate getNameMCT(String templatename) {
			// TODO Auto-generated method stub
			return mCTM.getNameMCT(templatename);
		}
		
}
