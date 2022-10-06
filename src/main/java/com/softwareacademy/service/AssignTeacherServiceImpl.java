package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dao.AssignTeacherDao;
import com.softwareacademy.dao.AssignTeacherDaoImpl;
import com.softwareacademy.dto.AssignTeacher;



public class AssignTeacherServiceImpl implements AssignTeacherService{

	private AssignTeacherDao dao=null;
	
	public AssignTeacherServiceImpl() {
		dao=new AssignTeacherDaoImpl();
	}
	
	public Integer addAssignTeacher(AssignTeacher assignteacher) {
		return dao.addAssignTeacher(assignteacher);
	}

	public List<AssignTeacher> getAllAssignTeacher() {
		// TODO Auto-generated method stub
		return dao.getAllAssignTeacher();
	}

}
