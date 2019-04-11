package com.wed.registermanage;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.registermanage.RegisterManageService;

@Controller
@RequestMapping("patientController")
public class PatientController {
	
	@Resource
	private RegisterManageService registerManageService;
	
	@RequestMapping("/list")
	public String registerList(HttpServletRequest request){
		//婚姻状况
		request.getSession().setAttribute("politicsstatuss", registerManageService.getByName("婚姻状况"));
		//会员类型
		request.getSession().setAttribute("viptypes", registerManageService.getVipList());
		//参保类型
		request.getSession().setAttribute("insuretypes", registerManageService.getByName("医保类别"));
		//病人类别
		request.getSession().setAttribute("patienttypes", registerManageService.getTypeList());
		//选择科室
		request.getSession().setAttribute("departments", registerManageService.getDepartmentList());
		//选择医生
		request.getSession().setAttribute("doctors", registerManageService.getDoctors());
		//选择价钱
		request.getSession().setAttribute("registertypes", registerManageService.getTypeName());
		//患者信息
		request.getSession().setAttribute("register", registerManageService.findLast());
		//价钱总计
		request.getSession().setAttribute("countinfo", registerManageService.countinfo());
		
		return "/registermanage/register";
	}
}