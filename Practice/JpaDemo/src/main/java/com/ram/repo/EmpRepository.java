package com.ram.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.Employee;


public interface EmpRepository extends CrudRepository<Employee, Integer>
{
	List<Employee> findByName(String name);
	List<Employee> findByPhone(int phone);
	List<Employee> findById(int empid);

}
