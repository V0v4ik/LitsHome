package com.LITS.Lesson4;

public class AppleOrder implements Order {
    int price = 20;
    int quantity = 30;

    public int calculateTotalPrice(){
        int totalPrice =  quantity * price;
        return totalPrice;
    }
}