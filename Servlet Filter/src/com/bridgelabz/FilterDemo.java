package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FilterDemo  implements Filter{
	public void init(FilterConfig config)throws ServletException {
		
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException,ServletException {
		PrintWriter out=res.getWriter();
		String password=req.getParameter("password");
		System.out.println("before filter invocation...");
		if(password.length()>6) {
			chain.doFilter(req, res);
			System.out.println("aftre filter invocation...");
		}
		else {
			System.out.println("filter invocation failed...");
			out.println("password authentication failed...");
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.include(req, res);
			
		}
	}
	public void destroy() {}

}
