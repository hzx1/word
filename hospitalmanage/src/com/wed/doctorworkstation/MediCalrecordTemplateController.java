package com.wed.doctorworkstation;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Medicalrecordtemplate;
import com.service.doctorworkstation.MediCalrecordTemplateService;


@Controller			
@RequestMapping("/medicalrecordtemplateController")
public class MediCalrecordTemplateController {
	@Autowired
	private MediCalrecordTemplateService mCTS;
	@RequestMapping(value="/list")
	public String list(HttpServletRequest request){
		System.out.println("dd");
		request.setAttribute("", mCTS.listMCT());
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_list";
	}
}
