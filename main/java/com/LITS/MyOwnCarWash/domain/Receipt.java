package com.LITS.MyOwnCarWash.domain;

import java.util.HashMap;
import java.util.Map;

public class Receipt {
    //This is receipt of services that client chose
    private Map<String, Integer> receipt;

    //constructor that creates receipt map we need
    public Receipt() {
        receipt = new HashMap<>();
    }

    //method is using to put services that client chose in receipt map
    //
    //Delete unnecessary souts
    //
    public void putInReceipt(Map.Entry<String, Integer> inReceiptEntry){
        String service = inReceiptEntry.getKey();
        Integer price = inReceiptEntry.getValue();
        if (receipt.containsKey(service)){
            Integer newPrice = receipt.get(service) + price;
            receipt.replace(service, newPrice);
            System.out.println("This is if contains key " + receipt);
        } else {
            receipt.put(service, price);
            System.out.println("This is if first entry" + receipt);
        }
    }

    public String getReceipt() {
        String thisReceipt = "";
        if (receipt.isEmpty()){
            thisReceipt = "Your receipt is empty";
            return thisReceipt;
        } else
        for (Map.Entry<String, Integer> entry : receipt.entrySet()){
            thisReceipt = thisReceipt + '\n' + entry.getKey() + " " + entry.getValue() + " UAH";
            }
        return thisReceipt;
    }
    //This method have to sum all prices in 1 class( for 1 car)
    //
    // I need to think how to make all sum not in main.
    // Maybe I should make class TotalReceipt or smth like that
    //
    public int totalPrice(){
        int sum = receipt.values().stream()
                .mapToInt(i -> i)
                .sum();
        return sum;
    }
}
