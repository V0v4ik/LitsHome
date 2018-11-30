package com.LITS.Lesson8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String hello = "Hello, my name is ";
        String bye = ". Nice to meet you";
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             FileOutputStream out = new FileOutputStream("/home/volodymyr/IdeaProjects/LITS3/src/main/resources/outputB.txt")) {
            System.out.println("Write your name, please, '\n' to quit");

            out.write(hello.getBytes());
            char c;
            do {
                c = (char) inputStreamReader.read();
                out.write(c);
            } while (c != '\n');
            out.write(bye.getBytes());
        }
    }
}
