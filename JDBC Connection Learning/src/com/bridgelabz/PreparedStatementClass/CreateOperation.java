package com.bridgelabz.PreparedStatementClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

/**purpose: this class is used to insert the values into database using PreparedStatement class.
 * @author bridgeit
 * @since: 21-feb-2017
 *
 */
public class CreateOperation {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		String query="insert into emp_data(emp_id,emp_name,emp_address,emp_mobile)values(?,?,?,?)";


		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter employee id : ");
		int id=scanner.nextInt();

		System.out.println("enter the employee name :");
		String emp_name=scanner.next();

		System.out.println("enter the employee address :");
		String emp_address=scanner.next();

		System.out.println("enter the employee mobile number :");
		String emp_mobile=scanner.next();


		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

		preparedstatement=(PreparedStatement) connection.prepareStatement(query);

		preparedstatement.setInt(1, id);
		preparedstatement.setString(2, emp_name);
		preparedstatement.setString(3, emp_address);
		preparedstatement.setString(4, emp_mobile);
		
		
		int i=preparedstatement.executeUpdate();
		
		if(i!=0) {
			System.out.println("done...");
		}else {
			System.out.println("not done...");
		}
		
		
		scanner.close();
		connection.close();

	}

}
