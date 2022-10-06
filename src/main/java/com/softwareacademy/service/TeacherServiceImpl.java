package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dao.TeacherDao;
import com.softwareacademy.dao.TeacherDaoImpl;
import com.softwareacademy.dto.Teacher;


public class TeacherServiceImpl implements TeacherService{

	private TeacherDao dao=null;
	
	public TeacherServiceImpl() {
		dao=new TeacherDaoImpl();
	}
	
	public Integer addTeacher(Teacher Teacher) {
		return dao.addTeacher(Teacher);
	}

	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return dao.getAllTeachers();
	}

	@Override
	public boolean updateTeacher(int TeacherId, String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTeacher(int TeacherId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher searchTeacher(int TeacherId) {
		// TODO Auto-generated method stub
		return null;
	}

}
