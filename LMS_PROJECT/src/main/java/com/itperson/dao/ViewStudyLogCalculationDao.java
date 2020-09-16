package com.itperson.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.itperson.dto.ViewStudyLogCalculation;

public interface ViewStudyLogCalculationDao {
	public ArrayList<ViewStudyLogCalculation> searchList(String memId);
	public ArrayList<ViewStudyLogCalculation> searchCoCodeList(@Param("coCode") String coCode, @Param("memId") String memId);
}
