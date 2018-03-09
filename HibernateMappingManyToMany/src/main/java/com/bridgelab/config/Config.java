package com.bridgelab.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class Config {
	private static SessionFactory factory;
	public static SessionFactory buildSessionFactory() {
		return factory;
	}
	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
	}
}
