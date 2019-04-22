package com.wed.pass;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.po.Employee;
import com.service.registermanage.RegisterManageService;
import com.service.system.UserService;

@Controller
@RequestMapping("/passController")
public class PassController {
	@Resource
	private RegisterManageService registerManageService;
	@Autowired
	private UserService userService;
	/**
	 * 分页界面
	 * 
	 * @return
	 */
	@RequestMapping("/getpaging")
	public String getPaging() {
		return "/common/paging";
	}

	/**
	 * 根据科室查询医生
	 */
	@ResponseBody
	@RequestMapping(value = "getdoctorbydptid", produces = "application/json;charset=utf-8")
	public Object getdoctorbydptid(String id) {
		return registerManageService.getDoctorsTwo(Integer.parseInt(id));
	}
	
	/**
	 * 根据科室id查询医生
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getdoctorbydptid",produces="application/json")
	public Object dataselect(int id){
		List<Employee> list =new ArrayList<Employee>();
		if(id>0){
			list=userService.listidUM(id);
		}else{
			list=userService.doctor(1);
		}
		
		return list;
	}
}
