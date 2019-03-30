package com.configuration;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class lanjie extends HandlerInterceptorAdapter{

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Object obj = request.getSession().getAttribute("employye");
		if(obj == null){
			response.sendRedirect(request.getContextPath() + "/indexController/toinitial.do");
			return false;
		}
		
		//获取请求路径
		String path = request.getServletPath();
		//过滤请求，以下不设拦截
		if(path.indexOf("tablelist.do") >= 0 || path.indexOf("finduser.do") >= 0 
			|| path.indexOf("toeditpsw.do") >= 0 || path.indexOf("editpswnext.do") >= 0 
			|| path.indexOf("editpsw.do") >= 0 || path.indexOf("getdptbypid.do") >= 0){
			return true;
		}
		
		return false;
	}
	
}
