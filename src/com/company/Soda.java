package com.company;

public class Soda {
    final double SODA_PRICE = 1.50;
    private String sodaType;
    public Soda(){

    }

    public void setSodaToSprite(){
        this.sodaType = "Sprite";
    }

    public void setSodaToCoke(){
        this.sodaType = "Coke";
    }

    public void setSodaToDrPepper(){
        this.sodaType = "Dr.Pepper";
    }

    public String getSodaType(){
        return sodaType;
    }


}
