package com.softwareacademy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assign_student")
public class AssignStudent {
	
	@Id
	@Column(name="assign_student_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int assignStudentId;
	
	public AssignStudent(int assignStudentId, String studentId, String subjectId) {
		super();
		this.assignStudentId = assignStudentId;
		this.studentId = studentId;
		this.subjectId = subjectId;
	}

	@Column(name="student_id")
	private String studentId;
	
	@Column(name="subject_id")
	private String subjectId;
	
	public AssignStudent() {}

	public AssignStudent(String studentId, String subjectId) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public int getAssignStudentId() {
		return assignStudentId;
	}

	public void setAssignStudentId(int assignStudentId) {
		this.assignStudentId = assignStudentId;
	}

	@Override
	public String toString() {
		return "AssignStudent [studentId=" + studentId + ", subjectId=" + subjectId + "]";
	}
	
}
