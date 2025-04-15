package com.hibernate.mapping_II;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Department {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Student> students;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Department(int deptId, String deptName, List<Student> students) {
//		super();
//		this.deptId = deptId;
//		this.deptName = deptName;
//		this.students = students;
//	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
