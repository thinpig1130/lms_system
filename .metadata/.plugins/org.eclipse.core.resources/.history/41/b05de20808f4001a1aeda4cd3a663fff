package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.MyCourseDao;

public class MyCoursesViewService implements Service {

	private SqlSession sqlSession;
	public MyCoursesViewService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");		
		String id = (String) request.getSession().getAttribute("id");
		
		MyCourseDao dao = sqlSession.getMapper(MyCourseDao.class);
		model.addAttribute("courseList", dao.searchCourses(id));
	}

}
