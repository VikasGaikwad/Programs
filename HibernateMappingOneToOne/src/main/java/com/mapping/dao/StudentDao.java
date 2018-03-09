package com.mapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.configure.Confugure;
import com.mapping.dto.Student;

public class StudentDao {
	public static void saveStudent(Student stud) {
		SessionFactory sf=null;
		sf=Confugure.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(stud);
		tx.commit();
		session.close();
	}
}
