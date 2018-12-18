package com.LITS.MyOwnCarWash;

import com.LITS.MyOwnCarWash.domain.enums.CarsTypes;

import java.util.Arrays;
import java.util.Scanner;

import static com.LITS.MyOwnCarWash.domain.enums.CarsTypes.*;
import static com.LITS.MyOwnCarWash.domain.enums.Condition.*;

public class CarWash {
    public static void main(String[] args) {
        String marker = CarChoosing.name();
        String input = " ";

        System.out.println("Hello");
        do {
            Scanner scanner = new Scanner(System.in);
            if (marker.equals(CarChoosing.name())) {
                System.out.println("You can choose this types of car : ");
                System.out.println(Arrays.toString(CarsTypes.values()));
                System.out.println("Select one of them");
                input = scanner.nextLine();
                do {
                    if (PassengerCar.name().toLowerCase().equals(input.toLowerCase()) ||
                            Carvan.name().toLowerCase().equals(input.toLowerCase()) ||
                            Motorcycle.name().toLowerCase().equals(input.toLowerCase()) ||
                            SUV.name().toLowerCase().equals(input.toLowerCase()) ||
                            Truck.name().toLowerCase().equals(input.toLowerCase())) {
                        marker = ServiceChoosing.name();
                        System.out.println("marker = " + marker);
                        System.out.println(" you choose " + input);
                        break;
                    } else if (HeavyDutyWehicles.name().toLowerCase().equals(input.toLowerCase())) {
                        System.out.println("Sorry, but we can't serve this type of machines now");
                        System.out.println("marker = " + marker);
                        break;
                    } else {
                        System.out.println("Please, enter the correct type of car you want to wash");
                        System.out.println("marker = " + marker);
                        break;
                    }
                } while (marker.equals(CarChoosing.name()));
            } else if (marker.equals(ServiceChoosing.name())) {
                System.out.println("we're in service choosing now");
                break;
            }

            /*if (PassengerCar.name().toLowerCase().equals(input.toLowerCase())) {
                System.out.println("first try is success");
            }*/
        } while (!"quit".equals(input.toLowerCase()));
    }
}
