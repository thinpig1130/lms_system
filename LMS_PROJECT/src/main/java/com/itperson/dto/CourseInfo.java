package com.itperson.dto;

import java.util.ArrayList;

public class CourseInfo extends Field{
	ArrayList<CategoryInfo> categoryArr;
	public CourseInfo() {
		categoryArr = new ArrayList<CategoryInfo>();
	}
	public ArrayList<CategoryInfo> getCategoryArr() {
		return categoryArr;
	}
	public void setCategoryArr(ArrayList<CategoryInfo> categoryArr) {
		this.categoryArr = categoryArr;
	}
	public void setCourse(Field field) {
		super.setName(field.getName());
		super.setCode(field.getCode());
	}
}
