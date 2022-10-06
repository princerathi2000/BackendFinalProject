package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Student;


public interface StudentService {
	public Integer addStudent(Student Student);
    public boolean updateStudent(int StudentId,String studentName);
    public boolean deleteStudent(int StudentId);
    public Student searchStudent(int StudentId);
    public List<Student> getAllStudents();
}
