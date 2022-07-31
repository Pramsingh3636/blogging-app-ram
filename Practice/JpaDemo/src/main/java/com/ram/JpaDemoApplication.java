 package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.entity.Employee;
import com.ram.repo.EmpRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	EmpRepository empRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) 
	{
		Employee employee1 = new Employee(1, "Ramsingh", "Jabalpur", 1234);
		empRepository.save(employee1);
		Employee employee2 = new Employee(2, "Harish", "Katni", 3456);
		empRepository.save(employee2);
		Employee employee3 = new Employee(3, "ganesh", "Bhopal", 3758);
		empRepository.save(employee3);
		
		
		empRepository.findByName("Ramsingh").forEach(e -> System.out.println(e));
		
		empRepository.findByPhone(3456).forEach(e -> System.out.println(e));
		
		empRepository.findById(3).forEach(e -> System.out.println(e));
		
		System.out.println(empRepository.count());
		
	}

}
