package com.bridgelab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("userName");
		String p=req.getParameter("userPass");
		/*out.println(name);
		System.out.println(name);*/
		HttpSession session=req.getSession();
		session.setAttribute("s", name);
		session.setAttribute("pass", p);
		
		if(name.equals("vikas")) {
			RequestDispatcher rd=req.getRequestDispatcher("servlet2");
			rd.forward(req,resp);
		}
		else {
			out.print("username is incorrect...");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req,resp);
		}
	}
}
