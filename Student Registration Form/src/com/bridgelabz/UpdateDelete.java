package com.bridgelabz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateDelete extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String f_name=req.getParameter("first_name");
	String l_name=req.getParameter("last_name");
	String  add=req.getParameter("address");
	int age=Integer.parseInt(req.getParameter("age"));
	String pswd=req.getParameter("password");
	
	String action=req.getParameter("action");
	
	Connection conn=null;
	PreparedStatement ps=null;
	String Updatequery="update stud_info set first_name=?,last_name=?,address=?,age=?,password=? where id=?";
	String DeleteQuery="delete from stud_info where id=?";
	
	
	if(action.equals("update")) {
		try {
			System.out.println("in update");
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/common_data","root","root");
			ps=conn.prepareStatement(Updatequery);
			
			ps.setString(1, f_name);
			ps.setString(2, l_name);
			ps.setString(3, add);
			ps.setInt(4, age);
			ps.setString(5, pswd);
			ps.setInt(6, id);
			
			ps.executeUpdate();
			System.out.println("update success...");
			resp.sendRedirect("registration.jsp");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	if(action.equals("delete")) {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/common_data","root","root");
			ps=conn.prepareStatement(DeleteQuery);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("delete success...");
			resp.sendRedirect("registration.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	}

}
