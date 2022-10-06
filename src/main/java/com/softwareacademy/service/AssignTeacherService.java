package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.AssignTeacher;
import com.softwareacademy.dto.Classes;


public interface AssignTeacherService {
	public Integer addAssignTeacher(AssignTeacher assignTeacher);
    public List<AssignTeacher> getAllAssignTeacher();
}
