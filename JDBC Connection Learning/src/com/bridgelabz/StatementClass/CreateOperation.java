package com.bridgelabz.StatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**purpose:-this class is used to insert data into database using insert(),
 * and Statement class.
 * @author bridgeit
 *@since: 22-feb-2018
 */
public class CreateOperation {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection conn=null;
		Statement st =null;
		String query="insert into emp_data values(236,'raja','delhi','756756756')";


		Class.forName("com.mysql.jdbc.Driver");

		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

		st=conn.createStatement();
		st.executeUpdate(query);
		System.out.println("values inserted successfully...");
		conn.close();
	}

}
