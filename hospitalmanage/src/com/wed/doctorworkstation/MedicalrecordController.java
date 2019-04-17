package com.wed.doctorworkstation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.ov.BaseController;
import com.po.Medicalrecord;
import com.service.dispensingmanage.DiseaseService;
import com.service.doctorworkstation.DeparTmentService;
import com.service.doctorworkstation.MedicalrecordService;
import com.service.system.UserService;

@Controller				
@RequestMapping(value="/medicalrecordController")
public class MedicalrecordController extends BaseController {
	@Autowired
	private MedicalrecordService ms;
	@Autowired
	private DeparTmentService dts;
	@Autowired
	private UserService us;
	@Autowired
	private DiseaseService ds;
	@RequestMapping(value="list")
	public String list(){	
		request().setAttribute("departments", dts.listDTM());
		request().setAttribute("doctors", us.selectEmployee(null));
		return "/doctorworkstation/medicalrecord/medicalrecord_list";
	}
	@RequestMapping(value="datalist")
	public String datalist(Medicalrecord m,Integer pagesize,Integer currentpage){
		System.out.println("55");
		setPaging(pagesize,ms.countMM(),currentpage);
		request().setAttribute("sumrow", ms.countMM());
		request().setAttribute("medicalrecords", ms.listMM(m,pagingVo.getCurrentpage(),pagesize));
		return "/doctorworkstation/medicalrecord/table/medicalrecordtable";
	}
	@RequestMapping(value="toadd")
	public String toadd(){
		System.out.println("553");		
		request().setAttribute("diseases", ds.listDisease());
		request().setAttribute("doctors", us.selectEmployee(null));
		return "/doctorworkstation/medicalrecord/medicalrecord_add";
	}
	/**
	 * 科室名字
	 * @param request
	 * @param did
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findbydid", produces="application/json;charset=utf-8")
	public String findbydid(HttpServletRequest request,String did){
		return JSONArray.toJSONString( dts.getDTM(Integer.parseInt(did)).getDeparTmentName());
	}
	
	/*
	 * 
	SELECT r.* ,p.`patientname` AS patientName,p.`cardcode` AS cardCode,p.`sex` AS sex,p.`age` AS age ,p.`tel` AS tel ,
	p.`insuretypeid`,p.`drugallergyhistory` AS drugallergyhistory
	 FROM`register` r 
	 LEFT JOIN patient p ON p.id=r.`patientid`
	 LEFT JOIN  `attributedetail` a ON a.id=p.`insuretypeid`*/
}
