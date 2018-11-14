package com.LITS.Lesson1;

public class HomeWork3 {

    public static void main(String[] args) {
        int counter = 0;
        int i = 1;
        boolean a = true;

        while(a) {
            if (i >= 1000) {
                System.out.println("Numbers that confirm our terms are less than 25");
                break;
            }

            if (i < 100) {
                if (i % 11 == 0) {
                    System.out.println(i);
                    ++counter;
                }
            } else if (i % 47 == 0) {
                System.out.println(i);
                ++counter;
            }

            ++i;
            if (counter == 25) {
                break;
            }
        }

    }
}