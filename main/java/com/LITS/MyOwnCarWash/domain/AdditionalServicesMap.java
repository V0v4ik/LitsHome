package com.LITS.MyOwnCarWash.domain;

import com.LITS.MyOwnCarWash.domain.enums.AdditionalServices;

import java.util.HashMap;
import java.util.Map;

public class AdditionalServicesMap {
    private Map<String, Integer> addServicesMap;

    public AdditionalServicesMap() {
        addServicesMap = new HashMap<>();
        for (AdditionalServices otherService : AdditionalServices.values()) {
            addServicesMap.put(otherService.name(), otherService.getAddPrice());
        }
    }

    public String getAdditionalServices() {
        String additionalServices = "Additional services: ";
        for (Map.Entry<String, Integer> entry : addServicesMap.entrySet()) {
            if (entry.getValue().equals(0)) {
                additionalServices = additionalServices + '\n' + entry.getKey() + " This service is temporally unavailable";
            } else
                additionalServices = additionalServices + '\n' + entry.getKey() + " " + entry.getValue() + " UAH";
        }
        return additionalServices;
    }

}
