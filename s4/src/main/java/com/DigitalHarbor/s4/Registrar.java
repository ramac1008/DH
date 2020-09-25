package com.DigitalHarbor.s4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registrar {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDRegistrar;
	
	@Column(nullable = false)
	private long IDStudent;
	
	@Column(nullable = false)
	private String LastName;
	
	@Column(nullable = false)
	private String FirstName;

	
	@Column(nullable = false)
	private long IDCode;

	@Column(nullable = false)
	private String SignatureTitle;

	@Column(nullable = false)
	private String SignatureDescription;

	public long getIDRegistrar() {
		return IDRegistrar;
	}

	public void setIDRegistrar(long iDRegistrar) {
		IDRegistrar = iDRegistrar;
	}

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

	public long getIDCode() {
		return IDCode;
	}

	public void setIDCode(long iDCode) {
		IDCode = iDCode;
	}

	public String getSignatureTitle() {
		return SignatureTitle;
	}

	public void setSignatureTitle(String signatureTitle) {
		SignatureTitle = signatureTitle;
	}

	public String getSignatureDescription() {
		return SignatureDescription;
	}

	public void setSignatureDescription(String signatureDescription) {
		SignatureDescription = signatureDescription;
	}
}
