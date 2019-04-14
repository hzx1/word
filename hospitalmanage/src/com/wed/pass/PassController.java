package com.wed.pass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/passController")
public class PassController {

	
	/**
	 * 分页界面
	 * @return
	 */
	@RequestMapping("/getpaging")
	public String getPaging (){
		return "/common/paging";
	}
	

}
