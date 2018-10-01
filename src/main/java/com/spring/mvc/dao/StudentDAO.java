package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.model.Student;

public interface StudentDAO {
	void add(Student s);
	List<Student> getStudent();
}
