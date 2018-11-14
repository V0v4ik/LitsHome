package com.LITS.Lesson4;

public class Person {
    public void sleep() {
        System.out.println("15 min");
    }
    public void sleep(int quantity){
        System.out.println(quantity + " min");
    }
    public void sleep(int quantity, String timeUnit){
        System.out.println(quantity + " " + timeUnit);
    }
}