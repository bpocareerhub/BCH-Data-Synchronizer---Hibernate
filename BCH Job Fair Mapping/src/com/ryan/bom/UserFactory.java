package com.ryan.bom;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class UserFactory {
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory = null;

	static {
		
		try {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch(HibernateException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
