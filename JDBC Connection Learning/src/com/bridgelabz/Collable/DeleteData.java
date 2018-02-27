package com.bridgelabz.Collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.CallableStatement;

/**purpose: this class is used to delete the table data using store procedure.
 * @author bridgeit
 *@since: 23-feb-2018
 */
public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the employee id to be delete : ");
		int emp_id=scanner.nextInt();
		Connection connection=null;
		CallableStatement callableStatement=null;
		String procedure="{call COLLABLE_DELETE(?)}";

		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		callableStatement=(CallableStatement) connection.prepareCall(procedure);
		callableStatement.setInt(1, emp_id);
		callableStatement.executeUpdate();
		System.out.println("record deleted successfully...");
		scanner.close();
		connection.close();
	}

}
