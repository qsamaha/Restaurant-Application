package com.company;

public class Meat {
    private String meatType;
    final double MEAT_PRICE = 3;
    public Meat(){

    }

    public void setMeatTypeToBeef(){
        this.meatType = "Beef";
    }

    public void setMeatTypeToChicken(){
        this.meatType = "Chicken";
    }

    public String getMeatType(){
        System.out.print("Your choice of protein is ");
        return meatType;
    }


}
