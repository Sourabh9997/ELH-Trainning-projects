package com.service;

import com.model.Employee;

public interface EmployeeServie {
	public abstract Employee searchbyId(Employee[] employee,int empId);
	public abstract Employee[] searchbyname(Employee[] employee , String name );
	
	

}
