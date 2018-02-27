package com.bridgelabz.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class TransactionManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the transaction id : ");
		int id=scanner.nextInt();
		System.out.println("enter transaction name : ");
		String st_name=scanner.next();
		System.out.println("enter the transaction time in minite : ");
		int time=scanner.nextInt();
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String query="insert into trans_info values(?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		connection.setAutoCommit(false);
		preparedStatement=(PreparedStatement) connection.prepareStatement(query);
		
		while(true) {
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, st_name);
			preparedStatement.setInt(3, time);
			preparedStatement.executeUpdate();
			System.out.println("1.commit\t2.rollback");
			String answer=scanner.next();
			if(answer.equals("commit")) {
				connection.commit();
			}
			if(answer.equals("rollback")) {
				connection.rollback();
			}
			System.out.println("want to add more records...Y/N...");
			String ans=scanner.next();
			if(ans.equals("n")) {
				break;
			}
		}
		connection.commit();
		System.out.println("record successfully saved...");
		connection.close();
	
		

	}

}
