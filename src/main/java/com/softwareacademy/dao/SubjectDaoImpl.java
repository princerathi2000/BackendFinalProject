package com.softwareacademy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Classes;
import com.softwareacademy.dto.Subject;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class SubjectDaoImpl implements SubjectDao{
	
private SessionFactory factory;
	
	public SubjectDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	public Integer addSubject(Subject Subject) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer customerId=(Integer) session.save(Subject);
		transaction.commit();
		session.close();
		return customerId;
	}

	public boolean updateSubject(int SubjectId, String address) {
		boolean type=false;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Subject subject=session.get(Subject.class,SubjectId);
		if(subject!=null)
		{
			subject.setSubjectName(address);
			session.update(subject);
			System.out.println(subject);
			type=true;
		}
		else
		{
			System.out.println("No Field found");
			type=false;
		}
		transaction.commit();
		session.close();
		
		return type;
		
	}

	public boolean deleteSubject(int SubjectId) {
		boolean type=false;
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Subject subject=session.get(Subject.class,SubjectId);
		if(subject!=null)
		{
			session.delete(subject);
			System.out.println("Deleted Successfully");
			type=true;
		}
		else
		{
			type=false;
			System.out.println("No Field found");
		}
		transaction.commit();
		session.close();
		
		return type;
	}

	public Subject searchSubject(int SubjectId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Subject subject=session.get(Subject.class,SubjectId);

		transaction.commit();
		session.close();
		
		return subject;
	}

	public List<Subject> getAllSubjects() {
		List<Subject> allSubject=new ArrayList<Subject>();
		Session session=factory.openSession();
		
		String hql="FROM Subject" ;
		TypedQuery<Subject> query=session.createQuery(hql);
		allSubject=query.getResultList();
		
		return allSubject;
	}

}
