package com.bridgelabz.Collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.CallableStatement;

/**purpose: this class is used to update the database using store procedure.
 * @author bridgeit
 *@since: 23-feb-2018
 */
public class UpdateData {

	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement callableStatement = null;
		String procedure = "{call COLLABLE_UPDATE(?,?)}";

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the employee id : ");
		int id = scanner.nextInt();
		System.out.println("enter employee new address : ");
		String address = scanner.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			callableStatement = (CallableStatement) connection.prepareCall(procedure);
			callableStatement.setInt(1, id);
			callableStatement.setString(2, address);

			callableStatement.executeUpdate();
			System.out.println("Updation success...");
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		scanner.close();


	}

}
