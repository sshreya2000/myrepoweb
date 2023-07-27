package com.shreya.food.FoodSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodService {
	@Autowired
	FoodDB db;
//	List<Food> foods= new ArrayList<>();
	public void addFood(Food f) {
	db.save(f);
	}
	public List<Food> getAllFoods(){
		return db.findAll();
	}
	
	public Food getFood(String name) {
//		for (Food f:db.findAll()) {
//			if(f.getName().equals(name))return f;
//		}
		return db.findByName(name);
//		return null;
	}
	
	public List<Food> getcalorie(float d, float e) {
//		List<Food> calfood= new ArrayList<>();
//		for (Food q:db.findAll()) {
//			if(q.getcalories()>=d && q.getcalories()<=e)calfood.add(q);
//		}
//		return calfood;
		return db.findByCaloriesBetween(d,e);
		
	}
}
