package com.company;

import java.util.Scanner;

public class HealthyBurger extends Hamburger {
    private BreadRoll breadRoll = new BreadRoll();
    private Meat meat = new Meat();
    private Cheese cheese = new Cheese();
    private Tomatoes tomatoes = new Tomatoes();
    private Pickles pickles = new Pickles();
    private Lettuce lettuce = new Lettuce();
    private Cucumbers cucumbers = new Cucumbers();
    private Mayo mayo = new Mayo();
    private Ketchup ketchup = new Ketchup();
    private Fries fries;
    private Soda soda;
    private double totalPrice = 8.50;

    public HealthyBurger() {
    }


    public void getBun(){
        breadRoll.setBreadRollTypeToWheatRye();
        System.out.println(breadRoll.getBreadRollType());
    }

    public void getMeat() {
        meat.setMeatTypeToChicken();
        System.out.println(meat.getMeatType());
    }

    @Override
    public void addToppings(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Thanks for choosing our Healthy Burger, add your 6 toppings!");
        int count = 0;
        while(count < 6) {
            System.out.println("Press 1: Tomatoes, Press 2: Pickles, Press 3: Lettuce, Press 4: Cucumbers, Press 5: Mayo, Press 6: Ketchup");
            int itemNumber = scan.nextInt();
            switch (itemNumber) {
                case 1:
                    tomatoes.addTomatoes();
                    totalPrice += tomatoes.TOMATOES_PRICE;
                    break;
                case 2:
                    pickles.addPickles();
                    totalPrice += pickles.PICKLES_PRICE;
                    break;
                case 3:
                    lettuce.addLettuce();
                    totalPrice += lettuce.LETTUCE_PRICE;
                    break;
                case 4:
                    cucumbers.addCucumbers();
                    totalPrice += cucumbers.CUCUMBER_PRICE;
                    break;
                case 5:
                    mayo.addMayo();
                    totalPrice += mayo.MAYO_PRICE;
                    break;
                case 6:
                    ketchup.addKetchup();
                    totalPrice += ketchup.KETCHUP_PRICE;
                    break;
                default:
                    System.out.println("Sorry that is not available");
                    count--;

            }

            count++;
        }

    }

    public double getHealthyBurgerTotal(){
        System.out.println("Your Total For your healthy burger is $");
        return totalPrice;
    }


}
