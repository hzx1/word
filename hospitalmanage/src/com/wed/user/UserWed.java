package com.wed.user;

import java.util.List;

import javax.mail.Flags.Flag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.po.Employee;
import com.service.system.UserService;


@Controller
@RequestMapping("/indexController")
public class UserWed {
	@Autowired
	private UserService userService;



	/**
	 * 验证用户名是否存在
	 * @param username
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/verify", produces="application/json")
	public Object verify(String employeecode){
		System.out.println("ffff");
		Employee e=new Employee();
		e.setEmployeecode(employeecode);
		String valid="true";
		Employee  em = userService.selectEmployee(e);
		if(em != null){
			return JSONArray.toJSONString(valid);
		}
		valid="false";
		return JSONArray.toJSONString(valid);
	}
	
	/**
	 * 登录
	 * @param bo
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/login", produces="application/json")
	public Object login(Employee bo){	
		System.out.println("ddd");
		String msg = "";
		Employee  em = userService.selectEmployee(bo);
		if(em != null){
			msg = "1";
		}else{
			msg = "密码错误，请重新输入！";
		}
		return JSONArray.toJSONString(msg);
	}
	
}
