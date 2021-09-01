package com.model;

public class College {
	private int collegeId;
	private String collegeName;
	private Department[] departments;

	public College() {
		super();
	}

	public College(int collegeId, String collegeName, Department[] departments) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

}
