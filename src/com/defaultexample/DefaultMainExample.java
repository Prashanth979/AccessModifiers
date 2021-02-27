package com.defaultexample;

import com.privateexample.EmployeePrivate;

public class DefaultMainExample {

	public static void main(String[] args) {

		EmployeeDefault employee = new EmployeeDefault();

		employee.hi();
		employee.welcomeDefault();

		EmployeePrivate employeePrivate = new EmployeePrivate();
		employeePrivate.hi();

	}

}
