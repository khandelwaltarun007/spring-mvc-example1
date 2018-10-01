package com.spring.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.dao.StudentDAO;
import com.spring.mvc.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDao;

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	@Transactional(readOnly = false)
	@Override
	public void add(Student s) {
		this.studentDao.add(s);
	}

	@Override
	public List<Student> getStudent() {
		return this.studentDao.getStudent();
	}

}
