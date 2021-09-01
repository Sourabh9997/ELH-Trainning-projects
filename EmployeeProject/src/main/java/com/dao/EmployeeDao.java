package com.dao;

import com.model.Employee;

public interface EmployeeDao {
	public abstract Employee searchbyId(Employee[] employee,int empId);
	public abstract Employee searchbyname(Employee[] employee , String name );
	

}
