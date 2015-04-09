package com.xavient.pas.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory factory;

	private void SessionFactory() {

	}

	public static SessionFactory getInstance() {
		if (factory == null) {
			getSessionFactory();
		}
		return factory;
	}

	private static void getSessionFactory() {
		try {

			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionfactory object " + ex);

		}
	}
}
