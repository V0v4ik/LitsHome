package com.LITS.Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        // add names to list
        List<String> tmp = Arrays.asList("Pavlo", "Oleh", "Semen", "Dima", "Oleh", "Marta", "Ira", "Olya", "Taras", "Petro", "Semen", "Nastya", "Vika",
                "Oksana", "Vlad", "Ihor", "Andriy", "Nastya", "Ira", "Vika");
        //make set from list
        Set<String> names = new HashSet<>(tmp);
        Set<String> delete = new HashSet<>();
        //print size of set
        System.out.println("Size of names = " + names.size());
        //searching names for remove
        for (String name:names){
            String first = Character.toString(name.charAt(0));
            if (first.equals("A") || first.equals("B") || first.equals("S") || first.equals("V") || first.equals("P"))
                delete.add(name);
        }
        //removing names we found
        names.removeAll(delete);
        System.out.println(names);
    }

}
