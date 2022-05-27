package com.chainsys.minproject.test;


	import java.util.Calendar;
	import java.util.Iterator;
	import java.util.List;

import com.chainsys.minproject.dao.AppointmentDao;
import com.chainsys.minproject.pojo.Appointment;


	public class TestAppointment {

	   public static void testAppointmentInsert() {
		   Appointment newap =new Appointment();
		   newap.setAppoint_Id(3232);
		   Calendar c1 =Calendar.getInstance();
		   	java.util.Date newDate =new java.util.Date();
		   newap.setAppoint_Date(newDate);
		   newap.setDoc_Id(555);
		   newap.setPatient_Name("bruce");
		   newap.setFees_Collected(300);
		   newap.setFees_Amount(1000f);
		   int result=AppointmentDao.insertAppointment(newap);
		   System.out.println(result);
	   }
	   public static void testUpdateAppointment() {
		   Appointment newap =new Appointment();
		   newap.setAppoint_Id(12);
		   Calendar c1 =Calendar.getInstance();
		   	java.util.Date newDate =new java.util.Date();
		   newap.setAppoint_Date(newDate);
		   newap.setDoc_Id(555);
		   newap.setPatient_Name("bruce");
		   newap.setFees_Collected(400);
		   newap.setFees_Amount(500f);
		   int result=AppointmentDao.updateAppointment(newap);
		   System.out.println(result);
	   }
	   
	   public static void testUpdatePatientName() {
		   Appointment newap =new Appointment();
		   newap.setAppoint_Id(3232);
		   newap.setPatient_Name("das");
		   int result =AppointmentDao.updatePatientName(3232," das");
		   System.out.println(result);
	   }
	   
	   public static void testUpdateFeesCollected() {
		   Appointment newap =new Appointment();
		   newap.setAppoint_Id(3232);
		   newap.setFees_Collected(500);
		   int result =AppointmentDao.updateFeesCollected(3232,500);
		   System.out.println(result);
	   }
	   
	   public static void testDeleteAppointment() {
		   Appointment newap =new Appointment();
		   newap.setAppoint_Id(3232);
		   int result =AppointmentDao.deleteAppointment(3232);
		   System.out.println(result);
	   }
	   
	   public static void testGetPatientById() {
		   Appointment result =AppointmentDao.getPatientById(2324);
		 	System.out.println(result.getAppoint_Id()+" "+result.getAppoint_Date()+" "+result.getDoc_Id()+" "+result.getPatient_Name()+" "+result.getFees_Collected());
	   }
	   public static void testGetAllAppointmentDetails() {
		   List<Appointment> allAppointments =AppointmentDao.getAllAppoinments();
		  	 Iterator <Appointment> apIterator = allAppointments.iterator();
		  	 while(apIterator.hasNext()) {
		  		 Appointment ap =apIterator.next();
		  		System.out.println(ap.getAppoint_Id()+" "+ap.getAppoint_Date()+" "+ap.getDoc_Id()+" "+ap.getPatient_Name()+" "+ap.getFees_Collected());
		  	 }
	   }
	   
	}


