package com.LITS.Lesson5;

import java.util.ArrayList;
import java.util.List;

public class IntList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++){
            list1.add(i);
        }
        for (Integer tmp:list1) {
            if (tmp%2 == 0)
                System.out.println(tmp);
        }
    }
}