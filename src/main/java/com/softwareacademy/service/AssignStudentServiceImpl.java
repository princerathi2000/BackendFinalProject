package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dao.AssignStudentDao;
import com.softwareacademy.dao.AssignStudentDaoImpl;
import com.softwareacademy.dao.StudentDao;
import com.softwareacademy.dao.StudentDaoImpl;
import com.softwareacademy.dto.AssignStudent;
import com.softwareacademy.dto.Student;


public class AssignStudentServiceImpl implements AssignStudentDao{

	private AssignStudentDao dao=null;
	
	public AssignStudentServiceImpl() {
		dao=new AssignStudentDaoImpl();
	}
	
	public Integer addAssignStudent(AssignStudent assignstudent) {
		return dao.addAssignStudent(assignstudent);
	}

	public List<AssignStudent> getAllAssignStudents() {
		// TODO Auto-generated method stub
		return dao.getAllAssignStudents();
	}


}
