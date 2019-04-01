package com.wed.registermanage;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.resource.ResourceService;

@Controller
@RequestMapping("/registerController")
public class RegisterController {
	
	
	@RequestMapping("/registerlist")
	public String registerList(){
		
		return "/registermanage/registerhistory_list";
	}
}
