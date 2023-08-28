package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Food;
import com.examly.springapp.repository.FoodRepo;

@Service
public class Apiservice {

    @Autowired
    public FoodRepo repo;

    public boolean add(Food food){
        return repo.save(food)!=null?true:false;
        
    }

    public Food getFoodId (int foodId) {
        return repo.findbyId(foodId);

    }

    public Food getFoodOrgin ( String foodOrigin){
        return repo.findbyOrigin(foodOrigin);
    }

    public Food getname (String foodName){
        return repo.findbyName(foodName);
    }

    public List<Food> getmenAndwomen( String foodCusine , String foodName){
        return repo.findCN(foodCusine, foodName);
    }

    
}
