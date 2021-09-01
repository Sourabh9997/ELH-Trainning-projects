package com.dao;

import com.model.Student;
import com.model.University;

public interface StudentDao {

	public abstract Student searchstudentbyId(University[] universities, int studentid);

	public abstract Student[] searchstudentbyName(University[] universities, String studentname);
}
