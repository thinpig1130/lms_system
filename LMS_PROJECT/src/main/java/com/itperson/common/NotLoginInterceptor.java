package com.itperson.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class NotLoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		
		if(session == null) {
			response.sendRedirect("/error/before_login_error");
			return false;
		}
		
		String id= (String) session.getAttribute("id");
		
		if(id == null) {
			response.sendRedirect("/error/before_login_error");
			return false;
		}
		
		return true;
	}

}
