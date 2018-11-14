package com.LITS.Lesson1;

public class HomeWork2 {

    public static void main(String[] args) {
        int count = 1000;

        for(int i = 2; i < count; i += 2) {
            if (i % 7 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }

    }
}