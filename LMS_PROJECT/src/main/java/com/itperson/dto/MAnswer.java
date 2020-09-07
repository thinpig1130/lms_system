package com.itperson.dto;

public class MAnswer {
	private int code;
	private String qCode;
	private String answer;
	private String correct;
	
	
	public MAnswer() {};
	public MAnswer(int code, String qCode, String answer, String correct) {
		super();
		this.code = code;
		this.qCode = qCode;
		this.answer = answer;
		this.correct = correct;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getqCode() {
		return qCode;
	}
	public void setqCode(String qCode) {
		this.qCode = qCode;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	@Override
	public String toString() {
		return "MAnswer [code=" + code + ", qCode=" + qCode + ", answer=" + answer + ", correct=" + correct + "]";
	}
}
