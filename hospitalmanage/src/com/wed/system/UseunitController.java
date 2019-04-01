package com.wed.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("useunitController")
public class UseunitController {
	
	@RequestMapping("/list")
	public String list(){
		return "system/useunit/useunit";
	}
	
}
