package com.empmgt.entities;

public class Developer extends Employee {
	private String language;

	public Developer(int id, String name, Department department, String language) {
		super(id, name, department);
		this.setLang(language);
	}

	public String getLang() {
		return language;
	}

	public void setLang(String language) {
		this.language = language;
	}
}
