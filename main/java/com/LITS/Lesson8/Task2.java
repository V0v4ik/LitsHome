package com.LITS.Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2{
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Hello, my job is equation solving. Please, enter 3 Integers in correct order");
        System.out.println(" and I'll solve equation type ax2 + bx + c = 0");
        int a = 0, b = 0, c = 0;
        double d, x1, x2;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("enter a: ");
            String input = bufferedReader.readLine();
            a = Integer.parseInt(input);

            System.out.println("enter b: ");
            String input1 = bufferedReader.readLine();
            b = Integer.parseInt(input1);

            System.out.println("enter c: ");
            String input2 = bufferedReader.readLine();
            c = Integer.parseInt(input2);
        }
        catch (NumberFormatException | IOException exc){
            System.out.println("You tried to wrote not a numbers");
        }
        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("D < 0, can't solve it");
        } else {
            x1 = (-b - Math.pow(d, 0.5)) / (2 * a);
            x2 = (-b + Math.pow(d, 0.5)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }

    }
}
