package com.DigitalHarbor.s4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Signature {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDCode;

	@Column(nullable = false)
	private String SignatureTitle;

	@Column(nullable = false)
	private String SignatureDescription;

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