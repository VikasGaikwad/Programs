package com.bridgelabz.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**purpose : this class is used to perform operation on table using Batch Query.
 * @author bridgeit
 *@since: 23-02-2018
 */
public class BatchExample {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		String insertQuery="insert into stud_info values(3,'kishor','pune',40)";
		String UpdateQuery="update stud_info set stud_city='nashik' where stud_id=3";
		String DeleteQuery="delete from stud_info where stud_id=1";
		//String ReadQuery="select * from student_info";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem at loading driver class");
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			System.out.println("problem aoocured while eshtablishing the connection");		
			e.printStackTrace();
		}
		try {
			statement=(Statement) connection.createStatement();
			statement.addBatch(insertQuery);
			statement.addBatch(UpdateQuery);
			statement.addBatch(DeleteQuery);
			//statement.addBatch(ReadQuery);
			int [] batchArray=statement.executeBatch();
			for(int i:batchArray) {
				System.out.println(i+" row changes...");
				//statement.clearBatch();
				statement.close();
				connection.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}

}
