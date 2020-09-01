package com.itperson.dto;

public class Category {
	private String code;
	private String name;
	private String coCode;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoCode() {
		return coCode;
	}
	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}
	@Override
	public String toString() {
		return "Category [code=" + code + ", name=" + name + ", coCode=" + coCode + "]";
	}
}
