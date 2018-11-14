package com.LITS.Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        // add names to lists
        List<String> tmp1 = Arrays.asList("Pavlo", "Oleh", "Semen", "Dima", "Tolik", "Marta", "Ira", "Olya", "Taras", "Petro");
        List<String> tmp2 = Arrays.asList("Oleh", "Ira", "Petro", "Nastya", "Vika", "Oksana", "Vlad", "Ihor", "Andriy", "Lina");
        //make sets from lists
        Set<String> names1 = new HashSet<>(tmp1);
        Set<String> names2 = new HashSet<>(tmp2);
        //searching the same names in both sets
        names1.retainAll(names2);
        System.out.println(names1);
    }

}