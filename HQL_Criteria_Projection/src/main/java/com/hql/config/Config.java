package com.hql.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

	public SessionFactory getSessionFactory()
	{
		Configuration cfg =new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}
