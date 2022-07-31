package com.ram.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ram.hib.entity.Users;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			//create object of entity class type
			//			Users user = new Users("ramsingh", "ramsingh123", "Ramsingh", "Patel", "Katni", "pramsingh3636@gmail.com",1234);
			Users user = new Users(); // because of default constructor

			//start transaction
			session.beginTransaction();

			//perform operation
			//			session.save(user);
			user = session.get(Users.class, 2); // Retrieve record from database

			session.delete(user);  // delete the record from database with user


			//			user.setUsername("ramsingh786");   // update the record in database

			//commit the transaction
			session.getTransaction().commit();

			System.out.println("Row Added Successfully");

		}finally {
			factory.close();
			session.close();
		}

	}

}