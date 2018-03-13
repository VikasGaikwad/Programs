package com.app.model;

public class Contact {
	private int id;
	private String name;
	private String addresss;
	private long telephone;
	public Contact() {
		
	}
	public Contact(int id, String name, String addresss, long telephone) {
		
		this.id = id;
		this.name = name;
		this.addresss = addresss;
		this.telephone = telephone;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddresss() {
		return addresss;
	}
	public long getTelephone() {
		return telephone;
	}
	

}
