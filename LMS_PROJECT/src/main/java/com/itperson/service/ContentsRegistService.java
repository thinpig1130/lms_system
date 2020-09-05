package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.common.CommonModules;
import com.itperson.dao.Dao;
import com.itperson.dao.StudyContentsDao;
import com.itperson.dto.StudyContents;

public class ContentsRegistService implements Service {
	private SqlSession sqlSession;
	public ContentsRegistService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		StudyContents vo = new StudyContents();
		
		String cocode = request.getParameter("cocode");
		String cacode = request.getParameter("cacode");
		
		vo.setSubCode(request.getParameter("subcode"));
		vo.setImportance(Integer.parseInt(request.getParameter("importance")));
		vo.setTitle(request.getParameter("title"));
		vo.setContents(request.getParameter("contents"));
		
		StudyContentsDao studyContentsDao = sqlSession.getMapper(StudyContentsDao.class);
		
		//코드 자동생성 모듈이용
		String nxCode = CommonModules.nextCode(vo.getSubCode(), studyContentsDao);
		vo.setCode(nxCode);

		studyContentsDao.registStudyContents(vo);
		
		model.addAttribute("course", cocode);
		model.addAttribute("category", cacode);
		model.addAttribute("subcategory", vo.getSubCode());
		
	}

}
