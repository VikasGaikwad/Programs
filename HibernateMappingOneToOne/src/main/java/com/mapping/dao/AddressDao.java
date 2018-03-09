package com.mapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.configure.Confugure;
import com.mapping.dto.Address;

public class AddressDao {
	public static void saveAddress(Address add) {
		SessionFactory sf=null;
		sf=Confugure.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(add);
		tx.commit();
		session.close();
	}
}
