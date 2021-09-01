package com.dao;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Student searchstudentbyId(University[] universities, int studentid) {
		Student tempStudent = null;
	/*     College[ ]  col = universities[0].getColleges();
	     for (int i = 0; i < col.length; i++) {
			System.out.println(col[i].getCollegeName());
		}
	     Department[ ]  dep =  col[0].getDepartments();
	     for (int i = 0; i < dep.length; i++) {
			System.out.println(dep[i].getDeptName());
		}
	     Student[ ] stu = dep[0].getStudents();
	     for (int i = 0; i < stu.length; i++) {
	    	 
			if(stu[i].getStudId()== studentid)
				
			{
				System.out.println("got it");
				
			}
			else
			{
				System.out.println("Opps  " +stu[i].getStudId());
			}
	     }
		return new Student(1000, " Xyz", 30);
		}*/
	     
		//System.out.println(" Inside dao");
		for (int i = 0; i < universities.length; i++) {
			//System.out.println(" Inside Uni");
			College[] collegeArray = universities[i].getColleges();

			for (int j = 0; j < collegeArray.length; j++) {
			//	System.out.println(" Inside college");
				Department[] departmentArray = collegeArray[j].getDepartments();
				
				//System.out.println(departmentArray.length);
				
				for (int k = 0; k < departmentArray.length; k++) {
					Student[] studentArray=departmentArray[k].getStudents();
				//	System.out.println("Inside Dep");
					//System.out.println(studentArray.length);
					
					for (int l = 0; l < studentArray.length; l++) {
						if (studentArray[l].getStudId() == studentid) {
						//	System.out.println("Inside student array ");
							tempStudent = studentArray[l];
							System.out.println(" Univerity in which he/she studies : "
									+ universities[i].getUniversityName() + " " + universities[i].getUniversityId());

							System.out.println(" His/ Her college :  " + collegeArray[j].getCollegeId() + " "
									+ collegeArray[j].getCollegeName());
							System.out.println(" His/ Her Department :" + departmentArray[k].getDeptId() + " "
									+ departmentArray[k].getDeptName());
						}

					}

				}
			}

		}
		return tempStudent;

	}

	@Override
	public Student[] searchstudentbyName(University[] universities, String studentname) {
		Student[] tempStudent = new Student[universities.length];
		int s=0;
		for (int i = 0; i < universities.length; i++) {
			College[] collegeArray = universities[i].getColleges();
			for (int j = 0; j < collegeArray.length; j++) {
				Department[] departmentArray = collegeArray[j].getDepartments();
				for (int k = 0; k < departmentArray.length; k++) {
					Student[] studentArray = departmentArray[k].getStudents();
					for (int l = 0; l < studentArray.length; l++) {
						if (studentArray[l].getStudName().equals(studentname)) {
							tempStudent[s] = studentArray[l];
							s=s+1;
							System.out.println(" Univerity in which he/she studies : "
									+ universities[i].getUniversityName() + " " + universities[i].getUniversityId());

							System.out.println(" His/ Her college :  " + collegeArray[j].getCollegeId() + " "
									+ collegeArray[j].getCollegeName());
							System.out.println(" His/ Her Department :" + departmentArray[k].getDeptId() + " "
									+ departmentArray[k].getDeptName());
						}

					}

				}
			}
		}
		return tempStudent;
	}
}