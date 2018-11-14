package com.LITS.Lesson4;

public class PizzaOrder implements Order {
    int price = 30;
    int weight = 2;
    public int calculateTotalPrice() {
        int totalPrice = price * weight;
        return totalPrice;
    }
}
