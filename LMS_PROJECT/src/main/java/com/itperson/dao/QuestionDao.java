package com.itperson.dao;

import com.itperson.dto.MAnswer;
import com.itperson.dto.MQuestion;
import com.itperson.dto.SQuestion;

public interface QuestionDao extends Dao{
	public void registQuestionM(MQuestion vo);
	public void registQuestionS(SQuestion vo);
	public void registAnswer(MAnswer vo);
}
