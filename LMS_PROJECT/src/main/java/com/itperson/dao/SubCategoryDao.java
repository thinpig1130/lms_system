package com.itperson.dao;

import java.util.ArrayList;

import com.itperson.dto.SubCategory;

public interface SubCategoryDao {
	public void registSubCategory(SubCategory vo);
	public ArrayList<SubCategory> subCategoryList(String caCode);
}
