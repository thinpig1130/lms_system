package com.itperson.dao;

import java.util.ArrayList;
import com.itperson.dto.Course;

public interface CourseDao {
	public void registCourse(Course vo);
	public ArrayList<Course> courseList();
	public String serchCourseName(String code);
}
