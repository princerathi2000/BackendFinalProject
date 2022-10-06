package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Teacher;


public interface TeacherService {
	public Integer addTeacher(Teacher Teacher);
    public boolean updateTeacher(int TeacherId,String address);
    public boolean deleteTeacher(int TeacherId);
    public Teacher searchTeacher(int TeacherId);
    public List<Teacher> getAllTeachers();
}
