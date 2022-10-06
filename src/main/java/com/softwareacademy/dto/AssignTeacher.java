package com.softwareacademy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assign_teacher")
public class AssignTeacher {
	
	@Id
	@Column(name="assign_teacher_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int assignTeacherId;

	@Column(name="assign_teacher_name")
	private String assignTeacherName;
	
	@Column(name="class_name")
	private String studentName;
	
	@Column(name="subject_name")
	private String subjectName;
	
	public AssignTeacher(){}

	public AssignTeacher(int assignTeacherId, String assignTeacherName, String studentName, String subjectName) {
		super();
		this.assignTeacherId = assignTeacherId;
		this.assignTeacherName = assignTeacherName;
		this.studentName = studentName;
		this.subjectName = subjectName;
	}

	public AssignTeacher(String assignTeacherName, String studentName, String subjectName) {
		super();
		this.assignTeacherName = assignTeacherName;
		this.studentName = studentName;
		this.subjectName = subjectName;
	}

	public int getAssignTeacherId() {
		return assignTeacherId;
	}

	public void setAssignTeacherId(int assignTeacherId) {
		this.assignTeacherId = assignTeacherId;
	}

	public String getAssignTeacherName() {
		return assignTeacherName;
	}

	public void setAssignTeacherName(String assignTeacherName) {
		this.assignTeacherName = assignTeacherName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
}