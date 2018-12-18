/*
package com.LITS.MyOwnCarWash;

import java.io.BufferedReader;

public class Application {
    public static void main(String[] args) throws Exception{
        String input =" ";
        int step = 0;
        double sum = 0;


        System.out.println("Welcome!");
        do {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            if (step == 0) {
                System.out.println("Do you wanna fill up?(y/q)");
                input = bufferedReader.readLine();
                switch (input) {
                    case "y":
                        step = 1;
                        break;
                    case "q":
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("You can only enter y or q");
                        step = 0;
                        break;
                }
            } else if(step == 1) {
                System.out.println("Which gasoline do you want?(95/92/q)");
                input = bufferedReader.readLine();
                switch (input) {
                    case "95":
                    case "92":
                        step = 2;
                        break;
                    case "q":
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("You can only enter 95, 92 or q");
                        step = 1;
                        break;
                }
            } else  {
                if (input.equals("95")) {
                    System.out.println("One litter costs 10$.");
                    System.out.println("How many litters do you want?(You can only enter a number)");
                    input = bufferedReader.readLine();
                    System.out.println("You need to pay: " + Double.parseDouble(input) * 10);
                    sum = Double.parseDouble(input) * 10.0;
                    System.out.println("Do you need more?(y/q)");
                    input = bufferedReader.readLine();

                    switch (input) {
                        case "y":
                            step = 1;
                            break;
                        case "q":
                            System.out.println(" ");
                            break;
                        default:
                            System.out.println("You can only enter y or q");
                            step = 1;
                            break;
                    }

                }
                if (input.equals("92")) {
                    System.out.println("One litter costs 8$.");
                    System.out.println("How many litters do you want?(You can only enter a number)");
                    input = bufferedReader.readLine();
                    System.out.println("You need to pay: " + Integer.parseInt(input) * 8);
                    sum = Double.parseDouble(input) * 8.0;
                    System.out.println("Do you need more?(y/q)");
                    input = bufferedReader.readLine();
                    switch (input) {
                        case "y":
                            step = 1;
                            break;
                        case "q":
                            System.out.println(" ");
                            break;
                        default:
                            System.out.println("You can only enter y or q");
                            step = 1;
                            break;
                    }
                }}

        } while (!input.equals("q"));

        System.out.println("You need to pay: " + sum + "$");
        System.out.println("Bye!");

    }
}
*/
