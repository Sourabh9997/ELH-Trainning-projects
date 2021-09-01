package com.main;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class UniversityMainApp {

	public static void main(String[] args) {
		Student[] students1 = new Student[2];
		students1[0] = new Student(100, "Sourabh", 20);
		students1[1] = new Student(101, "Rahul", 21);

		Student[] students2 = new Student[2];
		students2[0] = new Student(102, "Vishal", 23);
		students2[1] = new Student(103, "Rahul", 26);

		Student[] students3 = new Student[2];
		students3[0] = new Student(104, "Pankaj", 23);
		students3[1] = new Student(105, "Mani", 24);

		Student[] students4 = new Student[2];
		students4[0] = new Student(106, "Varsha", 21);
		students4[1] = new Student(107, "Shipra", 23);

		Student[] students5 = new Student[2];
		students5[0] = new Student(108, "Shalini", 23);
		students5[1] = new Student(109, "Sakshi", 23);

		Student[] students6 = new Student[2];
		students6[0] = new Student(110, "Rohan", 23);
		students6[1] = new Student(111, "Rohit", 22);

		Student[] students7 = new Student[2];
		students7[0] = new Student(112, "Shubham", 23);
		students7[1] = new Student(113, "Shikha", 25);

		Student[] students8 = new Student[2];
		students8[0] = new Student(114, "Aman", 27);
		students8[1] = new Student(115, "Shivani", 23);

		Department[] departments1 = new Department[2];

		departments1[0] = new Department(1, "Computer Science", students1);
		
		departments1[1] = new Department(2, "IT", students2);
		

		Department[] departments2 = new Department[2];

		departments2[0] = new Department(3, "Chemical", students3);
		departments2[1] = new Department(4, "EC", students4);

		Department[] departments3 = new Department[2];
		departments3[0] = new Department(5, "Mechanical", students5);
		departments3[1] = new Department(6, "Civil", students6);

		Department[] departments4 = new Department[2];
		departments4[0] = new Department(7, "Mechanical", students7);
		departments4[1] = new Department(8, "Civil", students8);

		College[] colleges1 = new College[2];
		colleges1[0] = new College(1, "RDEC", departments1);
		colleges1[1] = new College(2, "KIET", departments2);

		College[] colleges2 = new College[2];
		colleges2[0] = new College(3, "MIET", departments3);
		colleges2[1] = new College(4, "JSS", departments4);

		University[] universities = new University[2];
		universities[0] = new University(1, "UPTU", colleges1);
		universities[1] = new University(2, "DTU", colleges2);

		StudentService studentService = new StudentServiceImpl();
		System.out.println(" Search Student by ID :");
		Student studentresult = studentService.searchstudentbyId(universities, 108);

		if (studentresult != null) {
			System.out.println("Student Id    : " + studentresult.getStudId());
			System.out.println("Student Name  : " + studentresult.getStudName());
			System.out.println("Student Age    :" + studentresult.getStudAge());

		} else {
			System.out.println("No Such student");
		}
                   System.out.println(" Search by Name : ");
                  Student[] result = studentService.searchstudentbyName(universities, "Rahul");
                  if(result != null) {
                	  for (int i = 0; i < result.length; i++) {
                		  if(result[i] != null) {
                		  System.out.println("Student Id    : " +result[i].getStudId());
              			System.out.println("Student Name  : " + result[i].getStudName());
              			System.out.println("Student Age    :" + result[i].getStudAge());

					}
                  }
                   
                   

	}

}}
