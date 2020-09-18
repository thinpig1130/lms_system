package com.itperson.dao;

import java.util.ArrayList;

import com.itperson.dto.MAnswer;
import com.itperson.dto.MQuestion;
import com.itperson.dto.Question;
import com.itperson.dto.SQuestion;

public interface QuestionDao extends Dao{
	public void registQuestionM(MQuestion vo);
	public void registQuestionS(SQuestion vo);
	public void registAnswer(MAnswer vo);
	public ArrayList<Question> searchQuestionList(String stuCode);
	public ArrayList<Question> searchQuestionListByCourse(String coCode);
	public ArrayList<Question> searchMQuestionListByCourse(String coCode);
	public ArrayList<Question> searchSQuestionListByCourse(String coCode);
	public ArrayList<MAnswer> searchMAnswer(String qCode);
	public String searchSAnswer(String qCode);
}
