package com.LITS.MyOwnCarWash.domain.cars;

import java.util.HashMap;
import java.util.Map;

import static com.LITS.MyOwnCarWash.domain.enums.WashServices.*;

public class Truck extends Car {
    //make a Map of services and prices
    private Map<String, Integer> services;

    //make a constructor that is creating services map
    public Truck() {
        services = new HashMap<>();
        services.put(WashWithWater.name(), 400);
        services.put(WashWithFoam.name(), 600);
        services.put(Drying.name(), 0);
        services.put(FloorCarpetWashing.name(), 100);
        services.put(SalonCleaning.name(), 500);
    }

    //print in console services that are available for this type of car
    public String getServices() {
        String passCarServices = "Services for passenger car: ";
        for (Map.Entry<String, Integer> entry : services.entrySet()) {
            if (entry.getValue().equals(0)){
                passCarServices = passCarServices + '\n' + entry.getKey() + " This service is temporally unavailable";
            } else
                passCarServices = passCarServices + '\n' + entry.getKey() + " " + entry.getValue() + " UAH";
        }
        return passCarServices;
    }
}
