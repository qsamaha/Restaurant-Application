package com.company;

public class Cheese {
    private String cheeseType;
    final double CHEESE_PRICE = 1;
    public Cheese(){

    }

    public void setCheeseTypeToProvolone(){
        this.cheeseType = "Provolone";
    }

    public void setCheeseTypeToAmerican(){
        this.cheeseType = "American";
    }

    public void setCheeseTypeToPepperJack(){
        this.cheeseType = "PepperJack";
    }

    public String getCheeseType(){
        return cheeseType;
    }

    public double getCHEESE_PRICE(){
        return CHEESE_PRICE;
    }
}
