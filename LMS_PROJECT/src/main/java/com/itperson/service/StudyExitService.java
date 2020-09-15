package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.StudyLogDao;

public class StudyExitService implements Service {
	private SqlSession sqlSession;
	public StudyExitService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String studyCompleted = "O";
		String[] corArr = request.getParameterValues("correct");
		if(corArr != null) {
			for(String cor : corArr) {
				if(cor.equals("X")) {
					studyCompleted="X";
					break;
				}
			}			
		}
		if(studyCompleted.equals("O")) {
			StudyLogDao dao = sqlSession.getMapper(StudyLogDao.class);
			String stuCode = request.getParameter("code");
			String memId = (String) request.getSession().getAttribute("id");
			dao.registStudyLog(stuCode, memId, studyCompleted);
		}
	}
}