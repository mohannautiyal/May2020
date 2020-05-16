package com.home;

public class employee {

	
	String name;
	int empno;
	
	public employee(String name, int empno) {
		//super();
		this.name = name;
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public int getEmpno() {
		return empno;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", empno=" + empno + "]";
	}
	
	
	
}
