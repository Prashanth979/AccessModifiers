package com.protectedexample;

import com.privateexample.EmployeePrivate;

public class ProtectedMainExample extends EmployeePrivate {

	public static void main(String[] args) {

		EmployeeProtected employee = new EmployeeProtected();

		employee.hi();

		EmployeePrivate employeePrivate = new EmployeePrivate();
		employeePrivate.hi();

		ProtectedMainExample protectedMainExample = new ProtectedMainExample();
		protectedMainExample.bye();
	}

}
