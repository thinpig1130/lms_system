package com.itperson.dto;

public class Test {
	private String coCode;
	private String coName;
	private int testType;
	private int questionCount;
	private int timeLimit;
	public String getCoCode() {
		return coCode;
	}
	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}
	public String getCoName() {
		return coName;
	}
	public void setCoName(String coName) {
		this.coName = coName;
	}
	public int getTestType() {
		return testType;
	}
	public void setTestType(int testType) {
		this.testType = testType;
	}
	public int getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	@Override
	public String toString() {
		return "Test [coCode=" + coCode + ", coName=" + coName + ", testType=" + testType + ", questionCount="
				+ questionCount + ", timeLimit=" + timeLimit + "]";
	}
}
