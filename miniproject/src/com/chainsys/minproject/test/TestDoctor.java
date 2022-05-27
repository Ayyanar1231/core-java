package com.chainsys.minproject.test;

import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.minproject.dao.DoctorDao;
import com.chainsys.minproject.pojo.Doctor;

public class TestDoctor {
	
	public static void main (String args[])
	{
		testInsertPatientName();
	}
	public static void testInsertPatientName() {
		Doctor newDoc = new Doctor();
		newDoc.setDogId(2);
		newDoc.setDogName("Omkumar");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newDoc.setDob(newDate);
		newDoc.setSpeciality("Skin");
		newDoc.setCity("Madurai");
		newDoc.setPhoneNo(111111111L);
		newDoc.setStandardFees(300);
		int result = DoctorDao.insertPatientName(newDoc);
		System.out.println("Insert Completed");
		System.out.println(result);
	}

	public static void testDeletePatientID() {
		int result = DoctorDao.deletePatientID(2);
		System.out.println(result);
		System.out.println("Patient Id deleted");
	}
	public static void testUpdateDoctor() {
	    Doctor oldDoctor = DoctorDao.getDoctorById(2);
	    System.out.println(oldDoctor.getDogId()+" "+oldDoctor.getDocName()+" "+oldDoctor.getStandardFees());
	    oldDoctor.setDogName("deepa");
	    Calendar c1 = Calendar.getInstance();
	    java.util.Date newDate =c1.getTime();
	    oldDoctor.setDob(newDate);
	    oldDoctor.setCity("Trichy");
	    oldDoctor.setSpeciality("Neurologist");
	    oldDoctor.setPhoneNo(9875456748L);
	    oldDoctor.setStandardFees(40000);
	    int result = DoctorDao.updateDoctor(oldDoctor);
	    System.out.println(result);
	    
	}
	public static void testGetPAtientById() {
		Doctor doc = DoctorDao.getDoctorById(2);
		System.out.println(doc.getDogId() + " " + doc.getDocName() + " " + doc.getCity());
	}
	public static void testGetAllDoctors() {
	    List<Doctor> allDoctors = DoctorDao.getAllDoctor();
	    Iterator<Doctor> docIterator = allDoctors.iterator();
	    while(docIterator.hasNext()) {
	        Doctor doc = docIterator.next();
	        System.out.println(doc.getDogId()+" "+doc.getDocName()+" "+doc.getStandardFees());
	    }
}}


