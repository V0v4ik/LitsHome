package com.LITS.Lesson7;

import java.util.*;

import static java.util.Arrays.*;

public class Task2 {
    public static void main(String[] args) {
        Student andriy = new Student(23, "Andriy");
        Student taras = new Student(18,"Taras");
        Student vika = new Student(20, "Vika");

        Map<Student, List<Integer>> students = new HashMap<>();
        students.put(andriy, asList(12, 8, 10, 5, 7));
        students.put(taras, asList(8, 2, 10, 6, 11));
        students.put(vika, asList(6, 11, 8, 10, 11));
        System.out.println(students);
        System.out.println("===========");

        Map<String,Integer> andriyPoints = new HashMap<>();
        andriyPoints.put("Math " , 12);
        andriyPoints.put("History ", 8);
        andriyPoints.put("Physics ", 10);
        Map<Student, Map<String, Integer>> students2 = new HashMap<>();
        students2.put(andriy, andriyPoints);
        System.out.println(students2);
    }
}
