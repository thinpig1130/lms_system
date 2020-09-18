package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.TestLogDao;

public class PracticeTestRecordService implements Service {
	private SqlSession sqlSession;
	public PracticeTestRecordService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		TestLogDao dao = sqlSession.getMapper(TestLogDao.class);
		
		String coCode = request.getParameter("coCode");
		int score = Integer.parseInt(request.getParameter("score"));
		int correct = Integer.parseInt(request.getParameter("correct"));
		int questions = Integer.parseInt(request.getParameter("questions"));
		
		dao.registLog(coCode, score, correct, questions);		

	}

}
