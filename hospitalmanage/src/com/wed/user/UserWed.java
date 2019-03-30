package com.wed.user;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.po.Employee;
import com.po.Role;
import com.service.system.RoleService;
import com.service.system.UserService;


@Controller
@RequestMapping("/indexController")
public class UserWed {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	//初始页面
	@RequestMapping(value="toinitial")
	public String toinitial(HttpServletRequest request){
		System.out.println("dddddd");
		return "/user/initial";
	}
	/**
	 * 验证用户名是否存在
	 * @param username
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/verify", produces="application/json")
	public Object verify(String employeecode){
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
	 * 登录密码
	 * @param bo
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/login", produces="application/json;charset=utf-8")
	public Object login( Employee bo,HttpServletRequest request){	
	
		String msg = "";
		Employee  em = userService.selectEmployee(bo);
		if(em != null){
		 //把权限存到session里面 positionid
			Role r= roleService.rolePositionid(em.getId());
			//保存用户的权限
			request.getSession().setAttribute("role", r);
			//保持用户的信息
			request.getSession().setAttribute("employye", em);
			
			msg = "1";
		}else{
			msg = "密码错误，请重新输入！";
		}
		return JSONArray.toJSONString(msg);
	}
	//登录跳转的页面
	@RequestMapping("/toindex")
	public String tologin(HttpServletRequest request){
		Object obj=request.getSession().getAttribute("employye");
		//判断是否登录
		if(obj != null){
			System.out.println("ddd");
			return "/user/index";
		}
		//清除session
		System.out.println("gggg");
		request.getSession().invalidate();
		return "/user/login";
	}
	
	
	//退出
	@RequestMapping(value="loginout")
	public String loginout(HttpServletRequest request){
		//清除session
		request.getSession().invalidate();
		return "/user/login";
	}
	
}
