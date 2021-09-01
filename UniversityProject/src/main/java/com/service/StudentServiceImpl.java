package com.service;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;
import com.model.University;

public class StudentServiceImpl implements StudentService {
	
	@Override
	public Student searchstudentbyId(University[] universities, int studentid) {
		Student	tempStudent=null;
		if(universities != null) {
			//System.out.println(" Inside Service");
			StudentDao studentdao=new StudentDaoImpl();
			tempStudent=studentdao.searchstudentbyId(universities, studentid);
		}
		return tempStudent;
	}

	@Override
	public Student[] searchstudentbyName(University[] universities, String studentname) {
		Student[] tempStudent=null;
		if(universities != null) {
			StudentDao studentdao=new StudentDaoImpl();
			tempStudent=studentdao.searchstudentbyName(universities, studentname);
		
	}
return tempStudent;
	}
}
