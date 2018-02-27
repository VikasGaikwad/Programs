package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericDemo extends GenericServlet{

	@Override
	public void init() throws ServletException {

	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String strName=req.getParameter("name");
		String strPassword=req.getParameter("password");

		if(strName.equals("vikas")&&(strPassword.equals("123"))) {
			out.println("<body bgcolor=green text=white>");//dynamnically creates form
			out.println("<h2>VALID</h2>");
		}
		else {
			out.println("<body> <h3> Login Validation </h3>");
			out.println("<form  method=get action = >");
		}
		if(strName.equals("vikas")) {
			out.println("Enter User Name <input type=text name=name value=" + strName + "> <br>");           
		}
		else
		{
			out.println("Enter User Name <input type=text  name=name> <br>");
		}
		if( strPassword.equals("123") )
		{
			out.println("Enter Password <input type=password name=t2 value=" + strPassword + "> <br>");
		}
		else
		{
			out.println("Enter Password <input type=password  name=password> <br>");                       
		}

		out.println("<input type=submit  value=Send>");
		out.println("</form> </body>");
		//out.close();
	}


}



