package com.softwareacademy.dao;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Classes;


public interface ClassesDao {
	public Integer addClasses(Classes classes);
    public boolean updateClasses(int ClassesId,String className);
    public boolean deleteClasses(int ClassesId);
    public Classes searchClasses(int ClassesId);
    public List<Classes> getAllClassess();
}
