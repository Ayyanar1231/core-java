package com.chainsys.hospitalproject.entry;

import java.util.Scanner;

import com.chainsys.minproject.test.TestAppointment;
import com.chainsys.minproject.test.TestDoctor;
import com.chainsys.minproject.ui.DoctorUI;

public class Startup {
	public static void main(String[] args) {
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("1.To Operation with doctor details");
//		System.out.println("2.To Operation with Appointment details");
//		int operation=sc.nextInt();
//		switch(operation) {
//		case 1:
//			DoctorUI.updateOldDoctor();
//			break;
//		case 2:
//			DoctorUI.addNewDoctor();;
//			break;
//		default:
//			System.out.println("enter valid number! please try again!");
//		}
//		sc.close();
	//	TestAppointment.testAppointmentInsert();
	//	TestDoctor.testUpdateDoctor();
	//	TestDoctor.testDeletePatientID();
//		DoctorUI.addNewDoctor();
	}
	private static void LoadEmployee()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select");
        int call=sc.nextInt();
        switch(call)
        {
        case 1:
            EmployeeUi.addNewEmployee();
            break;
        case 2:
            EmployeeUI.updateEmployeeFirstName();
            break;
        case 3:
            EmployeeUI.updateEmployeeSalary();
            break;
        case 4:
            EmployeeUI.getEmployeeById();
            break;
        case 5:
            EmployeeUI.getAllEmployeesDetails();
            break;
        case 6:
            EmployeeUI.deleteEmployee();
            break;
        }
    }
    private static void LoadDoctor() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select");
        int call=sc.nextInt();
        switch(call)
        {
        case 1:
            DoctorUI.addNewDoctor();
            break;
        case 2:
            DoctorUI.updateOldDoctor();
            break;
        case 3:
            DoctorUI.getDoctorById();
            break;
        case 4:
            DoctorUI.testGetAllDoctors();
            break;
        case 5:    
            DoctorUI.deleteOldDoctor();
            break;
        }
    }
    private static void LoadAppointments() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select");
        int call=sc.nextInt();
        switch(call)
        {
        case 1:
            AppointmentUI.addNewAppointment();
            break;
        case 2:
            AppointmentUI.updateAppointment();
            break;
        case 3:
            AppointmentUI.updatePatientName();
            break;
        case 4:
            AppointmentUI.updatePatientName();
            break;
        case 5:
            AppointmentUI.getPatientById();
            break;
        case 6:
            AppointmentUI.getAllAppointmentDetails();
            break;
        case 7:    
            AppointmentUI.deleteAppointment();
            break;
        }
    }
    

}
}
