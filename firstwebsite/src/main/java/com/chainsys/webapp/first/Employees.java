package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.minproject.commonutil.InvalidInputDataException;
//import com.chainsys.miniproject.commonutil.LogManager;
import com.chainsys.minproject.commonutil.Validator;
import com.chainsys.minproject.commonutil.ExceptionManager;
//import com.chainsys.miniproject.commonutil.HTMLHelper;
import com.chainsys.minproject.dao.EmployeeDao;
import com.chainsys.minproject.pojo.Employee;

/**
 * Servlet implementation class Employees
 */
public class Employees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Employees() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Employee> emplist = EmployeeDao.getAllEmployee();
		Iterator<Employee> empItr = emplist.iterator();
			response.setContentType("text/html");
			out.print("<html><head><title><Employees</title></head><body>");
			out.print("<table border=1px bgcolor=\"Red\" width=50%>");
			out.print("<tr bgcolor=\"LightSalmon\" align=center>");
			out.print("<th height=\"10\" width=\"90\">EMPLOYEE_ID:</th>");
			out.print("<th height=\"10\" width=\"90\">FIRST_NAME:</th>");
			out.print("<th height=\"10\" width=\"90\">LAST_NAME:</th>");
			out.print("<th height=\"10\" width=\"90\">Email:</th>");
			out.print("<th height=\"10\" width=\"90\">HIRE_DATE:</th>");
			out.print("<th height=\"10\" width=\"90\">JOB_ID:</th>");
			out.print("<th height=\"10\" width=\"90\">SALARY:</th>");
			while (empItr.hasNext()) {
				out.print("<tr align=center>");
				Employee emp = empItr.next();
				out.print("<td bgcolor=\"LightGreen\">" + emp.getEMPLOYEE_ID() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + emp.getFIRST_NAME() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + emp.getLAST_NAME() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + emp.getEmail() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + emp.getHIRE_DATE() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + emp.getJOB_ID() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + emp.getSALARY() + "</td>");
				out.print("</tr>");

			}
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("submit").equals("ADDEMPLOYEE")) {
			String source="AddNewEmployee";
			String message="<h1>Error while "+source+"</h1>";
			PrintWriter out = response.getWriter();
			Employee emp = new Employee();
			try {

				String emp_id = request.getParameter("id");
				try {
					Validator.checkStringForParse(emp_id);
				} catch (InvalidInputDataException e) {
					message +=" Error in Employee id input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return; // It terminates the Code execution beyond this point 
				}
				int id = Integer.parseInt(emp_id);
				try {
					Validator.CheckNumberForGreaterThanZero(id);
				} catch (InvalidInputDataException e) {
					message +=" Error in Employee id input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);					out.print(errorPage);
                   return;
				}
				emp.setEMPLOYEE_ID(id);

				String emp_Firstname = request.getParameter("fname");
				try {
					Validator.checkStringOnly(emp_Firstname);
				} catch (InvalidInputDataException e) {
					message +=" Error in First Name input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				emp.setFIRST_NAME(emp_Firstname);
				String emp_LastName = request.getParameter("Lname");
				try {
					Validator.checkStringOnly(emp_LastName);
				} catch (InvalidInputDataException e) {
					message +=" Error in Last Name input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				emp.setLAST_NAME(emp_LastName);
				String emp_email = request.getParameter("email");
				try {
					Validator.checkMail(emp_email);
				} catch (InvalidInputDataException e) {
					message +=" Error in email input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				emp.setEmail(emp_email);
				SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String emp_HireDate = request.getParameter("hdate");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				try {
					Validator.checkDateFormat(emp_HireDate);
				} catch (InvalidInputDataException e) {
					message +=" Error in Hire Date input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				try {
					emp.setHIRE_DATE(hire_dateFormate.parse(emp_HireDate));
				} catch (ParseException e) {
					message +=" Error in Hire Date input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				String emp_Job_id = request.getParameter("jobid");
				try {
					Validator.checkjob(emp_Job_id);
				} catch (InvalidInputDataException e) {
					message +=" Error in Job Id input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				emp.setJOB_ID(emp_Job_id);
				String emp_salary = null;
				try {
					emp_salary = request.getParameter("salary");
					Validator.checkStringOnly(emp_salary);
				} catch (InvalidInputDataException e) {
					message +=" Error in Salary input </p>";
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
                   return;
				}
				float salary = Float.parseFloat(emp_salary);
				emp.setSALARY(salary);
				int result = EmployeeDao.insertEmployee(emp);
				out.println(result + "row inserted");
			} catch (Exception e) {
				message +=" Error while inserting record </p>";
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
               return;
               }
			try {
				out.close();
			} catch (Exception e) {
				message +="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
               return;
			}
		}else if(request.getParameter("submit").equals("update")) {
			doPut(request,response);
		}else if(request.getParameter("submit").equals("Delete")) {
			doDelete(request,response);
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Employee emp = new Employee();
		try {

			String emp_id = request.getParameter("id");
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				System.out.println("Error:" + e.getMessage());

			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				out.println("Error in Id:" + e.getMessage());
			}
			emp.setEMPLOYEE_ID(id);

			String emp_Firstname = request.getParameter("fname");
			try {
				Validator.checkStringOnly(emp_Firstname);
			} catch (InvalidInputDataException e) {
				out.println("Error first name:" + e.getMessage());
			}
			emp.setFIRST_NAME(emp_Firstname);
			String emp_LastName = request.getParameter("Lname");
			try {
				Validator.checkStringOnly(emp_LastName);
			} catch (InvalidInputDataException e) {
				out.println("Error in Last name:" + e.getMessage());
			}
			emp.setLAST_NAME(emp_LastName);
			String emp_email = request.getParameter("email");
			try {
				Validator.checkMail(emp_email);
			} catch (InvalidInputDataException e) {
				out.println("Error in Email:" + e.getMessage());
			}
			emp.setEmail(emp_email);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				out.println("Error in Hire date:" + e.getMessage());
			}
			try {
				emp.setHIRE_DATE(hire_dateFormate.parse(emp_HireDate));
			} catch (ParseException e) {
				out.println("Error in Hire date:" + e.getMessage());
			}
			String emp_Job_id = request.getParameter("jobid");
			try {
				Validator.checkjob(emp_Job_id);
			} catch (InvalidInputDataException e) {
				out.println("Error in Job id:" + e.getMessage());
				
			}
			emp.setJOB_ID(emp_Job_id);
			String emp_salary = request.getParameter("salary");
			try {
				Validator.checkStringOnly(emp_HireDate);
			} catch (InvalidInputDataException e) {
				out.println("Error in salary:" + e.getMessage());
				
			}
			float salary = Float.parseFloat(emp_salary);
			emp.setSALARY(salary);
			int result = EmployeeDao.updateEmployee(emp);
			out.println(result + "row Updated");
		} catch (Exception e) {
			out.println("Error in some input data:" + e.getMessage());
		}
		try {
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String emp_id = request.getParameter("id");
		try {
			Validator.checkStringForParse(emp_id);
		} catch (InvalidInputDataException e) {
			out.println("Error in Id:" + e.getMessage());
		}
		int id = Integer.parseInt(emp_id);
		int result = EmployeeDao.deleteEmployee(id);
		out.println(result + "row deleted");
		try {
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
