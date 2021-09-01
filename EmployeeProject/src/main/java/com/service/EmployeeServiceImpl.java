package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeServie {

	@Override
	public Employee searchbyId(Employee[] employee, int empId) {
		Employee temp=null;
		
		EmployeeDao employeedao=new EmployeeDaoImpl();
		temp=employeedao.searchbyId(employee, empId);
		
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getEmpId()==empId) {
				temp=employee[i];
			}
			
		}
		
		return temp;
	}

	@Override
	public Employee[] searchbyname(Employee[] employee, String name) {
		Employee[] dummyArray=new Employee[3];
		EmployeeDao empDao=new EmployeeDaoImpl();
		empDao.searchbyname(employee, name);
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getEmpName().equals(name)) {
				dummyArray[i]=employee[i];
				
			}
			else {
				 
			}
		} 
		int i = 0;
		return dummyArray;
	}

}
