package com.mapping.configure;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Confugure {


	public static SessionFactory factory;
	public static SessionFactory buildSessionFactory() {
		return factory;
	}

	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		factory=cfg.buildSessionFactory();
	}
}

