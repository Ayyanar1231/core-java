package com.chainsys.miniproject.ui;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.minproject.commonutil.InvalidInputDataException;
import com.chainsys.minproject.commonutil.Validator;
import com.chainsys.minproject.dao.EmployeeDao;
import com.chainsys.minproject.pojo.Employee;


public class EmployeeUI {
	public static void addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		Employee newemp = null;
		int result = 0;
		int empId = 0;
		String testname = null;
		try {
			newemp = new Employee();

			System.out.println("Enter Employee Id: ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setEMPLOYEE_ID(empId);
//--------------------------------
			System.out.println("Enter Employee FirstName: ");
			String fname = sc.nextLine();
			testname = fname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setFIRST_NAME(fname);
//-----------------------------------
			System.out.println("Enter Employee lastName: ");
			String lname = sc.nextLine();
			testname = fname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setLAST_NAME(lname);
//----------------------------------			
			System.out.println("Enter Employee Email: ");
			String email = sc.nextLine();
			try {
				Validator.checkMail(email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			newemp.setEmail(email);
//--------------------------------------			
			System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}

			newemp.setHIRE_DATE(newDate);
//----------------------------------------
			System.out.println("Enter Employee JobId: ");
			String jobId = sc.nextLine();
			try {
				Validator.checkjob(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setJOB_ID(jobId);
//---------------------------------------			
			System.out.println("Enter Employee Salary: ");
			String sal = sc.nextLine();
			try {
				Validator.checkStringForParse(sal);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			float salParse = Float.parseFloat(sal);
			try {
				Validator.checkSalLimit(salParse);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setSALARY(salParse);
//----------------------------------------------			
			result = EmployeeDao.insertEmployee(newemp);
			System.out.println(result + " Added Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void UpdateEmployee() {
		Scanner sc = new Scanner(System.in);
		Employee newemp = new Employee();
		int result = 0;
		try {

			System.out.println("Enter Employee Id: ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setEMPLOYEE_ID(empId);
//--------------------------------
			System.out.println("Enter Employee FirstName: ");
			String fname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setFIRST_NAME(fname);
//-----------------------------------
			System.out.println("Enter Employee lastName: ");
			String lname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setLAST_NAME(lname);
//----------------------------------			
			System.out.println("Enter Employee Email: ");
			String email = sc.nextLine();
			try {
				Validator.checkMail(email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			newemp.setEmail(email);
//--------------------------------------			
			System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			newemp.setHIRE_DATE(newDate);
//----------------------------------------
			System.out.println("Enter Employee JobId: ");
			String jobId = sc.nextLine();
			try {
				Validator.checkjob(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setJOB_ID(jobId);
//---------------------------------------			
			System.out.println("Enter Employee Salary: ");
			String sal = sc.nextLine();
			try {
				Validator.checkStringForParse(sal);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			float salParse = Float.parseFloat(sal);
			try {
				Validator.checkSalLimit(salParse);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setSALARY(salParse);
//----------------------------------------------	
			result = EmployeeDao.updateEmployee(newemp);
			System.out.println(result + " Updated Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void updateFirstnameOfEmployee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String id = null;
		String fname = null;
		try {
			System.out.println("Enter Employee Id: ");
			id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			emp.setEMPLOYEE_ID(empId);
			System.out.println("Enter Employee FirstName: ");
			fname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			result = EmployeeDao.updateEmployeeFirstName(empId, fname);
			System.out.println(result + " updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void updateSalaryOfEmployee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String id = null;
		String salary = null;
		try {
			System.out.println("Enter Employee Id: ");
			id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			System.out.println("Enter Salary: ");
			salary = sc.nextLine();
			try {
				Validator.checkStringForParse(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			float salParse = Float.parseFloat(salary);
			try {
				Validator.checkSalLimit(salParse);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}

			result = EmployeeDao.updateEmployeeSalary(empId, salParse);
			System.out.println(result + " updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String id = null;
		try {
			System.out.println("Enter Employee Id: ");
			id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			result = EmployeeDao.deleteEmployee(empId);
			System.out.println(result + " Deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void fetchEmployeeById() {
		Scanner sc = new Scanner(System.in);
		Employee result = new Employee();
		try {
			System.out.println("Enter Employee Id: ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}

			result = EmployeeDao.getEmployeeById(empId);
			System.out.println("Employee id: " + result.getEMPLOYEE_ID() + "\n" + "Employee first name: "
					+ result.getFIRST_NAME() + "\n" + "Employee last name: " + result.getLAST_NAME() + "\n"
					+ "Employee email: " + result.getEmail() + "\n" + "Employee hiredate: " + result.getHIRE_DATE()
					+ "\n" + "Employee job id: " + result.getJOB_ID() + "\n" + "Employee salary: " + result.getSALARY()
					+ "\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}// EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY

	public static void fetchAllEmployee() {
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee result = empIterator.next();
			System.out.println("Employee id: " + "\t" + "Employee first name: " + "\t" + "Employee last name: " + "\t"
					+ "Employee email: " + "\t" + "Employee hiredate: " + "\t" + "Employee job id: " + "\t"
					+ "Employee salary: " + "\t");
			System.out.println(
					"---------------------------------------------------------------------------------------------------");
			System.out.println(result.getEMPLOYEE_ID() + "\t" + result.getFIRST_NAME() + "\t" + result.getLAST_NAME() + "\t"
					+ result.getEmail() + "\t" + result.getHIRE_DATE() + "\t" + result.getJOB_ID() + "\t"
					+ result.getSALARY());
		}
	}

}
