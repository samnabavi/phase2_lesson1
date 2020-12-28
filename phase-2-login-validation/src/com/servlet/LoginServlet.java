package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		String correctUserName = "samannabavi";
		String correctPassword = "password";
		response.setContentType("text/html");

		if( userName.equals(correctUserName) && password.equals(correctPassword)) {
			
			
			HttpSession session=request.getSession();  
	        session.setAttribute("use",userName);
			//request.setAttribute("use", userName);
			//request.setAttribute("pas", password);
	        request.getRequestDispatcher("SuccessfulLogin").include(request, response);			//response.sendRedirect("successful-login.html");
			
		} else {
			
			
			response.sendRedirect("failed-login.html");
			
		}
		
		
	}

}
