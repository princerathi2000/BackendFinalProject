package com.softwareacademy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classes")
public class Classes {
	
	@Id
	@Column(name="class_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int classId;
	
	@Column(name="class_name")
	private String className;
	
	public Classes() {}

	public Classes(String className) {
		super();
		this.className = className;
	}

	public Classes(int classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + "]";
	}
	
}
