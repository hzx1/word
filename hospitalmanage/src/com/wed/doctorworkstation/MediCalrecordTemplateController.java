package com.wed.doctorworkstation;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller			
@RequestMapping("/medicalrecordtemplateController")
public class MediCalrecordTemplateController {
	@RequestMapping(value="/list")
	public String list(){
		System.out.println("dd");
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_list";
	}
}
