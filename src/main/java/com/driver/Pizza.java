package com.driver;
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isBagAdded = false;
    private int extraCheese = 80;
    private int extraVegToppings = 70;
    private int extraNonVegToppings = 120;
    private int carryBag = 20;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isCheeseAdded = true;
        this.price = this.price + extraCheese;
    }

    public void addExtraToppings(){
        // your code goes here
        isToppingsAdded = true;
        if(isVeg){
            this.price = this.price + extraVegToppings;
            } else {
            this.price = this.price + extraNonVegToppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        isBagAdded = true;
        this.price = this.price + carryBag;
    }

    public String getBill(){
        // your code goes here

        if(isCheeseAdded){
            this.bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
        if(isToppingsAdded){
            if(isVeg){
                this.bill += "Extra Toppings Added: " + extraVegToppings + "\n";
            } else {
                this.bill += "Extra Toppings Added: " + extraNonVegToppings  + "\n";
            }
        }
        if(isBagAdded){
            this.bill += "Paper bag Added: " + carryBag + "\n";
        }
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}