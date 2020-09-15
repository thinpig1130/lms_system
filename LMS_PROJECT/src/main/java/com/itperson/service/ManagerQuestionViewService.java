package com.itperson.service;



import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;
import com.itperson.dao.QnaQuestionDao;

public class ManagerQuestionViewService implements Service{
	private SqlSession sqlSession;
	
	public ManagerQuestionViewService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		QnaQuestionDao dao = sqlSession.getMapper(QnaQuestionDao.class);
		System.out.println(dao.QnaQuestionList());
		model.addAttribute("qnaquestions",  dao.QnaQuestionList());
	}
	
}
