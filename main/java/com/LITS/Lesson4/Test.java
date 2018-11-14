package com.LITS.Lesson4;

public class Test {
    public static void main(String[] args) {
        Somebody smbd = new Somebody();
        Somebody smbd1 = new Somebody();
        if (smbd.equals(smbd1))
            System.out.println("Objects are equal");
        System.out.println(smbd.hashCode());
        System.out.println(smbd1.hashCode());
    }
}