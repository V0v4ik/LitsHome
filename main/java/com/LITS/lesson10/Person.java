package com.LITS.lesson10;

import java.io.Serializable;

public class Person implements Serializable {
    static final long serialVersionUID = 88L;
    private int id = 100;
    public String name = "Vova";
    protected int age  = 88;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}