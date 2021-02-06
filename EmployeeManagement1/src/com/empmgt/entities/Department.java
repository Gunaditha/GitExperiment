package com.empmgt.entities;

public class Department {
	
	private String deptid;
	private String deptname;

	public Department(String id, String name) {
		this.setDeptId(id);
		this.setDeptName(name);
	}

	public String getDeptId() {
		return deptid;
	}

	public void setDeptId(String id) {
		this.deptid = id;
	}

	public String getDeptName() {
		return deptname;
	}

	public void setDeptName(String name) {
		this.deptname = name;
	}

}
