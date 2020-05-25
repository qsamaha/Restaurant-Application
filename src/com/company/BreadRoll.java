package com.company;

public class BreadRoll {
    final double BREAD_ROLL_PRICE = 1;
    private String breadRollType;

    public BreadRoll(){

    }

    public void setBreadRollTypeToPlainBun(){
        this.breadRollType = "Plain Bun";
        System.out.println("Plain Bun Added");
    }

    public void setBreadRollTypeToCroissantBun(){
        this.breadRollType = "Croissant Bun";
        System.out.println("Croissant Bun Added");
    }

    public void setBreadRollTypeToCinnamonBum(){
        this.breadRollType = "Cinnamon Bun";
        System.out.println("Cinnamon Bun Added");
    }

    public void setBreadRollTypeToWheatRye(){
        this.breadRollType = "Wheat Rye";
    }

    public String getBreadRollType(){
        return breadRollType;
    }

}
