package com.bridgelabz.Collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.CallableStatement;

public class InsertData {
	public static void main(String args[]) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Connection connection = null;
		CallableStatement collableStatement = null;
		String procedure = "{ call proc.firstProc}";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded and Registered..");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			collableStatement = (CallableStatement) connection.prepareCall(procedure);
			ResultSet resultSet=collableStatement.executeQuery(procedure);
			while(resultSet.next()) {
				int emp_id=resultSet.getInt("id");
				String emp_name=resultSet.getString("name");
				String emp_address=resultSet.getString("city");
				//String emp_mobile=resultSet.getString("emp_mobile");
				System.out.println("**********************************");
				System.out.println("emp id :"+emp_id);
				System.out.println("employee name : "+emp_name);
				System.out.println("employee address : "+emp_address);
				//System.out.println("employee mobile : "+emp_mobile);
			}
			System.out.println("**********************************");
			System.out.println("data read successfully...");

			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		collableStatement.close();
		connection.close();
		scanner.close();
		
	}

}

