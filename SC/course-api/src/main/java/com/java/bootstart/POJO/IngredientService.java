package com.java.bootstart.POJO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
	
	Map<String,List<Ingredient>> drinkIngredients = new HashMap<>();
	
	{
		createDrinkIngredientsMap();
	}
	
	public void  createDrinkIngredientsMap(){
		
		List<Ingredient> greenIngredients = Arrays.asList(
				new Ingredient("pineapple",50),new Ingredient("apple",20),new Ingredient("mint",20),
				new Ingredient("lemon",10));
		List<Ingredient> citrusIngredients = Arrays.asList(
				new Ingredient("pineapple",50),new Ingredient("apple",20),new Ingredient("mint",20),
				new Ingredient("lemon",10));
		List<Ingredient> rootsIngredients = Arrays.asList(
				new Ingredient("apple",50),new Ingredient("beetroot",20),new Ingredient("ginger",20),
				new Ingredient("lemon",10));
		List<Ingredient> orangeIngredients = Arrays.asList(
				new Ingredient("orange",50),new Ingredient("lemon",20),new Ingredient("apple",20),
				new Ingredient("turmeric",10));
		List<Ingredient> coconutIngredients = Arrays.asList(
				new Ingredient("coconut",70),new Ingredient("cinnamon",20),new Ingredient("water",10));

		drinkIngredients.put("Greens", greenIngredients);
		drinkIngredients.put("Citrus", citrusIngredients);
		drinkIngredients.put("Roots", rootsIngredients);
		drinkIngredients.put("Orange", orangeIngredients);
		drinkIngredients.put("Coconut", coconutIngredients);
	}
	
	public List<Ingredient> getDrinkIngredients(String drinkName){
		return drinkIngredients.get(drinkName);
	}
}
	
	
	
	

