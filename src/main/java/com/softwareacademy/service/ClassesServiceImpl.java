package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dao.ClassesDao;
import com.softwareacademy.dao.ClassesDaoImpl;
import com.softwareacademy.dto.Classes;


public class ClassesServiceImpl implements ClassesService{

	private ClassesDao dao=null;
	
	public ClassesServiceImpl() {
		dao=new ClassesDaoImpl();
	}
	
	public Integer addClasses(Classes classes) {
		return dao.addClasses(classes);
	}

	public boolean updateClasses(int ClassesId, String className) {
		return dao.updateClasses(ClassesId, className);
	}

	public boolean deleteClasses(int ClassesId) {
		return dao.deleteClasses(ClassesId);
	}

	public Classes searchClasses(int ClassesId) {
		// TODO Auto-generated method stub
		return dao.searchClasses(ClassesId);
	}

	public List<Classes> getAllClassess() {
		// TODO Auto-generated method stub
		return dao.getAllClassess();
	}

}
