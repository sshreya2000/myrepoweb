package com.shreya.food.FoodSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("all")
public class FoodController {
	
	@Autowired
	FoodService service;
	
	@GetMapping("foods")
	public List<Food> getAllFoods(){
		return service.getAllFoods();
	}
	
	@GetMapping("food/{name}")
	public Food getFood(@PathVariable String name){
		return service.getFood(name);
	}
	
	@PostMapping("food")
	public void addFood(@RequestBody Food f) {
		service.addFood(f);
	}
	
	@GetMapping("food/{d}/{e}")
	public List<Food> getcalorie(@PathVariable Float d, @PathVariable Float e ){
		return service.getcalorie(d,e);
	}
}