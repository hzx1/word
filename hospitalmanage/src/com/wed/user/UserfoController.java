package com.wed.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.po.Employee;
import com.po.Role;
import com.service.system.RoleService;
import com.service.system.UserService;

@Controller
@RequestMapping("userinfoController")
public class UserfoController {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	//个人信息跳转
	@RequestMapping(value="/finduser")
	public String finduser(HttpServletRequest request){
		return "/user/userinfo";
	}
	//修改密码跳转jsp页面
	@RequestMapping("/toeditpsw")
	public String finduser(){
		
		return "/user/editpsw";
	}
	//判断用户原密码是否正确
	@ResponseBody
	@RequestMapping(value="/editpswnext", produces="application/json;charset=utf-8")
	public Object editpswnext( Employee bo,HttpServletRequest request){	
		System.out.println(bo.getPsw());
		String msg="true";
		Employee e=(Employee) request.getSession().getAttribute("employye");
		if(bo.getPsw().equals(e.getPsw())){
			return JSONArray.toJSONString(msg);
		}
		msg="原密码错误! 请你从新输入";
		return JSONArray.toJSONString(msg);
	}
	//修改密码
	
	@ResponseBody
	@RequestMapping(value="/editpsw", produces="application/json;charset=utf-8")
	public Object editpsw( String psw,HttpServletRequest request){	
		System.out.println(psw);
		String msg="修改成功";
		Employee e=(Employee) request.getSession().getAttribute("employye");
		int i= userService.updatepwe(psw,e.getId());
		if(i>0){
			return JSONArray.toJSONString(msg);
		}
		msg="修改失败";
		return JSONArray.toJSONString(msg);
	}
}
