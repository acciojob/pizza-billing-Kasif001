package com.driver;

public class Pizza {

    private int totalPrice;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private boolean isCheeseAdd;
    private int topplingPrice;
    private boolean isTopplingAdd;
    private int begPrice;
    private boolean isBegAdd;
    private int basePrice;
    private  boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
           basePrice = 300;
           topplingPrice = 70;
        }else {
            basePrice = 400;
            topplingPrice = 120;
        }
        totalPrice+=basePrice;
        cheesePrice = 80;
        begPrice = 20;

        bill = "Base Price Of The Pizza: "+basePrice+"\n";

    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdd == false){
            totalPrice+=cheesePrice;
            isCheeseAdd = true;
            bill = bill + "Extra Cheese Added: "+cheesePrice+"\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isTopplingAdd == false){
            totalPrice+=topplingPrice;
            isTopplingAdd = true;
            bill = bill + "Extra Toppings Added: "+topplingPrice+"\n";
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isBegAdd == false){
            totalPrice+=begPrice;
            isBegAdd = true;
            bill = bill + "Paperbag Added: "+begPrice+"\n";
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated = true;
            bill = bill + "Total Price: "+totalPrice+"\n";
        }
        return this.bill;
    }
}
