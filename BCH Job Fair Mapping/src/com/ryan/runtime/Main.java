package com.ryan.runtime;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
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
		
		for (int i = 0; i <= 10; i++) {
			
			User user = new User();
			user.setEmail("jedai05@yahoo.com");
			user.setUsername("ryanbartolay");			
			user.setCreated_date(DateTime.getCurrentSQLDate());
			session.save(user);
			
			Person person = new Person();
			person.setUser_id(user.getUser_id());
			person.setFirst_name("Joenna");
			person.setLast_name("Bartolay");
			person.setCreated_date(DateTime.getCurrentSQLDate());
			person.setPhone_number("028745964");
			person.setPerson_phone_created_date(DateTime.getCurrentSQLDate());
			
			person.setAddress("pasig city");
			person.setCountry_code("PH");
			person.setRegion_city_code("CAVTE");
			person.setAddress_created_date(DateTime.getCurrentSQLDate());
			person.setGender_code("M");
			person.setBirth_date(DateTime.getCurrentSQLDate());
			person.setNatl_code("PH");
			person.setMarital_stat_code("SG");
			person.setDetails_created_date(DateTime.getCurrentSQLDate());
			session.save(person);
			
		}
		

		List<User> users = session.createQuery("from User").list();
		
		tx.commit();
		session.flush();
		
		
		System.out.println(users.size());
		
		session.close();
	}
}
