package com.itperson.dao;

import java.util.ArrayList;

import com.itperson.dto.StudyContents;


public interface StudyContentsDao extends Dao{
	public void registStudyContents(StudyContents vo);
	public ArrayList<StudyContents> studyContentsList();
	public StudyContents serchStudyContents(String code);
}
