package com.chainsys.minproject.entry;

import java.io.InvalidClassException;
import java.util.Scanner;

import com.chainsys.miniproject.ui.AppointmentsUI;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUI;

public class Startup {
	public static void main(String[] args) throws InvalidClassException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.LoadEmploy11ee.");
		System.out.println("2.LoadDoctor.");
		System.out.println("3.LoadAppointments.");
		int call = sc.nextInt();
		switch (call) {
		case 1:
			LoadEmployee();
			break;
		case 2:
			LoadDoctor();
			break;
		case 3:
			LoadAppointments();
			break;
		}
	}

	private static void LoadEmployee() throws InvalidClassException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add New Employee.");
		System.out.println("2.Update Employee.");
		System.out.println("3.delete Employee.");
		System.out.println("4.Fetch Employee By Id.");
		System.out.println("5.Fetch All Employee.");
		System.out.println("6.Update Firstname Of Employee.");
		System.out.println("7.Update Salary Of Employee.");
		int call = sc.nextInt();
		switch (call) {
		case 1:
			EmployeeUI.addNewEmployee();
			break;
		case 2:
			EmployeeUI.UpdateEmployee();
			break;
		case 3:
			EmployeeUI.deleteEmployee();
			break;
		case 4:
			EmployeeUI.fetchEmployeeById();
			break;
		case 5:
			EmployeeUI.fetchAllEmployee();
			break;
		case 6:
			EmployeeUI.updateFirstnameOfEmployee();
			break;
		case 7:
			EmployeeUI.updateSalaryOfEmployee();
			break;
		}
	}

	private static void LoadDoctor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add New Doctor.");
		System.out.println("2.Delete Doctor details.");
		System.out.println("3.Update Doctor Details.");
		System.out.println("4.Update Doctor Name.");
		System.out.println("5.Update Standard Fees.");
		System.out.println("6.View All Doctor Details.");
		System.out.println("7.View Doctor Details By Id.");
		int call = sc.nextInt();
		switch (call) {
		case 1:
			DoctorUi.addNewDoctor();
			break;
		case 2:
			DoctorUi.deleteDoctordetails();
			break;
		case 3:
			DoctorUi.updateDoctorDetails();
			break;
		case 4:
			DoctorUi.updateDoctorName();
			break;
		case 5:
			DoctorUi.updateStandardFees();
			break;
		case 6:
			DoctorUi.ViewAllDoctorDetails();
			break;
		case 7:
			DoctorUi.viewDoctorDetailsById();
			break;
		}
	}

	private static void LoadAppointments() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add New Appointments.");
		System.out.println("2.All Appointment Details.");
		System.out.println("3.Delete Appointment Details.");
		System.out.println("4.Update Appointment Details.");
		System.out.println("5.View Appointment Details.");
		int call = sc.nextInt();
		switch (call) {
		case 1:
			AppointmentsUI.addNewAppointments();
			break;
		case 2:
			AppointmentsUI.allAppointmentDetails();
			break;
		case 3:
			AppointmentsUI.deleteAppointmentDetails();
			break;
		case 4:
			AppointmentsUI.updateAppointmentDetails();
			break;
		case 5:
			AppointmentsUI.viewAppointmentDetails();
			break;
		}
	}

}
