package com.bridgelabz.firstProgram;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public FirstServlet() {
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ServletOutputStream out=response.getOutputStream();
		out.println("<html>");
		out.println("<head><title>first request</title></head>");
		out.println("<body>");
		out.println("<h2>hi vikas, this ur first interaction with servlet...");
		out.println("welcome to servlet world, vikas..");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
	

}
