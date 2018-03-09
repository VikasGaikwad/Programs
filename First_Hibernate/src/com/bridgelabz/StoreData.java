package com.bridgelabz;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class StoreData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee e=new Employee();
		e.setId(1);
		e.setName("vikas");
		e.setCity("shirdi");
		e.setPin_code(423402);
		e.setAge(26);
		e.setCountry("india");
		
		session.persist(e);
		t.commit();
		System.out.println("stored successfully...");
		
	}

}
