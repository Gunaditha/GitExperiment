package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeMain project = new EmployeeMain();
		project.start();
	}

	public void start() {
		Employee store[] = new Employee[4];
		Department department = new Department("2SE", "CSE");
		Department department1 = new Department("2SE", "CSE");
		Department department2 = new Department("3CE", "ECE");
		Department department3 = new Department("3CE", "ECE");
		Developer store1 = new Developer(10, "Rohan", department, "C++");
		Developer store2 = new Developer(11, "Rita", department1, "Java");
		Tester store3 = new Tester(13, "Rahul", department2, "visualstudio");
		Tester store4 = new Tester(14, "Rohit", department3, "eclipse");
		store[0] = store1;
		store[1] = store2;
		store[2] = store3;
		store[3] = store4;
		for (int i = 0; i < store.length; i++) {
			Employee iteratedEmployee = store[i];
			if (iteratedEmployee instanceof Developer) {
				Developer developer = (Developer) iteratedEmployee;
				displayEmployee(developer);
			}
			if (iteratedEmployee instanceof Tester) {
				Tester tester = (Tester) iteratedEmployee;
				displayEmployee(tester);
			}
		}
	}

	public void displayBaseEmployee(Employee store) {
		int id = store.getId();
		String name = store.getName();
		Department department = store.getDept();
		String deptid = department.getDeptId();
		String deptname = department.getDeptName();
		System.out.println("Employee is" + " " + id + " " + name + " " + deptid + " " + deptname);
	}

	void displayEmployee(Developer store) {
		displayBaseEmployee(store);
		String language = store.getLang();
		System.out.println("Language=" + language);
	}

	void displayEmployee(Tester store) {
		displayBaseEmployee(store);
		String tools = store.getTools();
		System.out.println("Tools=" + tools);
	}
}
