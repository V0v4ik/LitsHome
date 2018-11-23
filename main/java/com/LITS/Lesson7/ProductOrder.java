package com.LITS.Lesson7;

public class ProductOrder {
    private int price;
    private int size;
    private int id;

    public ProductOrder(int price, int size, int id) {
        this.price = price;
        this.size = size;
        this.id = id;
    }

    @Override
    public String toString() {
        return (id + " - " + price + " - " + size + " - ");
    }
}
