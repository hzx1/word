package com.wed.doctorworkstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.doctorworkstation.MediCalrecordTemplateService;

@Controller
@RequestMapping("/medicalrecordtemplateController")
public class MediCalrecordTemplateController {
	//
	@Autowired
	private MediCalrecordTemplateService mCTS;
	@RequestMapping(value="/list")
	public String list(){
		System.out.println("ddddddddddddddddddfffffffffffffffff");
		mCTS.listMCT();
		
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_list";
	}
	
}
