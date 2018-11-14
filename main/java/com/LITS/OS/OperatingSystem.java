package com.LITS.OS;

public abstract class OperatingSystem {
    public static int low = BitRate.Low.getRate();
    public static int high = BitRate.High.getRate();
    public abstract int price();
    public abstract boolean canBeHacked();
    public abstract void printInfo(OperatingSystem A);
    public void printInfo(OperatingSystem A, int i){
        System.out.println("Why not?");
    }

}