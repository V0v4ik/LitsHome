package com.LITS.lesson10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetSerial {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/main/resources/temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        Person vova = (Person) oin.readObject();
        Cat semen = (Cat) oin.readObject();
        System.out.println("Vova = " + vova.getName() + " " + vova.getAge());
        System.out.println("Cat = " + semen.getNickName() + " " + semen.getAge());
    }
}
