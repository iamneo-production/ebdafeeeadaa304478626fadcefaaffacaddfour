package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Food;

@Repository
public interface FoodRepo extends JpaRepository <Food , Integer> {

    @Query(value = "SELECT * FROM Food u  WHERE u.food_id = ?1", nativeQuery = true)
    public Food findbyId(int foodId);

    @Query(value = "SELECT * FROM Food u WHERE u.food_origin = ?1", nativeQuery = true)
    public Food findbyOrigin (String foodOrigin);

    @Query(value = "SELECT * FROM Food u WHERE u.food_name = ?1", nativeQuery = true)
    public Food findbyName (String foodName);

    @Query(value = "SELECT * FROM Food u WHERE u.food_cusine = ?1  AND u.food_name = ?2" , nativeQuery = true )
    public List<Food> findCN(String foodCusine , String  foodName);
    
}
