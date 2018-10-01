package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.dao.StudentDAOImpl;
import com.spring.mvc.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDAOImpl studentDAOImpl;

	@RequestMapping(value = "/student")
	public String formStudent() {
		return "/student";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student) {
		studentDAOImpl.add(student);
		return "/student";
	}

	/*@RequestMapping(value="/addStudent", method=RequestMethod.GET)
	public String getStudent(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("students", this.studentDAOImpl);
		return "/student";
	}*/
}
