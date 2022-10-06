package com.softwareacademy.service;

import java.util.List;
import java.util.Set;

import com.softwareacademy.dto.Subject;


public interface SubjectService {
	public Integer addSubject(Subject Subject);
    public boolean updateSubject(int SubjectId,String address);
    public boolean deleteSubject(int SubjectId);
    public Subject searchSubject(int SubjectId);
    public List<Subject> getAllSubjects();
}
