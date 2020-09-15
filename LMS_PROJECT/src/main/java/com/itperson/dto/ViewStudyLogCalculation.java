package com.itperson.dto;

public class ViewStudyLogCalculation {
	private String stuCode;
	private String memId;
	private int stuCount;
	private long elapsedTime;
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public int getStuCount() {
		return stuCount;
	}
	public void setStuCount(int stuCount) {
		this.stuCount = stuCount;
	}
	public long getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	@Override
	public String toString() {
		return "ViewStudyLogCalculation [stuCode=" + stuCode + ", memId=" + memId + ", stuCount=" + stuCount
				+ ", elapsedTime=" + elapsedTime + "]";
	}
	
	public double getMemoryRate() {
		//아직 반복수는 반환되지 않음.
		return ((Math.log10(1.25) / Math.log10(this.getElapsedTime())));
	}
	
}
