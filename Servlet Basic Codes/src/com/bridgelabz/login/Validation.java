package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String str1=request.getParameter("t1");
		String str2=request.getParameter("t2");
		System.out.println(str1);
		
		if(str1.equals("vikas")&& (str2.equals("123"))) {
			out.println("valid credentials...");
		}
		else {
			out.println("invalid credentials..");
		}
		out.close();
	}

}
