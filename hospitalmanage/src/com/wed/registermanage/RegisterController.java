package com.wed.registermanage;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Employee;
import com.service.personnelmanage.EmployeeService;
import com.service.resource.ResourceService;

@Controller
@RequestMapping("/registerController")
public class RegisterController {
	
	@Resource
	private EmployeeService employeeService;
	
	/**
	 * 查询历史
	 * @return
	 */
	@RequestMapping("tohistory")
	public String add(HttpServletRequest request){
		request.getSession().setAttribute("persons",employeeService.getGuaHaoYuan());
		return "/registermanage/registerhistory_list";
	}
	
}