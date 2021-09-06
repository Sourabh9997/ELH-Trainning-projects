package com.main;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class MainApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeService employeeService=new EmployeeServiceImpl();

        
		    
		        boolean loopvar = true;
		        
		        while(loopvar){
		            System.out.println("\n-----------------------");
		            System.out.println("1. Read by id");
		            System.out.println("2. Read by name");
		            System.out.println("4. Create/Insert Operation");
		            System.out.println("3. Update Operation");
		            System.out.println("5. Delete Operation");
		            
		            System.out.println("0. Exit");
		            System.out.println("-----------------------");
		             
		             int switchvar = scanner.nextInt();
		             
		             //int a = input.nextInt();
		             
		             switch(switchvar){
		                 case 1:
		                		System.out.println("Enter employee no to be searched : ");
		                		
		                		int userData = scanner.nextInt();

		                		// service --> dao
		                		// dao ( which is wrong)
		                		//EmployeeDao employeeDao = new EmployeeDaoImpl();
		                		Employee outout = employeeService.readEmployeeById(userData);

		                		System.out.println("Employee id   : " + outout.getEmpId());
		                		System.out.println("Employee name : " + outout.getEmpName());
		                		
		                    
		                     break;
		                     
		                case 2 :

		            		System.out.println("Enter employee no to searched by name : ");
		            		
		            		String name=scanner.next();
		            		Employee emp=employeeService.readEmployeeByName(name);
		            		System.out.println("Employee id   : " + emp.getEmpId());
		            		System.out.println("Employee name : " + emp.getSalary());
		            		System.out.println("Employee name : " + emp.getDesignation());
		            		
		                    
		                    break;
		                    
		                case 3 :

		            		System.out.println(" Create Operation");
		            		Employee employee = null;
		            		//employee=employeeService.createEmployee(employee);
		            		
		            		int result=employeeService.createEmployee(employee);
		            		if(result>0) {
		            			System.out.println("DATA Inserted");
		            		}else {
		            			System.out.println("Sorry , Not Inserted");
		            		}
		                    break;
		                case 4 :

		            		System.out.println("Enter employee name to be updated : ");
		            		
		            		String name1=scanner.next();
		            	//	EmployeeService employeeService=new EmployeeServiceImpl();
		            		Employee emp1=employeeService.updateEmployee(name1);
		            	System.out.println("Employee id   : " + emp1.getEmpId());
		            		System.out.println("Employee name : " + emp1.getSalary());
		            		System.out.println("Employee name : " + emp1.getDesignation());
		            		
		                    break;
		                case 5 :

		            		System.out.println(" DELETE OPERATION");
		            		Scanner sc=new Scanner(System.in);
		            		int del=sc.nextInt();
		            		
		            		int delop=employeeService.deleteEmployeeByEmployeeId(del);
		            		if(delop>0) {
		            			System.out.println("DELETED");
		            		}else {
		            			System.out.println("Try Again ");
		                    break;}
		                    
		                case 0:{
		                    System.out.println("0. Khatam ,Tata,Bubyee");
		                    
		                    break;
		                
		             }
		            
		            
		        }
		        
		    }
		        loopvar = false;
		

	}
}


