package com.model;

// Entity object --> All property of POJO file matches the Column of the Table in DB
import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String empName;
	private String designation;
	private int age;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String designation, int age, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
