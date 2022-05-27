package com.chainsys.minproject.pojo;

public class Doctor {
	private int doc_id;
	private String doc_name;
	private java.util.Date dob;
	private String speciality;
	private String city;
	private long phoneNo;
	private float standardFees;

	public int getDogId() {
		return doc_id;
	}

	public void setDogId(int patientId) {
		this.doc_id = patientId;
	}

	public String getDocName() {
		return doc_name;
	}

	public void setDogName(String patientName) {
		this.doc_name = patientName;
	}

	public java.util.Date getDob() {
		return dob;
	}

	public void setDob(java.util.Date newDate) {
		this.dob = newDate;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public float getStandardFees() {
		return standardFees;
	}

	public void setStandardFees(float standardFees) {
		this.standardFees = standardFees;
	}



	}
