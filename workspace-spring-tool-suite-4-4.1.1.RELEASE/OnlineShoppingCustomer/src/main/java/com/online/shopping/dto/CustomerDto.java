package com.online.shopping.dto;

public class CustomerDto {
	public CustomerDto() {
        super();
    }
	public CustomerDto(String id, String email, String fname, String last_name) {
		super();
		this.id = id;
		this.email = email;
		this.fname = fname;
		this.last_name = last_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	//instance Variable 
	private String id;
	private String email;
	private String fname;
	private String last_name;

}
