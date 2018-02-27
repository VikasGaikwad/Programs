package com.bridgelabz.genericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("<html>");		
		pw.print("<body>");
		pw.print("<h2>Generic Servlet Example</h2>");
		pw.print("<p>when we exdends generic servlet class, compalsary override the service() method..</p>");
		pw.print("</body>");
		pw.print("</html>");
	}

}
