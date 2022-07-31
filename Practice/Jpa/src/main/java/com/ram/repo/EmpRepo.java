package com.ram.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>
{
	List<Employee> findByName(String name);

}
