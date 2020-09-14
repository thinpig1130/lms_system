package com.itperson.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.itperson.dao.MemberDao;
import com.itperson.dto.Member;

public class AdminCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		String id= (String) session.getAttribute("id");
		
    	MemberDao dao = sqlSession.getMapper(MemberDao.class);
    	Member manager = dao.checkManager(id);
		if(manager == null) {
			response.sendRedirect("/error/enter");
			return false;
		}
		
		return true;
	}
	
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//    	String id = (String) request.getSession().getAttribute("id");
//    	modelAndView.addObject("id", id);
//    }
}
