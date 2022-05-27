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
import com.chainsys.minproject.commonutil.Validator;
import com.chainsys.minproject.dao.AppointmentDao;
import com.chainsys.minproject.pojo.Appointment;

/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<Appointment> applist = AppointmentDao.getAllAppoinments();
		Iterator<Appointment> appItr = applist.iterator();

		out.println("GET ALL APPOINTMENT DETAILS");
			response.setContentType("text/html");
			out.print("<html><head><title><Appointments</title></head><body>");
			out.print("<table border=1px bgcolor=\"Red\" width=50%>");
			out.print("<tr bgcolor=\"LightSalmon\" align=center>");
			out.print("<th height=\"10\" width=\"90\">id:</th>");
			out.print("<th height=\"10\" width=\"90\">appdate:</th>");
			out.print("<th height=\"10\" width=\"90\">docid:</th>");
			out.print("<th height=\"10\" width=\"90\">name:</th>");
			out.print("<th height=\"10\" width=\"90\">feeslevel:</th>");
			out.print("<th height=\"10\" width=\"90\">fees:</th>");
			while (appItr.hasNext()) {
				out.print("<tr align=center>");
				Appointment app = appItr.next();
				out.print("<td bgcolor=\"LightGreen\">" + app.getAppoint_Id() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + app.getAppoint_Date() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + app.getDoc_Id() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + app.getPatient_Name() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + app.getFees_Collected() + "</td>");
				out.print("<td bgcolor=\"LightGreen\">" + app.getFees_Amount() + "</td>");
				out.print("</tr>");
			}
		out.print("</body></html>");
	}

//-----------------------------------------------------------------------------------------------------------------------------------	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		  if (request.getParameter("change").equals("Update")) {
				doPut(request, response);
			} else if (request.getParameter("change").equals("Delete")) {
				doDelete(request, response);
			}
				else if (request.getParameter("change").equals("Add")) {
			int result = 0;
			int id =0;
			float fees =0;
			float feesLevel =0;
			PrintWriter out = response.getWriter();
			Appointment app = new Appointment();
			String app_id = request.getParameter("id");
			try {
				Validator.checkStringForParse(app_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();

			}
			id = Integer.parseInt(app_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}

			app.setAppoint_Id(id);

			SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
			String app_date = request.getParameter("appdate");
			try {
				Validator.checkDateFormat(app_date);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			try {
				app.setAppoint_Date(appFormate.parse(app_date));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String doc_Id = request.getParameter("docid");
			try {
				Validator.checkStringForParse(doc_Id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int doctor_id = Integer.parseInt(doc_Id);
			try {
				Validator.CheckNumberForGreaterThanZero(doctor_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setDoc_Id(doctor_id);

			String patient = request.getParameter("name");
			try {
				Validator.checkStringOnly(patient);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setPatient_Name(patient);
			String fees_collected = request.getParameter("feeslevel");
			try {
				Validator.checkStringForParse(fees_collected);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			feesLevel = Integer.parseInt(fees_collected);

			try {
				Validator.checkfee(feesLevel);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setFees_Collected(feesLevel);
			String feesAmount = request.getParameter("fees");
			try {
				Validator.checkStringForParse(feesAmount);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			fees = Integer.parseInt(feesAmount);

			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setFees_Amount(fees);
			result = AppointmentDao.insertAppointment(app);
			out.println("<div> Add New Appointment: " + result + "</div>");
			try {
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

//------------------------------------------------------------------------------------------------------------------------------------	

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	
		int result = 0;
		float fees =0;
		float feesLevel =0;
		Appointment app = new Appointment();
		String app_id = request.getParameter("id");
		try {
			Validator.checkStringForParse(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();

		}
		int id = Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}

		app.setAppoint_Id(id);

		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = request.getParameter("appdate");
		try {
			Validator.checkDateFormat(app_date);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		try {
			app.setAppoint_Date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String doc_Id = request.getParameter("docid");
		try {
			Validator.checkStringForParse(doc_Id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doctor_id = Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setDoc_Id(doctor_id);

		String patient = request.getParameter("name");
		try {
			Validator.checkStringOnly(patient);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setPatient_Name(patient);
		String fees_collected = request.getParameter("feeslevel");
		try {
			Validator.checkStringForParse(fees_collected);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		feesLevel = Integer.parseInt(fees_collected);

		try {
			Validator.checkfee(feesLevel);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_Collected(feesLevel);
		String fees_Amount = request.getParameter("fees");
		try {
			Validator.checkStringForParse(fees_Amount);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		fees = Integer.parseInt(fees_Amount);

		try {
			Validator.checkfee(fees);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_Amount(fees);

		result = AppointmentDao.updateAppointment(app);
		out.println("<div> Updated Appointment: " + result + "</div>");
		try {
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//--------------------------------------------------------------------------------------------------------------------------------------------	

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int result = 0;
		int empId =0;
		String id = null;
		
			id = request.getParameter("id");
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
			result = AppointmentDao.deleteAppointment(empId);
		    out.print("<div> Deleted Employee: " + result + "</div>");
	
	
}}
