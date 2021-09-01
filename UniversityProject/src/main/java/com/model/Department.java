package com.model;

public class Department {
	private int deptId;
	private String deptName;
	private Student[] students;

	public Department() {
		super();
	}

	public Department(int deptId, String deptName, Student[] students) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.students = students;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}
