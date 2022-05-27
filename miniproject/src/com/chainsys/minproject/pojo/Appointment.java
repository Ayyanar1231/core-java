package com.chainsys.minproject.pojo;

import java.util.Date;

public class Appointment {
	private int appoint_Id;
	private Date appoint_Date;
	private int doc_Id;
	private String patient_Name;
	private float fees_Collected;
	private float fees_Amount;

	

	public int getAppoint_Id() {
		return appoint_Id;
	}

	public void setAppoint_Id(int appoint_Id) {
		this.appoint_Id = appoint_Id;
	}

	public Date getAppoint_Date() {
		return appoint_Date;
	}

	public void setAppoint_Date(Date appoint_Date) {
		this.appoint_Date = appoint_Date;
	}

	public int getDoc_Id() {
		return doc_Id;
	}

	public void setDoc_Id(int doc_Id) {
		this.doc_Id = doc_Id;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public float getFees_Collected() {
		return fees_Collected;
	}

	public void setFees_Collected(float i) {
		this.fees_Collected = i;
	}

	public float getFees_Amount() {
		return fees_Amount;
	}

	public void setFees_Amount(float fees_Amount) {
		this.fees_Amount = fees_Amount;
	}
	

	



	
}
