package com.itperson.dto;

import java.util.ArrayList;

public class MQuestion extends Question{
	private ArrayList<MAnswer> answer;
	
//	public String getAnswer() {
//		return ;
//	}
	public MQuestion() {};
	public MQuestion(Question que) {
		this.setCode(que.getCode());
		this.setQuestion(que.getQuestion());
		this.setStuCode(que.getStuCode());
		this.setType(que.getType());
	}
	
	public void setAnswer(ArrayList<MAnswer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "MQuestion [answer=" + answer + ", getCode()=" + getCode() + ", getQuestion()=" + getQuestion()
				+ ", getStuCode()=" + getStuCode() + ", getType()=" + getType() + "]";
	}
	
	@Override
	public ArrayList<MAnswer> getAnswerList(){
		return answer;
		
	}
	
}
