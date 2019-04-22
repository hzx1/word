package com.wed.chargemanage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ov.BaseController;

@Controller
@RequestMapping("/chargeController")
public class ChargeController extends BaseController{

	@RequestMapping("/list")
	public String list(){
		return "chargemanage/charge";
	}
	
	@RequestMapping("tohistory")
	public String tohistory(){
		return "chargemanage/chargehistory_list";
	}
}
