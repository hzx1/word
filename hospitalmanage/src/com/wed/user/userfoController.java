package com.wed.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userinfoController")
public class userfoController {
	//个人信息跳转
	@RequestMapping(value="/finduser")
	public String finduser(HttpServletRequest request){
		System.out.println("fff");
		return "/user/userinfo";
	}
	//修改密码跳转到jsp页面
	@RequestMapping("/toeditpsw")
	public String finduser(){
		
		return "/user/editpsw.jsp";
	}
	//判断用户原密码是否正确
	
}
