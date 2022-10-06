package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Classes;


public interface AssignStudentService {
	public Integer addClasses(Classes classes);
    public List<Classes> getAllClassess();
}
