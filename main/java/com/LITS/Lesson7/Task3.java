package com.LITS.Lesson7;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        Map<Character, Integer> charMap = new HashMap<>();
        s = s.toLowerCase();

        if (!s.isEmpty()) {
            for (Character c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    Integer counter = charMap.get(c);
                    int newCounter = (counter == null ? 1 : counter + 1);
                    charMap.put(c, newCounter);
                }
            }
        }
        System.out.println(charMap);
        Collection<Integer> mapValues = charMap.values();
        Integer max = Collections.max(mapValues);

        Set<Map.Entry<Character, Integer>> mapSet =  charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : mapSet){
            if (Objects.equals(max, entry.getValue())){
                System.out.println(entry);
            }
        }
    }
}
