package com.mapping.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_table")
public class Student implements Serializable{
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="sid")
	private int studentId;

	@Column(name="sname", length=10)
	private String studentName;

	@Column(name="grp",length=10)
	private String grp;

	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}