package com.seventh.seventh;

import jakarta.persistence.*;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	int id;
	int totalmarks;
	String usn;
	String name;
	String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalmarks() {
		return this.totalmarks;
	}

	public void setTotalmarks(int totalMarks) {
		this.totalmarks = totalMarks;
	}

	public String getUsn() {
		return this.usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", totalMarks=" + totalmarks + ", usn=" + usn + ", name=" + name + ", address="
				+ address + "]";
	}
	public Student() {
		
	}

}
	