package com.itperson.dto;

public class SubCategory {
	private String code;
	private String name;
	private String caCode;
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
	public String getCaCode() {
		return caCode;
	}
	public void setCaCode(String coCode) {
		this.caCode = coCode;
	}
	@Override
	public String toString() {
		return "Category [code=" + code + ", name=" + name + ", caCode=" + caCode + "]";
	}

}
