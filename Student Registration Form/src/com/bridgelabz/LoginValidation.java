package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginValidation extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String query="select * from stud_info where first_name=?";

		String fn=req.getParameter("username");
		String pw=req.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/common_data","root","root");
			ps=con.prepareStatement(query);
			
			ps.setString(1, fn);
			// ps.setString(2, pw);
			rs=ps.executeQuery();
			String user=rs.getString(1);
			String pass=rs.getString(6);
			System.out.println("user :"+user);
			System.out.println("pass :"+pass);
			System.out.println("result :"+rs);
			if(rs.next()) {
				
				System.out.println();
				/*RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
				rd.forward(req, resp);*/
			}
			else {
				out.println("incorrect credentials...");
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}


}
