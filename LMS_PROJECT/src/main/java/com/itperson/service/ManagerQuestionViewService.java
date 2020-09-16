package com.itperson.service;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");	
		String strPage = request.getParameter("page");
		int page;
		if(strPage==null) {
			page = 1;
		}else {
			page = Integer.parseInt(strPage);
		}
		
		System.out.println(page);
		QnaQuestionDao dao = sqlSession.getMapper(QnaQuestionDao.class);
		model.addAttribute("qnaquestions",  dao.qnaQuestionList(page));
		model.addAttribute("qnaquestionmaxpages",  dao.qnaQuestionMaxPage());
		model.addAttribute("page", page);//
//		System.out.println("ManagerQuestionViewService에서 넘어온QnaQuestionList값"+ dao.qnaQuestionList(page));
//		System.out.println("ManagerQuestionViewService에서 넘어온 QnaQuestionMaxPage값" +dao.qnaQuestionMaxPage());
//		
	}
	
}
