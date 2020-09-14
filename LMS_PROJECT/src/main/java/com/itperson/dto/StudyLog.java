package com.itperson.dto;

import java.sql.Date;

public class StudyLog {
	private String memId;
	private String stuCode;
	private Date regDate;
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "StudyLog [memId=" + memId + ", stuCode=" + stuCode + ", regDate=" + regDate + "]";
	}
}
