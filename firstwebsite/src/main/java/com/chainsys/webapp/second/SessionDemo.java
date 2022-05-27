package com.chainsys.webapp.second;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("service");
	/*String methodName = request.getMethod();
	System.out.println(methodName);
	if(methodName.equals("Post")) {
		doPost(request,response);
	}else{
		doGet(request,response);
	}*/
	HttpSession currentSession = request.getSession(true);
	int defaltTimeOut = currentSession.getMaxInactiveInterval();// defalut time out period in second
	System.out.println(defaltTimeOut);
	/*currentSession.setMaxInactiveInterval(0);// no timeout period if value is zero or less than zero.It is infinity.
	currentSession.setMaxInactiveInterval(5*60);// 5 is minutes and 60 is seconds.so total 300 seconds.
	defaltTimeOut = currentSession.getMaxInactiveInterval();// defalut time out period in second
	System.out.println(defaltTimeOut);*/
	
	}
}
