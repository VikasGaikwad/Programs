package com.bridgelabz.PreparedStatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;

public class UpdateOperation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			String query="update emp_data set emp_id=? where emp_name=?";
			PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1	, 1200);
			preparedStatement.setString(2, "vikas");
			preparedStatement.executeUpdate();
			connection.close();
System.out.println("changes successfull");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
