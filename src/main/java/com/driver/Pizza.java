package com.driver;
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isBagAdded = false;


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

    public void addExtraCheese() {
        // your code goes here
        isCheeseAdded = true;
            this.bill += "Extra Cheese Added: 80" + "\n";
            this.price = this.price + 80;
        }


    public void addExtraToppings() {
        // your code goes here
        isToppingsAdded = true;
            if (isVeg) {
                this.price = this.price + 70;
                this.bill += "Extra Toppings Added: 70" + "\n";
            } else {
                this.price = this.price + 120;
                this.bill += "Extra Toppings Added: 120" + "\n";
            }
        }

    public void addTakeaway(){
        // your code goes here
        isBagAdded = true;
        this.price = this.price + 20;
        this.bill += "Paper bag Added: 20" + "\n";
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}