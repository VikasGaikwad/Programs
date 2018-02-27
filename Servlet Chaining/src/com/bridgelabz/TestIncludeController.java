package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestIncludeController
 */

public class TestIncludeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname=req.getParameter("username");
		String pswd=req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<b>welcome to Test Include Controller (servlet1)<br>");
		out.print("username recieved as : "+uname+"</b>");
		out.print("<br><br>");
		
		RequestDispatcher dis=req.getRequestDispatcher("/TestController");
		dis.include(req	, resp);
		
	}

}
