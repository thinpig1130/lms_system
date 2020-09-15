package com.itperson.dao;

import java.util.ArrayList;

import com.itperson.dto.ViewStudyLogCalculation;

public interface ViewStudyLogCalculationDao {
	public ArrayList<ViewStudyLogCalculation> searchList(String memId);

}
