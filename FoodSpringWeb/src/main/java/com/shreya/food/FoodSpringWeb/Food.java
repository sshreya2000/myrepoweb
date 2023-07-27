package com.shreya.food.FoodSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Food {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private float carbohydrates;
	private float proteins;
	private float fats;
	private float calories;
	private float dietaryfibre;
	
}
