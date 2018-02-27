package com.bridgelabz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

@SuppressWarnings("serial")
public class Registration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String query = "insert into stud_info(id,first_name,last_name,address,age,password)values(?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/common_data", "root", "root");
			preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		} catch (Exception e) {
			System.out.println("query execution failed...");
			e.printStackTrace();
		}

		int id = Integer.parseInt(req.getParameter("id"));
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		String address = req.getParameter("address");
		int age = Integer.parseInt(req.getParameter("age"));
		String password = req.getParameter("password");
		try {
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			preparedStatement.setString(4, address);
			preparedStatement.setInt(5, age);
			preparedStatement.setString(6, password);
			int i = preparedStatement.executeUpdate();
			if (i != 0) {
				System.out.println("done..");
			} else {
				System.out.println("connection failed...");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
