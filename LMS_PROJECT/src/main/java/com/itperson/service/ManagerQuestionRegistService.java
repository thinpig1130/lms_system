package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.CategoryDao;
import com.itperson.dao.QnaQuestionDao;
import com.itperson.dto.QnaQuestion;

public class ManagerQuestionRegistService implements Service{
	private SqlSession sqlSession;
	
	public ManagerQuestionRegistService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
//		String qna_type = request.getParameter("qna_type");
//		System.out.println(qna_type);
//		String title = request.getParameter("title");
//		System.out.println(title);
//		String contents = request.getParameter("contents");
//		System.out.println(contents);

//		private int no;
//		private String qna_type;
//		private String title;
//		private String contents;
//		private int count;
//		private String reg_date;
//		private String user_id;
//		private int comment_no;
		String memId = (String) request.getSession().getAttribute("id");
		QnaQuestion vo = new QnaQuestion();
//		vo.setNo(Integer.parseInt((request.getParameter("no"))));
		vo.setQna_type(request.getParameter("qna_type"));
		vo.setTitle(request.getParameter("title"));
		vo.setContents(request.getParameter("contents"));
//		vo.setCount(Integer.parseInt((request.getParameter("count"))));
//		vo.setReg_date(request.getParameter("reg_date"));
		vo.setUser_id(memId);
//		vo.setComment_no(Integer.parseInt((request.getParameter("comment_no"))));
		System.out.println(vo);
		
		QnaQuestionDao dao = sqlSession.getMapper(QnaQuestionDao.class);
		dao.registQnaQuestion(vo);
	}
	
}
