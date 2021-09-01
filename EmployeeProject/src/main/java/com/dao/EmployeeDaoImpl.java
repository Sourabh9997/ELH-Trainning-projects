package com.dao;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee searchbyId(Employee[] employee, int empId) {
		Employee temp=null;
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getEmpId()==empId) {
				temp=employee[i];
			}
			
		}
		
		return temp;
		
	}

	@Override
	public Employee searchbyname(Employee[] employee, String name) {
		Employee[] dummyArray=new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getEmpName().equals(name)) {
				dummyArray[i]=employee[i];
				
			}
			else {
				
			}
		} 
		int i = 0;
		return dummyArray[i];
		
	}

}
