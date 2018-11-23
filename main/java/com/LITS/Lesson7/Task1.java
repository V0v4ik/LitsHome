package com.LITS.Lesson7;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        ProductOrder meat = new ProductOrder(100, 20, 1);
        ProductOrder beer = new ProductOrder(20, 10, 2);
        ProductOrder flashDrive = new ProductOrder(500, 3,3);

        Set<ProductOrder> products = new LinkedHashSet<>();
        products.add(meat);
        products.add(beer);
        products.add(flashDrive);

        for (ProductOrder product : products){
            if (product == meat) {
                System.out.println(meat + " " + ProductType.FOOD + " " + ProductType.FOOD.getS());
            }
            else if (product == beer) {
                System.out.println(beer + " " + ProductType.DRINK + " " + ProductType.DRINK.getS());
            }
            else if (product == flashDrive) {
                System.out.println(flashDrive + " " + ProductType.ELECTRONICS + " " + ProductType.ELECTRONICS.getS());
            }
            else
                System.out.println("We don't have this product in out shop");
        }
    }
}
