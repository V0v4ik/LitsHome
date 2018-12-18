package com.LITS.Lesson9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/main/resources/serial.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        Person person = (Person) oin.readObject();
        System.out.println("version = " + person.getName());
        System.out.printf("surname is " + person.getSurname());
    }
}
