package com.LITS.Lesson6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        //making a new set
        Set<Kid> kids = new TreeSet<>();
        kids.add(new Kid ("Oleh", 10));
        kids.add(new Kid ("Petro", 8));
        kids.add(new Kid ("Dima", 12));
        kids.add(new Kid ("Tanya", 6));
        kids.add(new Kid ("Yulya", 10));
        kids.add(new Kid ("Taras", 15));
        kids.add(new Kid ("Oleh", 6));
        System.out.println(kids.toString());
        //Sorting set by field "age"
//                kids.stream()
//                .sorted(Comparator.comparing(Kid::getAge))
//                .forEach(e -> System.out.println("Name: "+e.getName()+", Age:"+e.getAge()));
//        System.out.println();

    }
}
