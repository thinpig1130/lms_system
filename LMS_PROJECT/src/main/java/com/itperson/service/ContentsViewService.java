package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.itperson.dao.ViewStudyContentsListDao;


public class ContentsViewService implements Service {

	private SqlSession sqlSession;
	public ContentsViewService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");		
		
		// request 파라미터 값 받음
		String coCode = request.getParameter("course");
		String caCode = request.getParameter("category");
		String subCode = request.getParameter("subcategory");
		String strPage = request.getParameter("page");
		
		int page;
		if(strPage==null) {
			page = 1;
		}else {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		ViewStudyContentsListDao stuDao = sqlSession.getMapper(ViewStudyContentsListDao.class);
		
		if(subCode==null || subCode.equals("")) {
			if(caCode==null || caCode.equals("")) {		
				if(coCode==null || coCode.equals("")) {
					model.addAttribute("lists", stuDao.allList(page));
					model.addAttribute("maxpage", stuDao.pageCnt());
				}else {
					model.addAttribute("lists", stuDao.partOfListByCourse(coCode, page));
					model.addAttribute("maxpage", stuDao.coursePageCnt(coCode));
				}
			}else {
				model.addAttribute("lists", stuDao.partOfListByCategory(caCode, page));
				model.addAttribute("maxpage", stuDao.categoryPageCnt(caCode));
			}
		}else {
			model.addAttribute("lists", stuDao.partOfListBySubCategory(subCode, page));
			model.addAttribute("maxpage", stuDao.subCategoryPageCnt(subCode));
		}
		model.addAttribute("page", page);
	}

}
