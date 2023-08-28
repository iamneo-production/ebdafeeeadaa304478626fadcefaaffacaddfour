package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Food;
import com.examly.springapp.service.Apiservice;

@RestController
public class FoodController {

    @Autowired
    public Apiservice api;

    @PostMapping("/")
    public boolean addVillageDetails(@RequestBody Food food){
        return api.add(food);
    }

    @GetMapping("/food/{foodId}")
    public Food getId(@PathVariable int foodId){
        return api.getFoodId(foodId);
    }

    @GetMapping ("/origin/{foodOrigin}" )
    public Food getpop(@PathVariable String foodOrigin) {
        return api.getFoodOrgin(foodOrigin);
    }

    @GetMapping("/name/{foodName}")
    public Food getname(@PathVariable String foodName){
        return api.getname(foodName);
    }

    @GetMapping("/{foodName}/{foodCusine}")
    public List<Food> getid(@PathVariable String foodCusine, @PathVariable String foodName){
        return api.getmenAndwomen(foodCusine,foodName);
    }

    
}
