package com.wed.dispensingmanage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.ov.BaseController;
import com.service.daseinfo.PrescriptiontemplatedetailService;
import com.service.dispensingmanage.DrugService;

@Controller			
@RequestMapping("/drugController")
public class DrugController extends BaseController{
	@Autowired
	private	 DrugService ds;
	@Autowired
	private PrescriptiontemplatedetailService ptm;
	@RequestMapping(value="/drugtablelist")
	public String drugtablelist(String contant){
		request().setAttribute("drugs", ds.listD(contant));
		return "/doctorworkstation/prescription/table/drugtable";
	}
	
	@RequestMapping(value="/druglist")
	public String druglist(String contant){
		request().setAttribute("drugs", ds.listD(contant));
		return "/doctorworkstation/prescription/table/drugtable";
	}
}
