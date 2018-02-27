package com.bridgelabz.Collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.CallableStatement;

/**purpose: this class is used to insert the data into database using store procedure.
 * @author bridgeit
 *@since: 23-feb-2018
 */
public class CreateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the employee id : ");
		int emp_id=scanner.nextInt();
		System.out.println("enter employee name : ");
		String emp_name=scanner.next();
		System.out.println("enter employee address : ");
		String emp_address=scanner.next();
		System.out.println("enter employee mobile number : ");
		String emp_mobile=scanner.next();
		
		
		
		Connection connection=null;
		CallableStatement callableStatement=null;
		String procedure="{call COLLABLE_CREATE(?,?,?,?)}";

		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		callableStatement=(CallableStatement) connection.prepareCall(procedure);

		callableStatement.setInt(1, emp_id);
		callableStatement.setString(2, emp_name);
		callableStatement.setString(3, emp_address);
		callableStatement.setString(4, emp_mobile);
		
		callableStatement.executeUpdate();
		System.out.println("inserted successfully...");
		scanner.close();
		connection.close();

	}

}
