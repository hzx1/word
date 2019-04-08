package com.wed.doctorworkstation;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Department;
import com.po.Medicalrecordtemplate;
import com.service.doctorworkstation.DeparTmentService;
import com.service.doctorworkstation.MediCalrecordTemplateService;
import com.service.system.UserService;


@Controller			
@RequestMapping("/medicalrecordtemplateController")
public class MediCalrecordTemplateController {
	@Autowired
	private MediCalrecordTemplateService mCTS;
	@Autowired
	private DeparTmentService dts;
	@Autowired
	private UserService us;
	@RequestMapping(value="/list")
	public String list(HttpServletRequest request){
		request.setAttribute("departments", dts.listDTM());
		request.setAttribute("doctors", us.selectEmployee(null));
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_list";
	}
	@RequestMapping(value="/datalist")
	public String datalist(HttpServletRequest request){
		System.out.println("dd1");
		request.setAttribute("medicalrecordtemplates", mCTS.listMCT());
		request.setAttribute("sumrow", mCTS.countMCT());
		return "/doctorworkstation/medicalrecord/table/medicalrecordtemplatetable";
	}
}
