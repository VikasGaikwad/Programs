package com.bridgelab.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgelab.config.Config;
import com.bridgelab.dto.Student;

public class StudentDao {
	public static void saveStudent(Student std1) {
		SessionFactory sf=null;
		sf=Config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(std1);
		 
		tx.commit();
		
		session.close();

}


}
