package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public int createEmployee(Employee employee) {
		int result=0;
		EmployeeDao employeeDao= new EmployeeDaoImpl();
		result=employeeDao.createEmployee(employee);
		return result;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		 Employee employee = null;
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		employee= employeeDao.readEmployeeById(empId);
		 return employee;
	}

	@Override
	public Employee readEmployeeByName(String empName) {
		 Employee employee = null;
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		employee= employeeDao.readEmployeeByName(empName);
		 return employee;
		
	}

	@Override
	public Employee updateEmployee(String empName) {
		Employee empl = null;
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		 empl=employeeDao.updateEmployee(empName);
		 return empl;
	}

	@Override
	public int deleteEmployeeByEmployeeId(int empId) {

		int del=0;
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		del= employeeDao.deleteEmployeeByEmployeeId(empId);
		return del;
	}

}
