package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class TestForwardController extends HttpServlet{
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("username");
		String pswd=req.getParameter("password");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print(" <b> Welcome to TestForwardController(Servlet1) <br>");
		//out.print("username received is "+uname + " </b> " );
		
		out.print("<br>");
		out.print("<br>");
		out.print("<br>");
		
		RequestDispatcher rd=req.getRequestDispatcher("/TestController");
		rd.forward(req, resp);
	}

}
