package com.bch.runtime;

import java.util.ArrayList;
import java.util.Iterator;

import com.bch.bom.migration.EmployerMigrationBom;
import com.bch.bom.migration.UserMigrationBom;
import com.ryan.old.dao.ApplicantProfessionalBackgroundDao;
import com.ryan.old.models.ApplicantProfessionalBackground;

public class Main {
	public static void main(String[] args) {
		
		EmployerMigrationBom emBom = new EmployerMigrationBom();
		System.out.println(emBom.buildEmployers());

		ArrayList<ApplicantProfessionalBackground> apbs = new ApplicantProfessionalBackgroundDao().retrieveAll();
		//for(Iterator<ApplicantProfessionalBackground> i = apbs.iterator(); i.hasNext();) {
		//	ApplicantProfessionalBackground apb = i.next();
		//	System.out.println(apb.toString());
		//}
		//Session session = FactoryInstance.getInstance().openSession();
		//Transaction transaction = null;

		//try {
			//transaction = session.beginTransaction();
			//for(Iterator<User> i = users.iterator(); i.hasNext();) {
		//		User user = i.next();
		//		session.save(user);
		//	}
		//	transaction.commit();
			//	transaction = session.beginTransaction();
			//	session.save(users);
			//	transaction.commit();
		//} catch(HibernateException e) {
		//	transaction.rollback();
		//	e.printStackTrace();
		//} finally {
		//	session.flush();
		//	session.close();
		//}
	


		//UserMigrationBom umBom = new UserMigrationBom();
		//ArrayList<User> users = umBom.buildCareerSeekers();

		//EmployerMigrationBom emBom = new EmployerMigrationBom();
		//System.out.println(emBom.buildEmployers());


		//for(Iterator<User> i = users.iterator(); i.hasNext();) {
		//	User user = i.next();
		//	System.out.println(user.toString());
		//}		
	}
}
