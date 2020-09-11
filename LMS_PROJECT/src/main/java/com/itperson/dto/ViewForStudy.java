package com.itperson.dto;

public class ViewForStudy extends MyCourse {
	private int daysLeft;
	private int countContents;
	private int countRemaingContnents;
	
	public int getDaysLeft() {
		return daysLeft;
	}
	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}
	public int getCountContents() {
		return countContents;
	}
	public void setCountContents(int countContents) {
		this.countContents = countContents;
	}
	public int getCountRemaingContnents() {
		return countRemaingContnents;
	}
	public void setCountRemaingContnents(int countRemaingContnents) {
		this.countRemaingContnents = countRemaingContnents;
	}
	public int getTodayContents(){
		return (int) Math.ceil(this.countRemaingContnents / (float) daysLeft) ;
	}
	
}
