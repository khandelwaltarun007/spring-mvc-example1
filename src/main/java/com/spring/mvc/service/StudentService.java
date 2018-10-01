package com.spring.mvc.service;

import java.util.List;

import com.spring.mvc.model.Student;

public interface StudentService {
	void add(Student s);
	List<Student> getStudent();
}
