package com.bridgelabz.StatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**purpose : this calss is used to delete the one record from table,
 * using Statement class.
 * @author bridgeit
 *@since: 22-feb-2018
 */
public class DeleteOperation {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Connection connection=null;
		Statement statement=null;
		String query="delete from emp_data where emp_id=1200";
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		statement=(Statement) connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("record deleted from table...");
		connection.close();

	}

}
