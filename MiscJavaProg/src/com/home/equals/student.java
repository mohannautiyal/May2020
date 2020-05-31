package com.home.equals;

public class student {
	private String stuName;
	private int rollno;
	
	public student(String stuName, int rollno) {
		super();
		this.stuName = stuName;
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "student [stuName=" + stuName + ", rollno=" + rollno + "]";
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (rollno != other.rollno)
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		return true;
	}
	
	
	
	

}
