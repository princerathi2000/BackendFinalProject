package com.softwareacademy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Classes;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class ClassesDaoImpl implements ClassesDao{

	private SessionFactory factory;
	
	public ClassesDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	public Integer addClasses(Classes classes) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer classId=(Integer) session.save(classes);
//		Integer customerId=(Integer) session.save(customer);
		transaction.commit();
		session.close();
		return classId;
	}

	public boolean updateClasses(int ClassesId, String address) {
		boolean type=false;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Classes classes=session.get(Classes.class,ClassesId);
		if(classes!=null)
		{
			classes.setClassName(address);
			session.update(classes);
			System.out.println(classes);
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

	public boolean deleteClasses(int ClassesId) {
		boolean type=false;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Classes classes=session.get(Classes.class,ClassesId);
		if(classes!=null)
		{
			session.delete(classes);
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

	public Classes searchClasses(int ClassesId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Classes classes=session.get(Classes.class,ClassesId);

		transaction.commit();
		session.close();
		
		return classes;
		
//		Classes classes=null;
//		Session session=factory.openSession();
//		String hql="from classes c where c.classId="+ClassesId;
//		TypedQuery<Classes> query=session.createQuery(hql);
//		classes=query.getSingleResult();
//		
//		return classes;
	}

	public List<Classes> getAllClassess() {
		List<Classes> allClasses=new ArrayList<Classes>();
		Session session=factory.openSession();
		
		String hql="FROM Classes" ;
		TypedQuery<Classes> query=session.createQuery(hql);
		allClasses=query.getResultList();
		
		return allClasses;
	}

}
