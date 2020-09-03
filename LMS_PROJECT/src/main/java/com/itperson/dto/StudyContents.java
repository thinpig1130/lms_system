package com.itperson.dto;

import java.sql.Date;

public class StudyContents {
	private String code;
	private int importance;
	private String title;
	private String contents;
	private Date regDate;
	private String subCode;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getImportance() {
		return importance;
	}
	public void setImportance(int importance) {
		this.importance = importance;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	@Override
	public String toString() {
		return "StudyContents [code=" + code + ", importance=" + importance + ", title=" + title + ", contents="
				+ contents + ", regDate=" + regDate + ", subCode=" + subCode + "]";
	}
	
}
