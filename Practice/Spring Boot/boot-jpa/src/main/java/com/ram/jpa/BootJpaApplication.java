package com.ram.jpa;

import java.util.List;
import java.util.Optional;

import com.ram.jpa.dao.UserRepository;
import com.ram.jpa.entity.Users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJpaApplication.class, args);


		UserRepository userRepository = context.getBean(UserRepository.class);

//				Users user = new Users();
//				user.setName("Ramsingh Patel");
//				user.setCity("Katni");
//				user.setStatus("I am a java Developer");
				
//				save the single user
//				Users user1 = userRepository.save(user);

////		create the users
//		Users user1 = new Users();
//		user1.setName("Ram");
//		user1.setCity("Jabalpur");
//		user1.setStatus("PHP Developer");
//
//		Users user2 = new Users();
//		user2.setName("Harish");
//		user2.setCity("Bhopal");
//		user2.setStatus("C++ Developer");
//
//		List<Users> users= List.of(user1, user2);
//
//		//		 save multiple users
//		Iterable<Users> result = userRepository.saveAll(users);
//
//		result.forEach(e -> System.out.println(e));
//		
//		System.out.println("done");
		

////		Update User details
//		Optional<Users> optional = userRepository.findById(2);
//		Users user = optional.get();
//		
//		user.setName("Ganesh Hire");
//		Users results = userRepository.save(user);
//		
//		System.out.println(results);
//		
//		System.out.println("**********");
		
////		Getting the user details
//		
//		Iterable<Users> itr = userRepository.findAll();
//		itr.forEach(e -> System.out.println(e));
		
////		Delete by Id
//		
//		userRepository.deleteById(12);
//		System.out.println("deleted successfully");
		
////		Delete the collections of users
//		
//		Iterable<Users> allUsers = userRepository.findAll();
//		allUsers.forEach(e -> System.out.println(e));
//		
//		userRepository.deleteAll(allUsers);
		
////		Find by name
//		
//		List<Users> list1 = userRepository.findByName("Ram");
//		System.out.println(list1);
//		
//		List<Users> list2 = userRepository.findByNameAndCity("Harish", "Bhopal");
//		System.out.println(list2);
		
//		JPQL Query
		
		userRepository.getAllUsers().forEach(e -> System.out.println(e));
		
		System.out.println("______________________________________");
		
		userRepository.getUserByName("Ram", "Jabalpur").forEach(e -> System.out.println(e));
		
		System.out.println("______________________________________");
		
//		Native Query
		
		userRepository.getUser().forEach(e -> System.out.println(e));
		
		System.out.println("______________________________________");
		
		userRepository.getUserByCity("Bhopal").forEach(e -> System.out.println(e));
		
		
	}

}
