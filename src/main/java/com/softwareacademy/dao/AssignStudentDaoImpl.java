package com.softwareacademy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.AssignStudent;
import com.softwareacademy.dto.Classes;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class AssignStudentDaoImpl implements AssignStudentDao{

	private SessionFactory factory;

	public AssignStudentDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}

	public Integer addAssignStudent(AssignStudent assignStudent) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer assignStudentId=(Integer) session.save(assignStudent);
//		Integer subjectId=(Integer) session.save(assignStudent);
		transaction.commit();
		session.close();
		return assignStudentId;
	}

//	public boolean updateClasses(int ClassesId, String address) {
//		boolean type=false;
//		Session session=factory.openSession();
//		Transaction transaction=session.beginTransaction();
//		
//		Classes classes=session.get(Classes.class,ClassesId);
//		if(classes!=null)
//		{
//			classes.setClassName(address);
//			session.update(classes);
//			System.out.println(classes);
//			type=true;
//		}
//		else
//		{
//			type=false;
//			System.out.println("No Field found");
//		}
//		transaction.commit();
//		session.close();
//		
//		return type;
//	}
//
//	public boolean deleteClasses(int ClassesId) {
//		boolean type=false;
//		Session session=factory.openSession();
//		Transaction transaction=session.beginTransaction();
//		
//		Classes classes=session.get(Classes.class,ClassesId);
//		if(classes!=null)
//		{
//			session.delete(classes);
//			System.out.println("Deleted Successfully");
//			type=true;
//		}
//		else
//		{
//			type=false;
//			System.out.println("No Field found");
//		}
//		transaction.commit();
//		session.close();
//		
//		return type;
//	}
//
//	public Classes searchClasses(int ClassesId) {
//		Session session=factory.openSession();
//		Transaction transaction=session.beginTransaction();
//		
//		Classes classes=session.get(Classes.class,ClassesId);
//
//		transaction.commit();
//		session.close();
//		
//		return classes;
//		
////		Classes classes=null;
////		Session session=factory.openSession();
////		String hql="from classes c where c.classId="+ClassesId;
////		TypedQuery<Classes> query=session.createQuery(hql);
////		classes=query.getSingleResult();
////		
////		return classes;
//	}



@Override
public List<AssignStudent> getAllAssignStudents() {
	List<AssignStudent> allClasses=new ArrayList<AssignStudent>();
	Session session=factory.openSession();
	
	String hql="FROM AssignStudent" ;
	TypedQuery<AssignStudent> query=session.createQuery(hql);
	allClasses=query.getResultList();
	
	return allClasses;
}

}
