package com.bridgelabz.PreparedStatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class DeleteOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String query="delete from emp_data where emp_id=?";
		
		System.out.println("Enter the emp_id to delete the person..");
		int id=scanner.nextInt();
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		preparedStatement=(PreparedStatement) connection.prepareStatement(query);
		
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println("record deleted from table...");
		scanner.close();
		connection.close();
	}

}
