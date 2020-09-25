package com.DigitalHarbor.s4;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDStudent;
	
	@Column(nullable = false)
	private String LastName;
	
	@Column(nullable = false)
	private String FirstName;

	public long getIDStudent() {
		return IDStudent;
	}

	public void setIDStudent(long iDStudent) {
		IDStudent = iDStudent;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

}