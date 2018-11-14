package com.LITS.Lesson5;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Name1");
        list1.add("Name2");
        list1.add("Name3");
        list1.add("Name4");
        list1.add("Name5");
        List<String> list2 = new ArrayList<String>();
        list2.add("Oleh");
        list2.add("Name6");
        list2.add("Name7");
        list2.add("Name8");
        list2.add("Oleh");
        list2.add("Name9");
        System.out.println(list1);
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.indexOf("Oleh"));
        System.out.println(list1.lastIndexOf("Oleh"));
    }
}