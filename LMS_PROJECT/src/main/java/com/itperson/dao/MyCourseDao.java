package com.itperson.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.itperson.dto.MyCourse;

public interface MyCourseDao {
	public void registMyCourse(@Param("coCode") String coCode, @Param("memId") String memId);
	public ArrayList<MyCourse> searchCourses(String memId);
	public void updateMyCourse(MyCourse vo);
}
