package com.ram.jpa.dao;

import com.ram.jpa.entity.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<Users, Integer>
{
//	Derived query methods / Custom Finder Method
	
	public List<Users> findByName(String name);
	
	public List<Users> findByNameAndCity(String name, String city);

//	JPQL Query -> Java Persistent Query Language
	
	@Query("select u FROM Users u")
	public List<Users> getAllUsers();
	
	@Query("select u FROM Users u Where u.name =:n and u.city =:c")
	public List<Users> getUserByName(@Param("n") String name, @Param("c") String city);
	
	
//	Native Query
	
	@Query(value = " select * from Users", nativeQuery = true)
	public List<Users> getUser();
	
	@Query(value = "select * from Users where city =:c", nativeQuery = true)
	public List<Users> getUserByCity(@Param("c") String city);
}
