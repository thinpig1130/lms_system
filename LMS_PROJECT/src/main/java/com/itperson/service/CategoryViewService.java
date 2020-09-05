package com.itperson.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;
import com.itperson.dao.CourseDao;
import com.itperson.dao.FieldDao;
import com.itperson.dto.Field;


public class CategoryViewService implements Service {
	
	private SqlSession sqlSession;
	
	public CategoryViewService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String coCode = request.getParameter("course");
		String caCode = request.getParameter("category");
		String subCode = request.getParameter("subcategory");
		
		FieldDao fieldDao =  sqlSession.getMapper(FieldDao.class);
			
		model.addAttribute("courses", fieldDao.courseList());
		
		if(subCode==null || subCode.equals("")) {
			if(caCode==null || caCode.equals("")) {		
				if(coCode==null || coCode.equals("")) {
					// 모든 대분류/소분류/학습 목록 전달
					model.addAttribute("categorys", fieldDao.categoryList());
					model.addAttribute("sub_categorys", fieldDao.subCategoryList());
				}else {
					
					model.addAttribute("cur_course", fieldDao.serchCourseSet(coCode));	
					model.addAttribute("categorys", fieldDao.partOfcategoryList(coCode));
					model.addAttribute("sub_categorys", fieldDao.PartOfsubCategoryListByCourse(coCode));

				}
			}else {
				model.addAttribute("cur_category", fieldDao.serchCategorySet(caCode) );
				Field cur_course = fieldDao.categoryBelongs(caCode);
				model.addAttribute("cur_course", cur_course);	
				model.addAttribute("categorys", fieldDao.partOfcategoryList(cur_course.getCode()));
				model.addAttribute("sub_categorys", fieldDao.partOfsubCategoryListByCategory(caCode));
			}
		}else {
			// subCategory가 속한 과정과 그 과정에 해당되는 대분류 목록 전달
			// 대분류에 해당하는 소분류 목록 전달
			model.addAttribute("cur_subcategory", fieldDao.serchSubCategorySet(subCode) );
			Field cur_category = fieldDao.subCategoryBelongs(subCode);
			Field cur_course = fieldDao.categoryBelongs(cur_category.getCode());
			model.addAttribute("cur_category", cur_category);
			model.addAttribute("cur_course", cur_course);
			
			model.addAttribute("categorys", fieldDao.partOfcategoryList(cur_course.getCode()));
			model.addAttribute("sub_categorys", fieldDao.partOfsubCategoryListByCategory(cur_category.getCode()));
		}
		
	}

}
