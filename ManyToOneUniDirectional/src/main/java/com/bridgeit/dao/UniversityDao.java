package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgeit.config.Config;
import com.bridgeit.dto.University;

public class UniversityDao {
	public static void saveUniversity(University university) {
		SessionFactory sf=null;
		sf=Config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(university);

		tx.commit();

		session.close();

	}
}
