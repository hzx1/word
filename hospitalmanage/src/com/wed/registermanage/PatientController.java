package com.wed.registermanage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("patientController")
public class PatientController {
	@RequestMapping("add")
	public String add(){
		return "/registermanage/register";
	}
}