package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dao.SubjectDao;
import com.softwareacademy.dao.SubjectDaoImpl;
import com.softwareacademy.dto.Subject;


public class SubjectServiceImpl implements SubjectService{
	
	private SubjectDao dao=null;
	
	public SubjectServiceImpl() {
		dao=new SubjectDaoImpl();
	}
	
	public Integer addSubject(Subject Subject) {
		return dao.addSubject(Subject);
	}

	public boolean updateSubject(int SubjectId, String address) {
		return dao.updateSubject(SubjectId, address);
		
	}

	public boolean deleteSubject(int SubjectId) {
		return dao.deleteSubject(SubjectId);
		
	}

	public Subject searchSubject(int SubjectId) {
		// TODO Auto-generated method stub
		return dao.searchSubject(SubjectId);
	}

	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return dao.getAllSubjects();
	}

}
