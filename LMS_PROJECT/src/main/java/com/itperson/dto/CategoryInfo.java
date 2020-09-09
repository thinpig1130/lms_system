package com.itperson.dto;

import java.util.ArrayList;

public class CategoryInfo extends Field{
	ArrayList<SubCategoryInfo> subCategoryArr;
	
	public CategoryInfo() {
		subCategoryArr = new ArrayList<SubCategoryInfo>();
	}

	public ArrayList<SubCategoryInfo> getSubCategoryArr() {
		return subCategoryArr;
	}
	
	public void setSubCategoryArr(ArrayList<SubCategoryInfo> subCategoryArr) {
		this.subCategoryArr = subCategoryArr;
	}
	
	public void setCourse(Field field) {
		super.setName(field.getName());
		super.setCode(field.getCode());
	}	
}
