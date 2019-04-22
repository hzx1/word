package com.wed.registermanage;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ov.BaseController;
import com.ov.DateUtil;
import com.po.Employee;
import com.po.Register;
import com.service.personnelmanage.EmployeeService;
import com.service.registermanage.RegisterManageService;

@Controller
@RequestMapping("/registerController")
public class RegisterController extends BaseController{
	
	@Resource
	private EmployeeService employeeService;
	
	@Resource
	private RegisterManageService registerManageService;
	
	/**
	 * 跳转历史挂号页面
	 * @return
	 */
	@RequestMapping("tohistory")
	public String tohistory(HttpServletRequest request){
		request.getSession().setAttribute("persons",employeeService.getGuaHaoYuan());
		return "/registermanage/registerhistory_list";
	}
	
	@RequestMapping("/registerlist")
	public String registerList(Integer pagesize,Integer currentpage){
		int sumRow = registerManageService.pageFind(0, 99999999).size();
		setPaging(pagesize, sumRow, currentpage);
		request().getSession().setAttribute("registers", registerManageService.pageFind((currentpage-1)*pagesize, pagesize));
		return "/registermanage/table/registertable";
	}
	
	@RequestMapping("/add")
	public String add(Register rs){
		Employee employee =  (Employee) request().getSession().getAttribute("employye");
		rs.setRegisterCode("GHD" + new Random().nextInt(99999999));
		rs.setRegisterTime(DateUtil.timestamp());
		rs.setRegisterStatus(1);
		rs.setIsvalId(1);		
		rs.setRegisterPersonId(employee.getId());
		
		registerManageService.add(rs);
		request().setAttribute("resulttext", "addrgt");
		return "redirect:/patientController/list.do";
	}
	
	@ResponseBody
	@RequestMapping(value="delete",produces="application/json;charset=utf-8")
	public Object delete(String id){
		int num = registerManageService.delect(Integer.parseInt(id));
		String msg = num>0 ?"作废成功":"作废失败";
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping("historydatalist")
	public String historydatalist(Register rs,Integer pagesize, Integer currentpage){
		int num = registerManageService.getLiShi(rs, 99999999,0 ).size();
		setPaging(pagesize, num, currentpage);
		request().getSession().setAttribute("registers", registerManageService.getLiShi(rs, pagesize, (currentpage-1)*pagesize));
		return "registermanage/table/registerhistorytable";
	}
	
}