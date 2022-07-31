package com.ram.blog.service;

import java.util.List;

import com.ram.blog.payloads.UserDto;

public interface UserService 
{
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deteteUser(Integer userId);
	
}
