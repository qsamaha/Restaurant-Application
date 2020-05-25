package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hamburger();





    }


    public static void intro(){
        System.out.println("Hello Thank You for Choosing Us!");
        System.out.println("We have three burgers to choose from. Type Traditional, Healthy, or Deluxe Burger");
    }

    public static void Hamburger(){
        Hamburger hamburger = new Hamburger();
        HealthyBurger healthyBurger = new HealthyBurger();
        DeluxeBurger deluxeBurger =  new DeluxeBurger();
        Scanner scan = new Scanner (System.in);
        int count = 0;
        while(count != 1) {
            intro();
            String userChoice = scan.nextLine();
            if (userChoice.equalsIgnoreCase("Traditional")) {
                hamburger.chooseYourBun();
                hamburger.chooseYourMeat();
                hamburger.addToppings();
                System.out.println(hamburger.getTotalPrice());
                count++;
            } else if (userChoice.equalsIgnoreCase("Healthy")) {
                healthyBurger.getBun();
                healthyBurger.getMeat();
                healthyBurger.addToppings();
                System.out.println(healthyBurger.getHealthyBurgerTotal());
                count++;
            } else if (userChoice.equalsIgnoreCase("Deluxe")) {
                deluxeBurger.getBreadRoll();
                deluxeBurger.getMeat();
                deluxeBurger.getSoda();
                deluxeBurger.getSides();
                System.out.println(deluxeBurger.getDeluxeBurgerTotal());
                count++;
            } else {
                System.out.println("Sorry that is not an option");
            }
        }
    }

}


