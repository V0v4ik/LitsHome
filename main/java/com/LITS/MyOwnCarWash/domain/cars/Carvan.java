package com.LITS.MyOwnCarWash.domain.cars;

import java.util.HashMap;
import java.util.Map;

import static com.LITS.MyOwnCarWash.domain.enums.WashServices.*;

public class Carvan extends Car {
    //make a Map of services and prices
    private Map<String, Integer> services;

    //make a constructor that is creating services map
    public Carvan() {
        services = new HashMap<>();
        services.put(WashWithWater.name(), 200);
        services.put(WashWithFoam.name(), 300);
        services.put(EngineWashing.name(), 200);
        services.put(WaxCovering.name(), 700);
        services.put(Drying.name(), 0);
        services.put(FloorCarpetWashing.name(), 80);
        services.put(SalonCleaning.name(), 400);
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
