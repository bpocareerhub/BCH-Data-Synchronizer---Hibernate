package com.ryan.runtime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ryan.bean.mappings.Person;
import com.ryan.bean.mappings.User;
import com.ryan.bom.DateTime;
import com.ryan.bom.UserFactory;

public class Main {
	
	public static void main(String[] args) {
		Session session = UserFactory.getSessionfactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		for (int i = 0; i <= 100; i++) {
			/*Person person = new Person();
			person.setFirst_name("Joenna");
			person.setLast_name("Bartolay");
			person.setCreated_date(DateTime.getCurrentSQLDate());
			person.setPhone_number("028745964");
			person.setPerson_phone_created_date(DateTime.getCurrentSQLDate());*/
			
		
			User user = new User();
			user.setEmail("jedai05@yahoo.com");
			user.setUsername("ryanbartolay");
			//user.setUserPerson(person);			
			user.setCreated_date(DateTime.getCurrentSQLDate());
			session.save(user);
		}
		
		tx.commit();
		session.flush();
		//session.close();
	}
}
