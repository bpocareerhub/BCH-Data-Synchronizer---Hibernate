package com.ryan.runtime;

import org.hibernate.Session;

import com.ryan.beans.Person;
import com.ryan.beans.User;
import com.ryan.bom.DateTime;
import com.ryan.bom.UserFactory;

public class Main {
	
	public static void main(String[] args) {
		Session session = UserFactory.getSessionfactory().openSession();
		session.beginTransaction();
		
		Person person = new Person();
		person.setFirst_name("Joenna");
		person.setLast_name("Bartolay");
		person.setCreated_date(DateTime.getCurrentSQLDate());
		person.setPhone_number("028745964");
		person.setPerson_phone_created_date(DateTime.getCurrentSQLDate());
		
		User user = new User();
		
		user.setEmail("jedai05@yahoo.com");
		user.setUsername("ryanbartolay");
		user.setUserPerson(person);
		person.setUser(user);
		user.setCreated_date(DateTime.getCurrentSQLDate());
		
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
}
