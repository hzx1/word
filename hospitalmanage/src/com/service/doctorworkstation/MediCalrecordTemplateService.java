package com.service.doctorworkstation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ov.PagingVo;
import com.po.Medicalrecordtemplate;

public interface MediCalrecordTemplateService {
	//查看病历模板全部
	public List<Medicalrecordtemplate> listMCT(Medicalrecordtemplate m,Integer currentpage,Integer pagesize);
	//查询总数
	public Integer countMCT();
	//添加
	public Integer addMCT(Medicalrecordtemplate m);

	//根据编号查询
	public Medicalrecordtemplate getMCT(String templatecode);
	//根据id查询
	public Medicalrecordtemplate getIdMCT(Integer id);
	//修改
	public Integer updatMCT(Medicalrecordtemplate m);
	//删除
	public Integer delMCT(Integer id);
	//模糊查询
	public List<Medicalrecordtemplate> listnameMCT(String contant); 
	//名字查询
	public Medicalrecordtemplate getNameMCT(String templatename);
}
