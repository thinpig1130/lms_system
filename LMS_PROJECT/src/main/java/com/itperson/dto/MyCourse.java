package com.itperson.dto;

import java.sql.Date;

public class MyCourse {
	private String coCode;
	private String coName;
	private String memId;
	private int plan;
	private int range;
	private int days;
	private Date startDate;
	private Date endDate;
	
	public String getCoCode() {
		return coCode;
	}
	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCoName() {
		return coName;
	}
	public void setCoName(String coName) {
		this.coName = coName;
	}
	@Override
	public String toString() {
		return "MyCourse [coCode=" + coCode + ", memId=" + memId + ", plan=" + plan + ", range=" + range + ", days="
				+ days + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
