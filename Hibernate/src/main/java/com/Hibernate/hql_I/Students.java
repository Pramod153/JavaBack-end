package com.hibernate.hql_I;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int StudentId;
	private String StudentName;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	

}
