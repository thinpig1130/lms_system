package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.CategoryDao;
import com.itperson.dto.Category;

public class CategoryRegistService implements Service {
	private SqlSession sqlSession;
	public CategoryRegistService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		Category vo = new Category();
		vo.setCode(request.getParameter("code"));
		vo.setName(request.getParameter("name"));
		vo.setCoCode(request.getParameter("cocode"));
		
		CategoryDao dao = sqlSession.getMapper(CategoryDao.class);
		dao.registCategory(vo);
		
		model.addAttribute("course", vo.getCoCode());
		model.addAttribute("category", vo.getCode());
	}

}
