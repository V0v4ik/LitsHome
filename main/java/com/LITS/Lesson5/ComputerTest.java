package com.LITS.Lesson5;

public class ComputerTest {
    public static void main(String[] args) {
        Windows windows = new Windows("Windows");
        Linux linux = new Linux("Ubuntu");
        MacOS macOS = new MacOS("MacOS");

        Computer<Windows> windowsComputer = new Computer<>("windowsComputer", 32, windows);
        Computer<Linux> linuxComputer = new Computer<>("linuxComputer", 33, linux);
        Computer<MacOS> macOSComputer = new Computer<>("macOSComputer", 32, macOS);

        System.out.println(windowsComputer.getOs().getName());
        System.out.println(linuxComputer.getOs().getName());
        System.out.println(macOSComputer.getOs().getName());
    }
}