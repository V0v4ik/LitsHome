package com.LITS.Lesson5;

public class Computer<T> {
    private String name;
    private int hardDriveSpace;
    private T os;

    public Computer(String name, int hardDriveSpace, T os) {
        this.name = name;
        this.hardDriveSpace = hardDriveSpace;
        this.os = os;
    }

    public String getName() {
        return this.name;
    }

    public int getHardDriveSpace() {
        return this.hardDriveSpace;
    }

    public T getOs() {
        return this.os;
    }
}
