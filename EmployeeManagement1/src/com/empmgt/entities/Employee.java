package com.empmgt.entities;

public class Employee {
	private int id;
	private String name;
	private Department dept;

	public Employee(int id, String name,Department department) {
		this.setId(id);
		this.setName(name);
		this.setDept(department);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}
	public void setDept(Department department) {
		this.dept= department;
	}

}
