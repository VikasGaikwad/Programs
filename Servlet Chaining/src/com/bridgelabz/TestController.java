package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("username");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print(" <b> Welcome to TestController(Servlet2) <br>");
		out.print("username received is "+uname + " </b> " );

	}
}
