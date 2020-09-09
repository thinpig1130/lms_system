package com.itperson.dto;

public class SubCategoryInfo extends SubCategory{
	int countCon;
	
	public int getcountCon() {
		return countCon;
	}
	public void setcountCon(int countCon) {
		this.countCon = countCon;
	}
	
	public void setCourse(Field field) {
		super.setName(field.getName());
		super.setCode(field.getCode());
	}
	
}
