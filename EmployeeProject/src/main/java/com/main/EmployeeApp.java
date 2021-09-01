package com.main;

import com.model.Employee;
import com.service.EmployeeServiceImpl;
import com.service.EmployeeServie;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee employee1=new Employee(101, "souarbh", 1010);
		Employee employee2=new Employee(102, "rahul", 1100);
		Employee employee3=new Employee(103, "Sourabh", 2000);
		Employee[] employees=new Employee[3];
		employees[0]=employee1;
		employees[1]=employee2;
		employees[2]=employee3;
		System.out.println(" No of Employees " +employees.length);
		EmployeeServie employeeServie=new EmployeeServiceImpl();
		System.out.println("Search by ID  :   ");
	Employee employee=	employeeServie.searchbyId(employees, 101);
	if (employee != null) {
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getSalary());
	}
		
System.out.println("Search by Name  : ");
Employee[] result =employeeServie.searchbyname(employees,"rahul");
System.out.println(" Length of result "  +result.length);
if(result.length>0) {
	for (int i = 0; i < result.length; i++) {
		if(result[i] != null) {
			System.out.println(result[i].getEmpId());
			System.out.println(result[i].getEmpName());
			System.out.println(result[i].getSalary());
		}
		
	}
	
}


	}

}
