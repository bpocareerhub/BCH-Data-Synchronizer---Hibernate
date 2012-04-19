package com.bch.bom;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FactoryInstance {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	static {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getInstance() {
		return sessionFactory;
	}
}
