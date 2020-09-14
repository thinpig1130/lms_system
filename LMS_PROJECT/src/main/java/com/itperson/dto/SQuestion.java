package com.itperson.dto;

public class SQuestion extends Question{
	private String answer;
	
	public SQuestion() {};
	public SQuestion(Question que) {
		this.setCode(que.getCode());
		this.setQuestion(que.getQuestion());
		this.setStuCode(que.getStuCode());
		this.setType(que.getType());
	}

	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "SQuestion [answer=" + answer + ", getCode()=" + getCode() + ", getQuestion()=" + getQuestion()
				+ ", getStuCode()=" + getStuCode() + ", getType()=" + getType() + "]";
	}

}
