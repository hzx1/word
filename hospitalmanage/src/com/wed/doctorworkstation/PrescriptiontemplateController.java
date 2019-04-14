package com.wed.doctorworkstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ov.BaseController;
import com.po.Prescriptiontemplate;
import com.service.daseinfo.AttriButeDetailService;
import com.service.doctorworkstation.DeparTmentService;
import com.service.doctorworkstation.PrescriptiontemplateServce;
import com.service.system.UserService;

@Controller			
@RequestMapping("/prescriptiontemplateController")
public class PrescriptiontemplateController extends BaseController{
		@Autowired
		private PrescriptiontemplateServce pm;
		@Autowired
		private DeparTmentService dts;
		@Autowired
		private UserService us;
		@Autowired
		private AttriButeDetailService as;
		//跳转处方模块
		@RequestMapping(value="list")
		public String list(){
			request().setAttribute("prescriptiontypes", as.listABDM(15));
			request().setAttribute("departments", dts.listDTM());
			request().setAttribute("doctors", us.selectEmployee(null));
			return "/doctorworkstation/prescription/prescriptiontemplate_list";
		}
		@RequestMapping(value="datalist")
		public String datalist(Prescriptiontemplate p,Integer pagesize, Integer currentpage){
			setPaging(pagesize, pm.countPM(), currentpage);
			for (Prescriptiontemplate pms : pm.listPM(p, pagingVo.getCurrentpage(), pagesize)) {
				System.out.println(pms.getId());
			}
			request().setAttribute("templates", pm.listPM(p, pagingVo.getCurrentpage(), pagesize));
			return "doctorworkstation/prescription/table/prescriptiontemplatetable";
		}
		
}
