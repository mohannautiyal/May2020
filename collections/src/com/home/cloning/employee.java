package com.home.cloning;

// class should implement cloneable interface to support clone method
public class employee implements Cloneable {

	String empName;
	int empId;

	public employee(String empName, int empId) {
		// super();
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "employee [empName=" + empName + ", empId=" + empId + "]";
	}

	// Need to override clone method
	@Override
	protected employee clone() throws CloneNotSupportedException { //
		return (employee) super.clone();
	}

}
