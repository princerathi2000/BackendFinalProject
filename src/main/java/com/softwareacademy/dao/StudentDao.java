package com.softwareacademy.dao;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Student;


public interface StudentDao {
	public Integer addStudent(Student classes);
    public boolean updateStudent(int StudentId,String studentName);
    public boolean deleteStudent(int StudentId);
    public Student searchStudent(int StudentId);
    public List<Student> getAllStudents();
}
