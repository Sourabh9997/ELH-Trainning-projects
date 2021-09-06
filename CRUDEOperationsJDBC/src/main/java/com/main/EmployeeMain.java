package com.main;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeMain {
	

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee no to be searched : ");
		
		int userData = scanner.nextInt();

		// service --> dao
		// dao ( which is wrong)
		//EmployeeDao employeeDao = new EmployeeDaoImpl();
		Employee outout = employeeService.readEmployeeById(userData);

		System.out.println("Employee id   : " + outout.getEmpId());
		System.out.println("Employee name : " + outout.getEmpName());
		
		
		
		
		
		System.out.println("Enter employee no to searched by name : ");
		
		String name=scanner.next();
		Employee emp=employeeService.readEmployeeByName(name);
		System.out.println("Employee id   : " + emp.getEmpId());
		System.out.println("Employee name : " + emp.getSalary());
		System.out.println("Employee name : " + emp.getDesignation());
		

		System.out.println("Enter employee name to be updated : ");
		
		String name1=scanner.next();
	//	EmployeeService employeeService=new EmployeeServiceImpl();
		Employee emp1=employeeService.updateEmployee(name1);
	System.out.println("Employee id   : " + emp1.getEmpId());
		System.out.println("Employee name : " + emp1.getSalary());
		System.out.println("Employee name : " + emp1.getDesignation());
		
		
		
		System.out.println(" Create Operation");
		Employee employee = null;
		//employee=employeeService.createEmployee(employee);
		
		int result=employeeService.createEmployee(employee);
		if(result>0) {
			System.out.println("DATA Inserted");
		}else {
			System.out.println("Sorry , Not Inserted");
		}
		
		
		
		
		System.out.println(" DELETE OPERATION");
		Scanner sc=new Scanner(System.in);
		int del=sc.nextInt();
		
		int delop=employeeService.deleteEmployeeByEmployeeId(del);
		if(delop>0) {
			System.out.println("DELETED");
		}else {
			System.out.println("Try Again ");
		}
	}
}
