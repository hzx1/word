package com.wed.doctorworkstation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ov.BaseController;
@Controller			
@RequestMapping("/prescriptionController")
public class prescriptionController extends BaseController{
	@RequestMapping(value="list")
	public String list(){
		return "/doctorworkstation/prescription/prescription_list";
	}
}
