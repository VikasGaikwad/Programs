package com.hql.main;

import java.util.Iterator;
import java.util.List;

import com.hql.dao.UserDAO;
import com.hql.dto.User;

public class Application {
	public static void main(String[] args) {
		UserDAO userdao=new UserDAO();
		User user = new User();

		//insert

		/*user.setId(3);
		 *user.setName("raja");*/		
		/*userdao.insertUser(user);*/
		/*******************************************/

		// update


		/*userdao.updateUser("raja", 1);*/

		/*******************************************/
		//display/retrive


		/*List<User> list=userdao.showUserDetails();
		for(User u:list) {
			System.out.println(u);
		}*/

		/*******************************************/
		//delete


		/*	userdao.deleteUser(4);*/


		/*******************************************/

		//criteria


		/*userdao.criteriaMethod();
		List<User> llist=userdao.criteriaMethod();

		for(User userdisplay:llist) {
			System.out.println(userdisplay);
		}*/

		
		List<User> list = userdao.projectionMethod();
		Iterator iterator = list.iterator();
		System.out.println("Name Column list: " );
		
		while (iterator.hasNext()) {
			String nameCol = (String) iterator.next();
			System.out.println(nameCol );
		}

	}

}
