package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.ViewStudyLogCalculationDao;

public class ReviewListService implements Service {
	private SqlSession sqlSession;
	
	public ReviewListService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String memId = (String) request.getSession().getAttribute("id");
		
		ViewStudyLogCalculationDao dao = sqlSession.getMapper(ViewStudyLogCalculationDao.class);
		
		model.addAttribute("list", dao.searchList(memId));
	}

}
