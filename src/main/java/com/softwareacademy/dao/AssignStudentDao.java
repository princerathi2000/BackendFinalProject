package com.softwareacademy.dao;

import java.util.List;

import com.softwareacademy.dto.AssignStudent;

public interface AssignStudentDao {
	public Integer addAssignStudent(AssignStudent assignStudent);
    public List<AssignStudent> getAllAssignStudents();
}
