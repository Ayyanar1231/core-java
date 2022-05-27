package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GlobalState
 */
public class GlobalState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalState() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Attributes</title></head><body>");
		Enumeration<String> names =request.getParameterNames();
//		while(names.hasMoreElements()) {
//			String parameterName=names.nextElement();
//			System.out.println(parameterName);
//			String []  values=request.getParameterValues(parameterName);
//			int length=values.length;
//			for(int i=0;i<length;i++) {
//				System.out.println("Values :"+values[i]);
//			}
//		}
		
		//collection of strings
		
//		String submitValue = request.getParameter("submit");
//		ServletContext ctx=this.getServletContext(); //Get handle to servletContext maintained by Tomcat server 
//		if (submitValue.equals("set")) {
//			String salaryInput = request.getParameter("salary");
//			ctx.setAttribute("ctxsalary", salaryInput); //Storing data in servlet context for all users
//			//ctx.setAttribute() - Stores the data in a collection using key and value
//			//ctxsalary = key , salaryInput = value.
//			out.println("<h1>Value Set</h1>" + salaryInput);
//		} else if (submitValue.equals("fetch")) {
//			String contextSalary=ctx.getAttribute("ctxsalary").toString();
////			String sessionSalary=(String)session.getAttribute("salary");
//			if(contextSalary==null) {
//				out.println("<h1>SERVLETCONTEXT NOT SET!!!");
//			}
//			else {
//			out.println("<h1>Value Fetched</h1>" + contextSalary); //returning value from servletContext
//			}
//		}
		out.println("<input type='hidden' value='5000' name='bonus' id='bonus'/>");
		out.println("</body></html>");
//		data sored in servlet context is multiuser, and can be 
//		read or modified from all other servlets.

	}
	}


