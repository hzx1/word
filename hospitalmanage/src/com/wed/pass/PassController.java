package com.wed.pass;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.service.registermanage.RegisterManageService;

@Controller
@RequestMapping("/passController")
public class PassController {
	@Resource
	private RegisterManageService registerManageService;
	/**
	 * 分页界面
	 * 
	 * @return
	 */
	@RequestMapping("/getpaging")
	public String getPaging() {
		return "/common/paging";
	}

	/**
	 * 根据科室查询医生
	 */
	@ResponseBody
	@RequestMapping(value = "getdoctorbydptid", produces = "application/json;charset=utf-8")
	public Object getdoctorbydptid(String id) {
		return registerManageService.getDoctorsTwo(Integer.parseInt(id));
	}

}
