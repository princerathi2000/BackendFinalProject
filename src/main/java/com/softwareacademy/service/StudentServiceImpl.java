package com.softwareacademy.service;

import java.util.List;

import com.softwareacademy.dao.StudentDao;
import com.softwareacademy.dao.StudentDaoImpl;
import com.softwareacademy.dto.Student;


public class StudentServiceImpl implements StudentService{

	private StudentDao dao=null;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}
	
	@Override
	public Integer addStudent(Student Student) {
		// TODO Auto-generated method stub
		return dao.addStudent(Student);
	}

	@Override
	public boolean updateStudent(int StudentId, String studentName) {
		// TODO Auto-generated method stub
		return dao.updateStudent(StudentId, studentName);
	}

	@Override
	public boolean deleteStudent(int StudentId) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(StudentId);
	}

	@Override
	public Student searchStudent(int StudentId) {
		// TODO Auto-generated method stub
		return dao.searchStudent(StudentId);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}

	

}
