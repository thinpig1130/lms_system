package com.itperson.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.itperson.dto.ViewStudyContentsList;

public interface ViewStudyContentsListDao {
	public ArrayList<ViewStudyContentsList> allList(int page);
	public ArrayList<ViewStudyContentsList> partOfListByCourse(@Param("coCode") String coCode, @Param("page") int page);
	public ArrayList<ViewStudyContentsList> partOfListByCategory(@Param("caCode") String caCode, @Param("page") int page);
	public ArrayList<ViewStudyContentsList> partOfListBySubCategory(@Param("subCode") String subCode, @Param("page") int page);
	public int pageCnt();
	public int coursePageCnt(String coCode);
	public int categoryPageCnt(String caCode);
	public int subCategoryPageCnt(String subCode);

}
