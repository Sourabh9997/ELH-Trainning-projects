package com.model;

/**
 * 
 * @author ssourabh
 *
 */
public class University {
	private int universityId;
	private String universityName;
	private College[] colleges;

	public University() {
		super();
	}

	public University(int universityId, String universityName, College[] colleges) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.colleges = colleges;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public College[] getColleges() {
		return colleges;
	}

	public void setColleges(College[] colleges) {
		this.colleges = colleges;
	}

}
