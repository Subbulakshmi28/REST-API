package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Child {
	@Id
	private int babyId;
	private String babyFirstName;
	private String babylastName;
	private String fatherName;
	private String motherName;
	private String address;
	
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}
	public String getBabylastName() {
		return babylastName;
	}
	public void setBabylastName(String babylastName) {
		this.babylastName = babylastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Child [babyId=" + babyId + ", babyFirstName=" + babyFirstName + ", babylastName=" + babylastName
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", address=" + address + "]";
	}
	
	
	
}


