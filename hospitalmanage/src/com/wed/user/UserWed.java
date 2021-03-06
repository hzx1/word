package com.wed.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.configuration.MD5Util;
import com.ov.Menu;
import com.po.Employee;
import com.po.Resource;
import com.po.Role;
import com.service.resource.ResourceService;
import com.service.system.RoleService;
import com.service.system.UserService;


@Controller
@RequestMapping("/indexController")
public class UserWed {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@javax.annotation.Resource
	private ResourceService resourceService;
	
	//初始页面
	@RequestMapping(value="toinitial")
	public String toinitial(HttpServletRequest request){
		return "/user/initial";
	}
	/**
	 * 验证用户名是否存在
	 * @param username
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/verify", produces="application/json")
	public Object verify(String employeeCode){
		Employee e=new Employee();
		e.setEmployeeCode(employeeCode);
		String valid="true";
		List<Employee>  em = userService.selectEmployee(e);
		if(em != null && em.size()>0){
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
		String psw= MD5Util.GetMD5Code32(bo.getPsw());
		bo.setPsw(psw);
		List<Employee>  em = userService.selectEmployee(bo);
		if(em != null && em.size()>0){
			Employee ems=em.get(0);
		 //把权限存到session里面 positionid
			Role r= roleService.rolePositionid(ems.getId());
			//保存用户的权限
			request.getSession().setAttribute("role", r);
			//保持用户的信息
			request.getSession().setAttribute("employye", ems);
			
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
		Employee employee = (Employee) request.getSession().getAttribute("employye");
		List<Menu> list = resourceService.initLoginTwo(employee.getPositionId());
		request.getSession().setAttribute("pfuserinfo", list);
			return "/user/index";
		}
		//清除session
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
