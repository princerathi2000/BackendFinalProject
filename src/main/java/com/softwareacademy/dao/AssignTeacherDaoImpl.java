package com.softwareacademy.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.AssignTeacher;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class AssignTeacherDaoImpl implements AssignTeacherDao{

	private SessionFactory factory;

	public AssignTeacherDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}

	public Integer addAssignTeacher(AssignTeacher assignTeacher) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer assignTeacherId=(Integer) session.save(assignTeacher);
//		Integer subjectId=(Integer) session.save(assignStudent);
		transaction.commit();
		session.close();
		return assignTeacherId;
	}
	
	@Override
	public List<AssignTeacher> getAllAssignTeacher() {
		List<AssignTeacher> allteachers=new ArrayList<AssignTeacher>();
		Session session=factory.openSession();
		
		String hql="FROM AssignTeacher" ;
		TypedQuery<AssignTeacher> query=session.createQuery(hql);
		allteachers=query.getResultList();
		
		return allteachers;
	}

}
