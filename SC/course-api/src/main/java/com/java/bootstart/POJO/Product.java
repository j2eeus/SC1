package com.java.bootstart.POJO;

import java.util.List;

public class Product {
	
	private String id;
	private String name;
	private String description;
	private double price;
	private List<Ingredient> ingredients;
	public Product(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String id, String name, String description, double d,List<Ingredient> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = d;
		this.ingredients=ingredients;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	

}
