package com.bridgelabz.StatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**purpose : this class is used to read the data from database,
 * 				using Statement class.
 * @author bridgeit
 *@since- 21 feb 2018
 */
public class ReadOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection=null;
		Statement statement=null;
		String query="select * from emp_data";

		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

		statement=(Statement) connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		while(resultSet.next()) {
			int emp_id=resultSet.getInt("emp_id");
			String emp_name=resultSet.getString("emp_name");
			String emp_address=resultSet.getString("emp_address");
			String emp_mobile=resultSet.getString("emp_mobile");
			System.out.println("**********************************");
			System.out.println("emp id :"+emp_id);
			System.out.println("employee name : "+emp_name);
			System.out.println("employee address : "+emp_address);
			System.out.println("employee mobile : "+emp_mobile);
		}
		System.out.println("**********************************");
		System.out.println("data read success...");

		statement.close();
		connection.close();

	}

}
