package com.bridgelab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	//String name=req.getParameter("userName");
	HttpSession session=req.getSession();
	String name=(String) session.getAttribute("s");
	out.print("welcome "+name);
	
	String passwd=(String) session.getAttribute("pass");
	out.println("\nyour password is... "+passwd);
	}

}
