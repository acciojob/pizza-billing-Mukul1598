package com.driver;
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean CheeseAdded = false;
    private boolean ToppingsAdded = false;
    private boolean Takeawayadded = false;
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
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(CheeseAdded) {
            return;
        }
            this.price = this.price + extraCheese;
            this.CheeseAdded = true;
        }

    public void addExtraToppings(){
        // your code goes here
        if(ToppingsAdded) {
            return;
        }
            if (isVeg) {
                this.price = this.price + extraVegToppings;
            } else {
                this.price = this.price + extraNonVegToppings;
            }
            ToppingsAdded = true;
        }


    public void addTakeaway(){
        // your code goes here
        if(Takeawayadded) {
            return;
        }
            this.price = this.price + carryBag;
        Takeawayadded = true;
        }


    public String getBill(){
        // your code goes here

        if(isVeg){
            bill = "Base Price Of The Pizza: 300\n";
        }
        else{
            bill = "Base Price Of The Pizza: 400\n";
        }
        if(CheeseAdded){
            this.bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
        if(ToppingsAdded){
            if(isVeg){
                this.bill += "Extra Toppings Added: " + extraVegToppings + "\n";
            } else {
                this.bill += "Extra Toppings Added: " + extraNonVegToppings  + "\n";
            }
        }
        if(Takeawayadded){
            this.bill += "Paper bag Added: " + carryBag + "\n";
        }
        bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
//if(isVeg == true){
//bill = "Base Price Of The Pizza: 300\n";
//        }else{
//bill = "Base Price Of The Pizza: 400\n";
//        }
//
//        if(extraCheese == true){
//bill = bill + "Extra Cheese Added: 80\n";
//        }
//
//        if(extraToppings == true){
//        if(isVeg == true){
//bill = bill + "Extra Toppings Added: 70\n";
//        }else{
//bill = bill + "Extra Toppings Added: 120\n";
//        }
//        }
//
//        if(paperBag == true){
//bill = bill + "Paperbag Added: 20\n";
//        }
//
//String totalPrice = Integer.toString(price);
//
//bill = bill + "Total Price: " + totalPrice + "\n";
//        return this.bill;