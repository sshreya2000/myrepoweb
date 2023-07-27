package com.shreya.food.FoodSpringWeb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FoodDB extends JpaRepository<Food, Integer> {
	List<Food> findAll();
	Food findByName(String name);
	List<Food> findByCaloriesBetween(Float calories1, Float calories2);
}
