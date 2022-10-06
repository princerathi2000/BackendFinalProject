package com.softwareacademy.dao;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Teacher;


public interface TeacherDao {
	public Integer addTeacher(Teacher Teacher);
    public List<Teacher> getAllTeachers();
}
