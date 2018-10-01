package com.spring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.mvc.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Student s) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("student saved");
		session.save(s);
		tx.commit();
	}

	@Override
	public List<Student> getStudent() {
		return null;
	}

}
