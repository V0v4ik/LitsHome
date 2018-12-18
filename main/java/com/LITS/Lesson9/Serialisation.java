package com.LITS.Lesson9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/resources/serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person("Ivan", 35);
        person.setSurname("Aspirin");
        person.setId(88);
        oos.writeObject(person);
        oos.flush();
        oos.close();
        System.out.printf("Done");
    }
}
