package com.wed.doctorworkstation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.ov.BaseController;
import com.po.Prescriptiontemplate;
import com.po.Prescriptiontemplatedetail;
import com.service.daseinfo.AttriButeDetailService;
import com.service.daseinfo.PrescriptiontemplatedetailService;
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
		@Autowired
		private PrescriptiontemplatedetailService ptm;
		//跳转处方模块
		@RequestMapping(value="list")
		public String list(){
			request().setAttribute("prescriptiontypes", as.listABDM(15));
			request().setAttribute("departments", dts.listDTM());
			request().setAttribute("doctors", us.selectEmployee(null));
			return "/doctorworkstation/prescription/prescriptiontemplate_list";
		}
		//分页
		@RequestMapping(value="datalist")
		public String datalist(Prescriptiontemplate p,Integer pagesize, Integer currentpage){
			setPaging(pagesize, pm.countPM(), currentpage);
			request().setAttribute("templates", pm.listPM(p, pagingVo.getCurrentpage(), pagesize));
			return "doctorworkstation/prescription/table/prescriptiontemplatetable";
		}
		//处方详情
		@RequestMapping(value="detailtablelist")
		public String detailtablelist(Integer id){
			request().setAttribute("details", ptm.listPTM(id));
			return "doctorworkstation/prescription/table/prescriptiontemplatedetailtable";
			
		}
		//添加页面跳转
		@RequestMapping(value="toadd")
		public String toadd(){
			request().setAttribute("doctors", us.selectEmployee(null));
			request().setAttribute("naturenames", as.listABDM(14));
			request().setAttribute("prescriptiontypes", as.listABDM(15));
			request().setAttribute("classifynames", as.listABDM(16));
			request().setAttribute("medicineforms", as.listABDM(24));
			request().setAttribute("medicinefrequencys", as.listABDM(25));			
			return "doctorworkstation/prescription/prescriptiontemplate_add";
			
		}
		/**
		 * 科室名字
		 * @param request
		 * @param did
		 * @return
		 */
		@ResponseBody
		@RequestMapping(value="/findbydid", produces="application/json;charset=utf-8")
		public String findbydid(String did){
			return JSONArray.toJSONString( dts.getDTM(Integer.parseInt(did)).getDeparTmentName());
		}
		/**
		 * 添加
		 * @param p
		 * @return
		 */
		@RequestMapping(value="add")
		public String add(Prescriptiontemplate p ){
			p.setIsvalId(1);
			int i= pm.addPM(p);
			int d=pm.order();//id
			if(i>0){
				for (Prescriptiontemplatedetail pd : p.getDetail()) {				
					pd.setPrescriptiontemplateId(d);
					pd.setIsvalId(1);
					ptm.addPTM(pd);
					
				}
			}
			
			
			return list();
		}
		/**
		 * 修改跳转页面
		 * @param id
		 * @return
		 */
		@RequestMapping(value="toedit" ,method= RequestMethod.GET)
		public String toedit(Integer id){
			
			request().setAttribute("doctors", us.selectEmployee(null));
			request().setAttribute("naturenames", as.listABDM(14));
			request().setAttribute("prescriptiontypes", as.listABDM(15));
			request().setAttribute("classifynames", as.listABDM(16));
			request().setAttribute("medicineforms", as.listABDM(24));
			request().setAttribute("medicinefrequencys", as.listABDM(25));	
			Prescriptiontemplate pr=pm.getPM(id);
			
			System.out.println(pr.getDepartmentName());
			request().setAttribute("prescription",pr);
			request().setAttribute("details", ptm.listPTM(pr.getId()));
			
			return "/doctorworkstation/prescription/prescriptiontemplate_edit";
		}
		/**
		 * 修改
		 * @param p
		 * @return
		 */
		@RequestMapping("/edit")
		public String edit(Prescriptiontemplate p){		
			int i = pm.updatPM(p);
			ptm.duPTM(p.getId());
			System.out.println(i);
			for (Prescriptiontemplatedetail pr : p.getDetail()) {
				if(pr.getDrugId() !=null  && pr.getDrugId() >0){
					pr.setPrescriptiontemplateId(p.getId());
					pr.setIsvalId(1);
					ptm.addPTM(pr);
				}
			}
			request().setAttribute("resulttext", "edit");
			return list();
		}
		
		@ResponseBody
		@RequestMapping(value="/delete" , produces="application/json;charset=utf-8")
		public String delete(Integer id){	
			Prescriptiontemplate p=new Prescriptiontemplate();
			p.setId(id);
			p.setIsvalId(2);
			int i= pm.updatPM(p);
			ptm.duPTM(p.getId());
			String msg="删除失败！";
			if(i>0){
				msg="删除成功！";
			}
			
			
			return JSONArray.toJSONString(msg);
		}
}
