package com.LITS.Lesson7;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Arrays.asList;

public class Task22 {
    public static void main(String[] args) {
        Student andriy = new Student(23, "Andriy");
        Student taras = new Student(18,"Taras");
        Student vika = new Student(20, "Vika");
        
        Map<Student, List<Integer>> sortedStudents = new TreeMap<>();
        sortedStudents.put(andriy, asList(12, 8, 10, 5, 7));
        sortedStudents.put(taras, asList(8, 2, 10, 6, 11));
        sortedStudents.put(vika, asList(6, 11, 8, 10, 11));
        System.out.println(sortedStudents);
    }
}
