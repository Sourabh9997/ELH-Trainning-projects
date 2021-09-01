package com.service;

import com.model.Student;
import com.model.University;

public interface StudentService {
	public abstract Student searchstudentbyId(University[] universities ,int studentid);
	public abstract Student[] searchstudentbyName(University[] universities ,String studentname);
	}


