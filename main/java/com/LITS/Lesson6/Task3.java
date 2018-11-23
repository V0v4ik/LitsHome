package com.LITS.Lesson6;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Kid> kids = new HashSet<>();
        kids.add(new Kid ("Oleh", 10));
        kids.add(new Kid ("Petro", 8));
        kids.add(new Kid ("Dima", 12));
        kids.add(new Kid ("Tanya", 6));
        kids.add(new Kid ("Yulya", 10));
        kids.add(new Kid ("Taras", 15));
        kids.add(new Kid ("Semen", 9));
        kids.add(new Kid ("Olya", 10));
        kids.add(new Kid ("Taras", 12));
        kids.add(new Kid ("Stepan", 11));

        //System.out.println(kids);
//        Set<Kid> youngerKids = new HashSet<>();
//        for (Kid kid : kids) {
//            if (kid.getAge() < 10)
//                youngerKids.add(kid);
//        }
//        kids.removeAll(youngerKids);
//        System.out.println(kids);

      kids.stream()
            .filter(kid -> kid.getAge() > 10)
            .forEach(kid -> System.out.println(kid));
    }
}