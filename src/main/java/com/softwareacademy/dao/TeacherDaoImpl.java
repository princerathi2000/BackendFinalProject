package com.softwareacademy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Classes;
import com.softwareacademy.dto.Teacher;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class TeacherDaoImpl implements TeacherDao{

	private SessionFactory factory;
	
	public TeacherDaoImpl() {
		factory=new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	public Integer addTeacher(Teacher Teacher) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer teacher=(Integer) session.save(Teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	public List<Teacher> getAllTeachers() {
		List<Teacher> allTeacher=new ArrayList<Teacher>();
		Session session=factory.openSession();
		
		String hql="FROM Teacher" ;
		TypedQuery<Teacher> query=session.createQuery(hql);
		allTeacher=query.getResultList();
		
		return allTeacher;
	}

}
