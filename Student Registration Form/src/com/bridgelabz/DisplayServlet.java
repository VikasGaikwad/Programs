package com.bridgelabz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection=null;
		Statement preparedStatement=null;
		ResultSet resultSet=null;
		String query="select * from stud_info";
		try {
			Class.forName("com.mysql.jdbc.Driver");


			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/common_data","root","root");


			preparedStatement= connection.createStatement();





			resultSet=preparedStatement.executeQuery(query);

			req.setAttribute("store", resultSet);
			RequestDispatcher rd=req.getRequestDispatcher("newPage.jsp");
			rd.forward(req, resp);

/*
			while(resultSet.next()) {

				int stud_id=resultSet.getInt("id");
				resultSet.getString("first_name");
				resultSet.getString("last_name");
				resultSet.getString("address");
				resultSet.getString("age");
				resultSet.getString("password");
				
			}*/
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}





