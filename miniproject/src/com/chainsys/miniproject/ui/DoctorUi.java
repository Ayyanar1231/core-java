package com.chainsys.miniproject.ui;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.minproject.commonutil.InvalidInputDataException;
import com.chainsys.minproject.commonutil.Validator;
import com.chainsys.minproject.dao.DoctorDao;
import com.chainsys.minproject.pojo.Doctor;



public class DoctorUi {
 
	public static void addNewDoctor() {

		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParse(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int doctor_id=Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setDogId(doctor_id);
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setDogName(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setSpeciality(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setCity(city);
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
//			Validator.(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setPhoneNo(Long.parseLong(phone));
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		try {
			Validator.checkfee(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setStandardFees(std_fees);
		int result = DoctorDao.insertPatientName(doc);
		System.out.println(result + "row inserted");
		sc.close();
	}

	public static void viewDoctorDetailsById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Doctor id:");
		int doc_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		Doctor doc = DoctorDao.getDoctorById(doc_id);
		System.out.println("Doctor id:" + doc.getDogId());
		System.out.println("Doctor Name:" + doc.getDocName());
		System.out.println("Date of birth:" + doc.getDob());
		System.out.println("Speciality:" + doc.getSpeciality());
		System.out.println("phone number:" + doc.getPhoneNo());
		System.out.println("Standard fees:" + doc.getStandardFees());
		sc.close();
	}
	public static void ViewAllDoctorDetails() {
		List<Doctor> doclist =DoctorDao.getAllDoctor();
		Iterator<Doctor> docItr=doclist.iterator();
		while(docItr.hasNext()) {
			Doctor doc=docItr.next();
			System.out.println("doc id:"+doc.getDogId()+"doctor name :"+doc.getDocName()+"	speciality :"+doc.getSpeciality()+"    phone_no :"+doc.getPhoneNo()+" "
					+ "		city :"+doc.getCity());
		}
	}
	public static void updateDoctorDetails() {
		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParse(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int doctor_id=Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setDogId(doctor_id);
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setDogName(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setSpeciality(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(city);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setCity(city);
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setPhoneNo(Long.parseLong(phone));
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		try {
			Validator.checkfee(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setStandardFees(std_fees);
		int result = DoctorDao.updateDoctor(doc);
		System.out.println(result + "row updated");
		sc.close();
	}
	public static void deleteDoctordetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int result = DoctorDao.deletePatientID(doc_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updateDoctorName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Name:");
		String doc_name=sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int result=DoctorDao.updateDoctor(doc_id,doc_name);
		System.out.println(result+" row updated");
		sc.close();
	}
	public static void updateStandardFees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Salary:");
		float doc_salary=sc.nextFloat();
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		int result=DoctorDao.updateStandardFees(doc_id,doc_salary);
		System.out.println(result+" row updated");
		sc.close();
	}


}