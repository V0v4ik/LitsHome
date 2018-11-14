package com.LITS.Lesson4;

public class Sleepy {
    public static void main(String[] args) {
        Person person = new Person();
        person.sleep();
        person.sleep(45);
        person.sleep(4,"hours");
    }
}