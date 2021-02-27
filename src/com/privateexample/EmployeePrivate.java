package com.privateexample;

public class EmployeePrivate {

	private void hello() {
		System.out.println("Hello");
	}

	public void hi() {
		System.out.println("Hi");
		hello();
	}

	protected void bye() {
		System.out.println("BYE");
	}

	void welcome() {
		System.out.println("WELCOME");
	}

	public void calculator(int a, int b) {

		int add = add(a, b);

		System.out.println(add);

		int sub = sub(a, b);
		System.out.println(sub);
	}

	private int sub(int i, int j) {
		return i - j;
	}

	private int add(int i, int j) {
		return i + j;
	}
}
