package com.itperson.dao;

import java.util.ArrayList;
import com.itperson.dto.QnaQuestion;

public interface QnaQuestionDao {
	public void registQnaQuestion(QnaQuestion vo);
	public int qnaQuestionMaxPage();
	public ArrayList<QnaQuestion> qnaQuestionList(int page);
}
