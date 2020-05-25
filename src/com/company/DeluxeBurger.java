package com.company;

import java.util.Scanner;

public class DeluxeBurger extends Hamburger {
    private BreadRoll breadRoll = new BreadRoll();
    private Meat meat = new Meat();
    private Fries fries = new Fries();
    private Soda soda = new Soda();
    private int totalPrice = 0;

    public DeluxeBurger(){

    }

    public void getBreadRoll(){
        breadRoll.setBreadRollTypeToPlainBun();
        System.out.println(breadRoll.getBreadRollType());
    }

    public void getMeat(){
        meat.setMeatTypeToBeef();
        System.out.println(meat.getMeatType());
    }

    public String getSoda(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(count != 1){
            System.out.println("Choose your Soda. Press 1: Sprite, Press 2: Dr.Pepper, Press 3: Coke");
            int userNum = scan.nextInt();
            switch (userNum) {
                case 1:
                    soda.setSodaToSprite();
                    break;
                case 2:
                    soda.setSodaToDrPepper();
                    break;
                case 3:
                   soda.setSodaToCoke();
                   break;
                default:
                    System.out.println("Sorry that is not an option");
                    count--;
            }
            count++;
        }
        return soda.getSodaType();
    }


    public void getSides(){
        fries.addFries();
        soda.getSodaType();
    }

    public double getDeluxeBurgerTotal(){
        totalPrice += breadRoll.BREAD_ROLL_PRICE;
        totalPrice += meat.MEAT_PRICE;
        totalPrice += fries.FRIES_PRICE;
        totalPrice += soda.SODA_PRICE;
        System.out.print("The Total for your deluxe burger is $");
        return totalPrice;
    }

}
