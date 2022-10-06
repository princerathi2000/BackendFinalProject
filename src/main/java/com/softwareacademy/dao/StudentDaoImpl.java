package com.softwareacademy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Student;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class StudentDaoImpl implements StudentDao{

	private SessionFactory factory;
	
	public StudentDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	public Integer addStudent(Student student) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer studentId=(Integer) session.save(student);
		System.out.println("DAO = "+studentId);
//		Integer customerId=(Integer) session.save(customer);
		transaction.commit();
		session.close();
		return studentId;
	}

	public boolean updateStudent(int StudentId, String address) {
		boolean type=false;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Student student=session.get(Student.class,StudentId);
		if(student!=null)
		{
			student.setStudentName(address);
			session.update(student);
			System.out.println(student);
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

	public boolean deleteStudent(int StudentId) {
		boolean type=false;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Student student=session.get(Student.class,StudentId);
		if(student!=null)
		{
			session.delete(student);
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

	public Student searchStudent(int StudentId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Student student=session.get(Student.class,StudentId);

		transaction.commit();
		session.close();
		
		return student;
		
//		Student student=null;
//		Session session=factory.openSession();
//		String hql="from student c where c.studentId="+StudentId;
//		TypedQuery<Student> query=session.createQuery(hql);
//		student=query.getSingleResult();
//		
//		return student;
	}

	public List<Student> getAllStudents() {
		List<Student> allStudent=new ArrayList<Student>();
		Session session=factory.openSession();
		
		String hql="FROM Student" ;
		TypedQuery<Student> query=session.createQuery(hql);
		allStudent=query.getResultList();
		
		return allStudent;
	}

}
