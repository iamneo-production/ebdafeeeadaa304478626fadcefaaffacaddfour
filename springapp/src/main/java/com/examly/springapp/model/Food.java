package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {

    @Id
    int foodId;
    String foodName;
    String foodCusine;
    String cookingTime;
    String foodOrigin;


    public Food() {
    }


    public Food(int foodId, String foodName, String foodCusine, String cookingTime, String foodOrigin) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCusine = foodCusine;
        this.cookingTime = cookingTime;
        this.foodOrigin = foodOrigin;
    }


    public int getFoodId() {
        return foodId;
    }


    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }


    public String getFoodName() {
        return foodName;
    }


    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    public String getFoodCusine() {
        return foodCusine;
    }


    public void setFoodCusine(String foodCusine) {
        this.foodCusine = foodCusine;
    }


    public String getCookingTime() {
        return cookingTime;
    }


    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }


    public String getFoodOrigin() {
        return foodOrigin;
    }


    public void setFoodOrigin(String foodOrigin) {
        this.foodOrigin = foodOrigin;
    }
    

    
}
