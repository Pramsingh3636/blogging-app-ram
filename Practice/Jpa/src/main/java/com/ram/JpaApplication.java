package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.entity.Employee;
import com.ram.repo.EmpRepo;


@SpringBootApplication
public class JpaApplication implements CommandLineRunner
{
	@Autowired
	EmpRepo empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		
	}
	@Override
	public void run(String... args)
	{
		Employee emp1 = new Employee(1, "Ram", "Katni", "xxxx", "abc@gmail.com");
		empRepo.save(emp1);
		
		empRepo.findByName("Ram").forEach(e -> System.out.println(e));
		
	}

}

