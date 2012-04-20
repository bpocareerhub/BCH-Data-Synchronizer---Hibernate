package com.bch.runtime;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bch.bean.mappings.User;
import com.bch.bom.FactoryInstance;
import com.bch.bom.migration.UserMigrationBom;
import com.ryan.old.dao.IndustriesDao;
import com.ryan.old.models.Industries;

public class Main {
	
	private Session session;
	private Transaction transaction = null;
	public static void main(String[] args) {	
		
		Main m = new Main();
		m.executeMigration();
		
	}
	
	private boolean executeMigration() {
		boolean success = false;
		this.createSession();
		
		try {
			this.saveCareerSeekers();
			this.saveEmployerStaff();
			success = true;
		} catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return success;
	}
	
	private void createSession() {
		this.session = FactoryInstance.getInstance().openSession();
	}
	
	private void createTransaction() {
		this.transaction = this.session.beginTransaction();
	}
	
	private void saveCareerSeekers() {		
		
		UserMigrationBom umBom = new UserMigrationBom();
		ArrayList<User> users = umBom.buildCareerSeekers();
		
		this.createTransaction();
		
		for(Iterator<User> i = users.iterator(); i.hasNext();) {
			User user = i.next();
			this.session.save(user);
		}
		this.transaction.commit();
				
	}
	
	private void saveEmployerStaff() {
		
		UserMigrationBom umBom = new UserMigrationBom();
		ArrayList<User> users = umBom.buildEmployerStaff();

		this.createTransaction();
		
		for(Iterator<User> i = users.iterator(); i.hasNext();) {
			User user = i.next();
			this.session.save(user);
		}
		this.transaction.commit();
		
	}
}
