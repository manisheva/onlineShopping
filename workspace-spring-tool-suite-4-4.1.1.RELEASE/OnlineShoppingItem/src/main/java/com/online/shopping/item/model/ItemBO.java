package com.online.shopping.item.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class ItemBO implements java.io.Serializable{

	public ItemBO() {
		// TODO Auto-generated constructor stub
	}
	public ItemBO(String id, String itemName, String description, float price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

	//instance Variable 
		   
	@Id
    @GeneratedValue
    @Column(name="id")
	private String id;
	@Column(name="itemName")
	private String itemName;
	@Column(name="description")
	private String description;
	@Column(name="price")
	private float price;
		
	



}