package com.ram.entity;

public class OnlineStore 
{
	private int storeId;
	private String name;
	private String address;
	private String phone;
	public OnlineStore(int storeId, String name, String address, String phone) {
		super();
		this.storeId = storeId;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public OnlineStore() {
		super();
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "OnlineStore [storeId=" + storeId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	
}
