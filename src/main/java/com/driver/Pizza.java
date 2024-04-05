package com.driver;
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean CheeseAdded = false;
    private boolean ToppingsAdded = false;
    private boolean Takeawayadded = false;


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
            this.price = this.price + 80;
            this.CheeseAdded = true;
        }

    public void addExtraToppings(){
        // your code goes here
        if(ToppingsAdded) {
            return;
        }
            if (isVeg) {
                this.price = this.price + 70;
            } else {
                this.price = this.price + 120;
            }
            ToppingsAdded = true;
        }


    public void addTakeaway(){
        // your code goes here
        if(Takeawayadded) {
            return;
        }
            this.price = this.price + 20;
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
            this.bill += "Extra Cheese Added: 80\n";
        }
        if(ToppingsAdded){
            if(isVeg){
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.bill += "Extra Toppings Added: 120\n";
            }
        }
        if(Takeawayadded){
            this.bill += "Paper bag Added: 20\n";
        }
        String totalPrice = Integer.toString(price);
        bill += "Total Price: " + totalPrice + "\n";
        return this.bill;
    }
}