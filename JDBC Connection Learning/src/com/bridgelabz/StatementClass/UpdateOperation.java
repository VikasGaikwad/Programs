package com.bridgelabz.StatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**purpose : this class is used to update the information to database
 * using Statement class.
 * @author bridgeit
 *@since: 21-feb-2018
 */
public class UpdateOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection=null;
		Statement statement=null;
		String query="update emp_data set emp_address='hydrabad' where emp_id=1200";
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		statement=(Statement) connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("updation success in database...");
		connection.close();

	}

}
