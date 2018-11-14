package com.LITS.Lesson4;

public class Eats {
    public static void main(String[] args) {
        Food f1 = new Food();
        Food f2 = new Food(20,30);
        Food f3 = new Food(20,30,10);
        System.out.println(f1.price * f1.quantity);
        System.out.println(f2.price * f2.quantity);
        System.out.println(f3.price * f3.quantity * f3.weight);
        System.out.println();
        System.out.println("=======");
        System.out.println();
        AppleOrder apple = new AppleOrder();
        PizzaOrder pizza = new PizzaOrder();
        System.out.println("Apple price " + apple.calculateTotalPrice());
        System.out.println("Pizza prise " + pizza.calculateTotalPrice());
    }
}