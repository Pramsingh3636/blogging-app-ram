package com.ram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.entity.OnlineStore;

@RestController
@RequestMapping("/onlinestore")
public class StoreController 
{

	@Autowired
    OnlineStore onlineStore;

	@GetMapping("{storeId}")
	public OnlineStore getStoreDetails(String storeId)
	{
		return new OnlineStore(11, "Amazon", "USA", "xxxx");
	}
	
	@PostMapping
	public String createStoreDetails(@RequestBody OnlineStore onlineStore)
	{
		this.onlineStore = onlineStore;
		return "Online Store created Successfully";
	}
	
	@PutMapping
	public String updateStoreDetails(@RequestBody OnlineStore onlineStore)
	{
		this.onlineStore = onlineStore;
		return "Online Store updated Successfully";
	}
	
	@DeleteMapping("{storeId}")
	public String deleteStoreDetails(Integer storeId) {
		this.onlineStore = null;
		return "Online Store deleted Successfully";
	}

}
