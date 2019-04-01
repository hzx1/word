package com.wed.registermanage;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Employee;
import com.service.resource.ResourceService;

@Controller
@RequestMapping("/registerController")
public class RegisterController {
	
	/**
	 * 查询页面
	 * @param request
	 * @return
	 */
	@RequestMapping("/registerlist")
	public String registerList(HttpServletRequest request){
		Employee employee = (Employee) request.getSession().getAttribute("employye");
		request.getSession().setAttribute("persons", employee);
		return "/registermanage/registerhistory_list";
	}
	/**
	 * 查询历史
	 * @return
	 */
	@RequestMapping("tohistory")
	public String add(){
		return "/registermanage/register";
	}
	
}
