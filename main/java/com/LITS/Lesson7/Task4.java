package com.LITS.Lesson7;

public class Task4 {
    public static void firstMethod() throws Except{
        System.out.println("This is my own exception");
        throw new Except();
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
        try {
            firstMethod();
            System.out.println("Try block");
        } catch (Except e) {
            e.printStackTrace();
            System.out.println("Will we see this?");
        }
        finally {
            System.out.println("We will see this anyway");
        }

    }
}
