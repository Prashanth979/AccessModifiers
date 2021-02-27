package com.publicexample;

import com.privateexample.EmployeePrivate;

public class PublicMainExample {

	public static void main(String[] args) {

		EmployeePublic employee = new EmployeePublic();

		employee.hi();

		EmployeePrivate employeePrivate = new EmployeePrivate();
		employeePrivate.hi();

	}

}
