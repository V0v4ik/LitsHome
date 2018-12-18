package com.LITS.MyOwnCarWash.domain.enums;

public enum AdditionalServices {
    Tea (25),
    Coffee (20),
    Juice(15),
    HotDog(45),
    Cigarets(0);

    private int price;

    AdditionalServices(int price) {
        this.price = price;
    }

    public int getAddPrice() {
        return price;
    }
}
