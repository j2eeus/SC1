package com.java.bootstart.POJO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ingredient {
	private String name;
	private Integer percentage;
	
	public Ingredient(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	public Ingredient(String name, Integer percentage) {
		super();
		this.name = name;
		this.percentage = percentage;
	}
}
