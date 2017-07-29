package com.kapoopr.rest.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.StringUtils;

import com.kapoopr.rest.domain.Student;

public class TestSessionFactory {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Student getStudent(String rollNo) {
		return (Student) getSessionFactory().openSession()
				.createCriteria(Student.class)
				.add(Restrictions.eq("rollNo", Integer.parseInt(rollNo)))
				.uniqueResult();
	}
}
