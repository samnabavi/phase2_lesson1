package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class correctLogin
 */
@WebServlet("/SuccessfulLogin")
public class SuccessfulLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(); 
		String user = (String) session.getAttribute("use");
//		response.setContentType("text/html");
		out.println(user + ", you are successfuly logged in! " + "\n");
		out.println("</br>");
		out.print("<a href=" + "login.html" + ">Logout</a>");
		//out.print("<button onclick='login.html'>Logout</button>");
	}

}
