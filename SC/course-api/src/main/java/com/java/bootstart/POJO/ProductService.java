package com.java.bootstart.POJO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	
	private List<Product> products = null;
	
	@Autowired
	ProductService(IngredientService ingredientService){
		products=Arrays.asList(
				new Product("9aa113b4-1e4e-4cde-bf9d-8358fc78ea4f","Greens", "Looking for simple, clean and green? Four of the most nutrient dense leafy greens create the base in our low-sugar Greens 1.",3.5,ingredientService.getDrinkIngredients("Greens")),
				new Product("bdcbe438-ac85-4acf-8949-5627fd5b57df","Citrus", "This enzyme rich juice is filled with phytonutrients and bromelin which helps to reduce inflammation. Drink it before a meal to get digestive juices flowing.",2.75,ingredientService.getDrinkIngredients("Citrus")),
				new Product("58552daa-30f6-46fa-a808-f1a1d7667561","Roots", "Beets help your body to release stomach acid which aids digestion! Drink this juice when you want a snack that's both pretty and nutritious!",3.0,ingredientService.getDrinkIngredients("Roots")),
				new Product("d4666802-fd84-476f-9eea-c8dd29cfb633","Orange", "Orange juice with a twist to boost you health!",1.99,ingredientService.getDrinkIngredients("Orange")),
				new Product("7ef3b9dd-5a95-4415-af37-6871d6ff0262","Coconut 1", "Cinnamon lovers - this is your blend! Two nutritional powerhouses combine in a delicious, satiating elixir. Both cinnamon and coconut have been shown to reduce blood sugar. Raw coconut meat is a great source of medium chain fatty acids, which can lower bad cholesterol. Coconut also contains significant levels of fiber and manganese, a mineral that helps you metabolize fat and protein.",2.5,ingredientService.getDrinkIngredients("Coconut")));
		
	}
	public List<Product> getAllProducts(){
		return products;
	}

/*	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return products.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}*/


	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	
}

