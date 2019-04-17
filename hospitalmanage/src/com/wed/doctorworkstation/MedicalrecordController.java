package com.wed.doctorworkstation;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.ov.BaseController;
import com.po.Medicalrecord;
import com.po.Medicalrecordtemplate;
import com.po.Register;
import com.service.dispensingmanage.DiseaseService;
import com.service.doctorworkstation.DeparTmentService;
import com.service.doctorworkstation.MediCalrecordTemplateService;
import com.service.doctorworkstation.MedicalrecordService;
import com.service.registermanage.RegisterManageService;
import com.service.system.UserService;

@Controller				
@RequestMapping(value="/medicalrecordController")
public class MedicalrecordController extends BaseController {
	@Autowired
	private MedicalrecordService ms;
	@Autowired
	private DeparTmentService dts;
	@Autowired
	private UserService us;
	@Autowired
	private DiseaseService ds;
	@Autowired
	private RegisterManageService rs;
	@Autowired
	private MediCalrecordTemplateService mts;
	@RequestMapping(value="list")
	public String list(){	
		request().setAttribute("departments", dts.listDTM());
		request().setAttribute("doctors", us.selectEmployee(null));
		return "/doctorworkstation/medicalrecord/medicalrecord_list";
	}
	/**
	 * 分页
	 * @param m
	 * @param pagesize
	 * @param currentpage
	 * @return
	 */
	@RequestMapping(value="datalist")
	public String datalist(Medicalrecord m,Integer pagesize,Integer currentpage){
		System.out.println("55");
		setPaging(pagesize,ms.countMM(),currentpage);
		request().setAttribute("sumrow", ms.countMM());
		request().setAttribute("medicalrecords", ms.listMM(m,pagingVo.getCurrentpage(),pagesize));
		return "/doctorworkstation/medicalrecord/table/medicalrecordtable";
	}
	/**
	 * 添加跳转
	 * @return
	 */
	@RequestMapping(value="toadd")
	public String toadd(){
		request().setAttribute("diseases", ds.listDisease());
		request().setAttribute("doctors", us.selectEmployee(null));
		return "/doctorworkstation/medicalrecord/medicalrecord_add";
	}
	/**
	 * 挂号单号
	 * @param contant
	 * @return
	 */
	@RequestMapping(value="/registertablelist")
	public String registertablelist(String contant){
		request().setAttribute("registers", rs.listr(contant));
		return "/doctorworkstation/medicalrecord/table/registertable";
	}
	/**
	 * 病历模板
	 * @param contant
	 * @return
	 */
	@RequestMapping(value="/templatetablelist")
	public String templatetablelist(String contant){
		Medicalrecordtemplate m=new Medicalrecordtemplate();
		request().setAttribute("templates",mts.listnameMCT(contant));
		return "/doctorworkstation/medicalrecord/table/templatetable";
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
	@RequestMapping(value="/add")
	public String add( Medicalrecord m,Medicalrecordtemplate mt){
		
		Integer ii=0;
		Medicalrecordtemplate	mte=mts.getNameMCT(m.getMedicalrecordName());	
		if(mte == null ){
			String BLMB = "BLMB" + new Random().nextInt(99999999);
			Medicalrecordtemplate vo = mts.getMCT(BLMB);
			do {
				BLMB = "BLMB" + new Random().nextInt(99999999);
				vo = mts.getMCT(BLMB);
			}while(vo != null);
			mt.setTemplateName(m.getMedicalrecordName());
			System.out.println(mt.getTemplateName()+"rrr"+m.getMedicalrecordName());
			mt.setTemplateCode(BLMB);	
			mt.setIsvalId(1);
			 ii=mts.addMCT(mt);
		}
		/*else{
			mt.setTemplateName(m.getMedicalrecordName());
			mt.setPatientappeal(m.getPatienTappeal());
			mts.updatMCT(mt);
		}
		*/
		String BL = "BL" + new Random().nextInt(99999999);
		Medicalrecord mm = ms.getMM(BL);
		do {
			BL = "BL" + new Random().nextInt(99999999);
			mm = ms.getMM(BL);
		}while(mm != null);
		m.setMedicalrecordCode(BL);	
		m.setIsvalId(1);
		Date d=new Date();
		Timestamp t=new Timestamp(d.getTime());
		m.setRecordTime(t);
		int i=ms.addmm(m);
		System.out.println(i+"grgrgrgr"+ii);
		return list();
	}
	/**
	 * 修改跳转页面
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/toedit")
	public String toedit( Integer id){
		Medicalrecord m= ms.getIdMM(id);
		
		request().setAttribute("departmentname",  dts.getDTM(m.getDoctorId()).getDeparTmentName());
		request().setAttribute("register", rs.getIdR(m.getRegisterId())); 
		request().setAttribute("medicalrecord",m);
		request().setAttribute("diseases", ds.listDisease());
		request().setAttribute("doctors", us.selectEmployee(null));
		return "/doctorworkstation/medicalrecord/medicalrecord_edit";
	}
	/**
	 * 修改
	 * @param m
	 * @param mt
	 * @return
	 */
	@RequestMapping(value="/edit")
	public String edit( Medicalrecord m,Medicalrecordtemplate mt){
		Medicalrecordtemplate	mte=mts.getNameMCT(m.getMedicalrecordName());	
		if(mte == null ){
			String BLMB = "BLMB" + new Random().nextInt(99999999);
			Medicalrecordtemplate vo = mts.getMCT(BLMB);
			do {
				BLMB = "BLMB" + new Random().nextInt(99999999);
				vo = mts.getMCT(BLMB);
			}while(vo != null);
			mt.setTemplateName(m.getMedicalrecordName());
			mt.setTemplateCode(BLMB);	
			mt.setIsvalId(1);
			mts.addMCT(mt);
		}
		/*else{
			mt.setTemplateName(m.getMedicalrecordName());
			mt.setPatientappeal(m.getPatienTappeal());
			mts.updatMCT(mt);
		}*/
		int i= ms.updateMM(m);
		
		return list();
	}
	
	@ResponseBody
	@RequestMapping(value="/delete", produces="application/json;charset=utf-8")
	public String delete(Integer id){
		Medicalrecord m=new Medicalrecord();
		m.setIsvalId(2);
		m.setId(id);
		int i= ms.updateMM(m);
		String msg="删除失败！";
		if(i>0){
			msg="删除成功";
		}
		return JSONArray.toJSONString(msg);
	}
}
