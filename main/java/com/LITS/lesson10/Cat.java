package com.LITS.lesson10;

import java.io.Serializable;

public class Cat implements Serializable {
    static final long serialVersionUID = 89;
    private int id = 10;
    private String nickName = "Semen";
    private int age = 10;

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }
}