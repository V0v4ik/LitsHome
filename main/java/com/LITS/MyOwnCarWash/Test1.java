package com.LITS.MyOwnCarWash;

import com.LITS.MyOwnCarWash.domain.AdditionalServicesMap;
import com.LITS.MyOwnCarWash.domain.Receipt;
import com.LITS.MyOwnCarWash.domain.cars.Car;
import com.LITS.MyOwnCarWash.domain.cars.PassengerCar;
import com.LITS.MyOwnCarWash.domain.enums.CarsTypes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        //this int was made for testing break points
        int testPoints = 0;
        //this test works well
        System.out.println(Arrays.toString(CarsTypes.values()));
        Car car1 = new PassengerCar();
        System.out.println(car1.getServices());
        System.out.println(" ");
        ///
        //test of receipt
        //
        //This test works correct

        // to use this identifier it have to be in loop we use

        START:

            testPoints += 2;
            Receipt passCarReceipt = new Receipt();
            Map<String, Integer> testMap = new HashMap<>();
            testMap.put("Test1", 80);
            testMap.put("Test2", 100);

            for (Map.Entry<String, Integer> entry1 : testMap.entrySet()) {
                passCarReceipt.putInReceipt(entry1);
                passCarReceipt.putInReceipt(entry1);
                /*if (testPoints  < 3) {
                    System.out.println("breakpoint works");
                    break START;
                }*/
                passCarReceipt.putInReceipt(entry1);

            }
        System.out.println(" ");
        //testing OtherServices
        AdditionalServicesMap addServicesMap = new AdditionalServicesMap();
        System.out.println(addServicesMap.getAdditionalServices());
        System.out.println(" ");

        System.out.println("Your receipt for passenger car is : " + passCarReceipt.getReceipt());




        //Total receipt
        System.out.println("Total price: " + passCarReceipt.totalPrice() + " UAH");
    }

}
