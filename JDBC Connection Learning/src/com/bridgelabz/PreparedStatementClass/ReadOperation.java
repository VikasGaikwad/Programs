package com.bridgelabz.PreparedStatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

/**purpose : this class is used to read data from database by using PreparedStatement class.
 * @author bridgeit
 *@since : 22-feb-2018
 */
public class ReadOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String query="select * from emp_data";


		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		preparedStatement= (PreparedStatement) connection.prepareStatement(query);

		resultSet=preparedStatement.executeQuery();


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

		preparedStatement.close();
		connection.close();


	}

}
