package com.LITS.Lesson1;

public class Sqr2 {

    static int count2(int a) {
        if (a == 512) {
            System.out.println("a = " + a);
            return 512;
        } else {
            System.out.println("a = " + a);
            int result = count2(a * 2);
            return result;
        }
    }

    public static void main(String[] args) {
        int x = 1;
        count2(x);
    }
}