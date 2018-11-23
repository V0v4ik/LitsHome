package com.LITS.Lesson7;

public enum ProductType {
    DRINK("Alcohol"), ELECTRONICS("Power"), FOOD("Delicious");

    ProductType(String s) {
        this.s = s;
    }

    private String s;
    public String getS(){
        return s;
    }
}
