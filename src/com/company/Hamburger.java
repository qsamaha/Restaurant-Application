package com.company;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Hamburger {
    private BreadRoll breadRoll = new BreadRoll();
    private Meat meat = new Meat();
    private Cheese cheese = new Cheese();
    private Tomatoes tomatoes = new Tomatoes();
    private Pickles pickles = new Pickles();
    private Lettuce lettuce = new Lettuce();
    private Cucumbers cucumbers = new Cucumbers();
    private Mayo mayo = new Mayo();
    private Ketchup ketchup = new Ketchup();
    private double totalPrice = 0;

    public Hamburger(){

    }


    public void chooseYourBun(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type Plain Bun, Croissant Bun, or Cinnamon Bun");
        String chosenBun = scan.nextLine();
            if(chosenBun.equalsIgnoreCase("Plain Bun")){
                breadRoll.setBreadRollTypeToPlainBun();
            }else if(chosenBun.equalsIgnoreCase("Croissant Bun")){
                breadRoll.setBreadRollTypeToCroissantBun();
            }else if(chosenBun.equalsIgnoreCase("Cinnamon Bun")) {
                breadRoll.setBreadRollTypeToCinnamonBum();
            }else{
                breadRoll.setBreadRollTypeToPlainBun();
                }
        }

    public void chooseYourMeat(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(count != 1){
            System.out.println("Choose your Protein. Press 1: Beef, Press 2 Chicken");
            int userNum = scan.nextInt();
            switch (userNum) {
                case 1:
                    meat.setMeatTypeToBeef();
                    break;
                case 2:
                    meat.setMeatTypeToChicken();
                    break;
                default:
                    System.out.println("Sorry that is not an option");
                    count--;
            }
            count++;
        }
        System.out.println(meat.getMeatType());
    }



    public void addToppings(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Thanks for choosing our traditional Hamburger, add your 4 toppings!");
        int count = 0;
        while(count < 4) {
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



    public double getTotalPrice(){
        totalPrice += breadRoll.BREAD_ROLL_PRICE;
        totalPrice += meat.MEAT_PRICE;
        System.out.print("Thank You For Choosing Our Burger Joint, Your total is: $");
        return totalPrice;
    }

}
