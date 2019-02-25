package com.online.shopping.item.dto;

public class ItemDto {
	public ItemDto() {
        super();
    }
	
	
	public ItemDto(String id, String itemName, String description, float price) {
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
	private String id;
	private String itemName;
	private String description;
	private float price;

}
