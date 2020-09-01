package com.itperson.service;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;
import com.itperson.dao.CourseDao;


public class CoursesViewService implements Service {

private SqlSession sqlSession;
	
	public CoursesViewService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void execute(Model model) {
		
		CourseDao dao = sqlSession.getMapper(CourseDao.class);
		model.addAttribute("courses", dao.courseList());

	}
}
