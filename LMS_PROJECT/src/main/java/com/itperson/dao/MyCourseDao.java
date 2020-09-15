package com.itperson.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.itperson.dto.MyCourse;
import com.itperson.dto.ViewForStudy;

public interface MyCourseDao {
	public void registMyCourse(@Param("coCode") String coCode, @Param("memId") String memId);
	public ArrayList<MyCourse> searchCourses(String memId);
	public void updateMyCourse(MyCourse vo);
	public ArrayList<ViewForStudy> searchComplexCourses(String memId);
	public String nextStucodeInOrder(@Param("coCode") String coCode, @Param("memId") String memId);
	public String nextStucodeImport(@Param("coCode") String coCode, @Param("memId") String memId);
	public String firstStucodeInOrder(String coCode);
	public String firstStucodeImport(String coCode);
	public int searchPlan(@Param("coCode") String coCode, @Param("memId") String memId);
	public int searchPriority(@Param("coCode") String coCode, @Param("memId") String memId);
	public int isStudyLog(@Param("coCode") String coCode, @Param("memId") String memId);
}
