package com.bridgelabz.connectionTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection;
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			System.out.println("connection eshtablished successfully...");
			connection.close();
		} catch (Exception e) {
			System.out.println("connection not eshtablished ...");
			e.printStackTrace();
		}

	}

}
