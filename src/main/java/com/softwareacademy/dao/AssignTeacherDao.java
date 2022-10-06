package com.softwareacademy.dao;

import java.util.List;

import com.softwareacademy.dto.AssignTeacher;

public interface AssignTeacherDao {
	public Integer addAssignTeacher(AssignTeacher assignTeacher);
    public List<AssignTeacher> getAllAssignTeacher();
}
