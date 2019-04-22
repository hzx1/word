package com.wed.doctorworkstation;



import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONArray;
import com.ov.BaseController;
import com.ov.PagingVo;
import com.po.Department;
import com.po.Disease;
import com.po.Employee;
import com.po.Medicalrecordtemplate;
import com.service.dispensingmanage.DiseaseService;
import com.service.doctorworkstation.DeparTmentService;
import com.service.doctorworkstation.MediCalrecordTemplateService;
import com.service.system.UserService;


@Controller			
@RequestMapping("/medicalrecordtemplateController")
public class MediCalrecordTemplateController extends BaseController{
	@Autowired
	private MediCalrecordTemplateService mCTS;
	@Autowired
	private DeparTmentService dts;
	@Autowired
	private UserService us;
	@Autowired
	private DiseaseService ds;
	@RequestMapping(value="/list")
	public String list(HttpServletRequest request){
		request.setAttribute("departments", dts.listDTM());
		request.setAttribute("doctors", us.doctor(1));
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_list";
	}
	@RequestMapping(value="/datalist")
	public String datalist(HttpServletRequest request,Medicalrecordtemplate m,Integer pagesize,Integer currentpage){
		setPaging(pagesize,mCTS.countMCT(),currentpage);
	
		request.setAttribute("medicalrecordtemplates", mCTS.listMCT(m,pagingVo.getCurrentpage(),pagesize));
		request.setAttribute("sumrow", mCTS.countMCT());
		return "/doctorworkstation/medicalrecord/table/medicalrecordtemplatetable";
	}
	
	/**
	 * 添加跳转
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/toadd")
	public String toadd(HttpServletRequest request){
		request.setAttribute("doctors", us.doctor(1));
		request.setAttribute("diseases", ds.listDisease());
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_add";
	}
	/**
	 * 科室名字
	 * @param request
	 * @param did
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findbydid", produces="application/json;charset=utf-8")
	public String findbydid(HttpServletRequest request,String did){
		return JSONArray.toJSONString( dts.getDTM(Integer.parseInt(did)).getDeparTmentName());
	}
	/**
	 * 添加
	 * @param m
	 * @return
	 */
	@RequestMapping(value="add" ,method= RequestMethod.POST)
	public String add(Medicalrecordtemplate m,HttpServletRequest request){
		String BLMB = "BLMB" + new Random().nextInt(99999999);
		Medicalrecordtemplate vo = mCTS.getMCT(BLMB);
		do {
			BLMB = "BLMB" + new Random().nextInt(99999999);
			vo = mCTS.getMCT(BLMB);
		}while(vo != null);
		m.setTemplateCode(BLMB);	
		m.setIsvalId(1);
		Integer i=mCTS.addMCT(m);
		if(i>0){
			return list(request);
		}
		return toadd(request);
	}
	/**
	 * 修改跳转页面
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value="toedit" ,method= RequestMethod.GET)
	public String toedit(HttpServletRequest request,Integer id){
		Medicalrecordtemplate m= mCTS.getIdMCT(id);	
		request.setAttribute("departmentName",dts.getEDTM(m.getDoctorId()).getDeparTmentName());
		request.setAttribute("doctors", us.doctor(1));
		request.setAttribute("diseases", ds.listDisease());
		request.setAttribute("medicalrecordtemples",m );
		return "/doctorworkstation/medicalrecord/medicalrecordtemplate_edit";
	}
	/**
	 * 修改页面
	 * @param m
	 * @param request
	 * @return
	 */
	@RequestMapping(value="edit" ,method= RequestMethod.POST)
	public String edit(Medicalrecordtemplate m,HttpServletRequest request){
		Integer i=mCTS.updatMCT(m);
		System.out.println(i);
		if(i>0){
			
			return list(request);
		}
		return toedit(request,m.getId());
	}
	
	@ResponseBody
	@RequestMapping(value="/delete", produces="application/json;charset=utf-8")
	public String delete(HttpServletRequest request,Integer id){
		String msg="删除失败！";
		Integer i=mCTS.delMCT(id);
		if(i>0){
			msg="删除成功！";
		}
		return JSONArray.toJSONString(msg);
	}
}
