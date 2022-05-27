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
import com.chainsys.minproject.dao.DoctorDao;
import com.chainsys.minproject.pojo.Doctor;


/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Doctors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        List<Doctor> doclist =DoctorDao.getAllDoctor();
		Iterator<Doctor> docItr=doclist.iterator();
		
//		if(request.getParameter("input").equals("yes")) {
			response.setContentType("text/html");
			out.print("<html><head><title><Doctors</title></head><body>");
			out.print("<table border=1px bgcolor=\"Red\" width=50%>");
			out.print( "<tr bgcolor=\"LightSalmon\" align=center>");
			out.print("<th height=\"10\" width=\"90\">id:</th>");
			out.print("<th height=\"10\" width=\"90\">name:</th>");
			out.print("<th height=\"10\" width=\"90\">speciality:</th>");
			out.print("<th height=\"10\" width=\"90\">city:</th>");
			out.print("<th height=\"10\" width=\"90\">phone_no:</th>");
			out.print("<th height=\"10\" width=\"90\">dob:</th>");
			out.print("<th height=\"10\" width=\"90\">fees:</th>");
		while(docItr.hasNext()) {
			out.print("<tr align=center>");
			Doctor doc=docItr.next();
			out.print("<td bgcolor=\"LightGreen\">"+doc.getDogId()+"</td>");
			out.print("<td bgcolor=\"LightGreen\">"+doc.getDocName()+"</td>");
			out.print("<td bgcolor=\"LightGreen\">"+doc.getSpeciality()+"</td>");
			out.print("<td bgcolor=\"LightGreen\">"+doc.getCity()+"</td>");
			out.print("<td bgcolor=\"LightGreen\">"+doc.getPhoneNo()+"</td>");
			out.print("<td bgcolor=\"LightGreen\">"+doc.getDob()+"</td>");
			out.print("<td bgcolor=\"LightGreen\">"+doc.getStandardFees()+"</td>");
			out.print("</tr>");			
		}
//		}else 
//			out.println(" <br><h3>thank you for processing with us</h3>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int result=0;
		String submitValue = request.getParameter("change");
		if (submitValue.equals("Update")) {
			doPut(request, response);
		} else if (submitValue.equals("Delete")) {
			doDelete(request, response);
		} else if (submitValue.equals("Add")) {
		Doctor doc = new Doctor();
		String doc_id = request.getParameter("id");
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
		String doc_name = request.getParameter("name");
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setDogName(doc_name);
		String dob = request.getParameter("dob");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			doc.setDob(dobFormate.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		String speciality = request.getParameter("speciality");
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setSpeciality(speciality);
		String city = request.getParameter("city");
		try {
			Validator.checkStringOnly(city);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setCity(city);
		String ph_no = request.getParameter("phone_no");
		try {
			Validator.checklengthOfPhno(ph_no);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setPhoneNo(Long.parseLong(ph_no));
		String std_fees = request.getParameter("fees");
		try {
			Validator.checkForNull(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		float fees=Float.parseFloat(std_fees);
        doc.setStandardFees(fees);
		
	    result = DoctorDao.insertPatientName(doc);
	    out.println("<div> Add New Doctor: " + result + "</div>");
		}
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int result =0;
		Doctor doc = new Doctor();
		String doc_id = request.getParameter("id");
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
		String doc_name = request.getParameter("name");
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setDogName(doc_name);
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = request.getParameter("dob");
		try {
			Validator.checkDateFormat(Dob);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		String speciality = request.getParameter("speciality");
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setSpeciality(speciality);
		String city = request.getParameter("city");
		try {
			Validator.checkStringOnly(city);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setCity(city);
		String phone = request.getParameter("phone_no");
		try {
			Validator.checklengthOfPhno(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setPhoneNo(Long.parseLong(phone));
		String std_fees = request.getParameter("fees");
		try {
			Validator.checkStringForParse(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int fees=Integer.parseInt(std_fees);
		doc.setStandardFees(fees);
		result = DoctorDao.updateDoctor(doc);
		out.println("<div> Updated Doctor: " + result + "</div>");
		try {
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);	
		}
	}
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
			result = DoctorDao.deletePatientID(empId);
		    out.print("<div> Deleted Employee: " + result + "</div>");
	
	
}}
