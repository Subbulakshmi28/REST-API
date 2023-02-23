package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String studentName;
	private String departmentName;
	private String mailid;
	public int getId() {
		return id;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailis(String mailid) {
		this.mailid = mailid;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", departmentName=" + departmentName + ", mailid="
				+ mailid + "]";
	}
	
	
}



