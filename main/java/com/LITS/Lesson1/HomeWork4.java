package com.LITS.Lesson1;

public class HomeWork4 {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for(int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int counter = 0;
        int num = 0;

        for(boolean a = true; a; ++num) {
            if (isPrime(num)) {
                System.out.println(num);
                ++counter;
            }

            if (counter == 25) {
                break;
            }
        }

    }
}