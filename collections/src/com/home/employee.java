package com.home;

public class employee implements Comparable {

	String name;
	int empno;

	public employee(String name, int empno) {
		// super();
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

	
	// Compare To method needs to be implemented to support sorting in objects
	@Override
	public int compareTo(Object o) {
		employee emp = (employee) o;
		if (emp.getEmpno()== this.getEmpno())
			return 0;
		if (emp.getEmpno() > this.getEmpno())
			return -1;
		else
			return 1;
	}

}
