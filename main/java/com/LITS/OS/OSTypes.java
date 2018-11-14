package com.LITS.OS;

public class OSTypes {
    public static void main(String[] args) {

        OperatingSystem windows = new Windows();
        windows.printInfo(windows, 32);
        System.out.println();
        System.out.println("=======");
        System.out.println();
        Linux linux = new Linux();
        linux.printInfo(linux);
        System.out.println();
        System.out.println("=======");
        System.out.println();
        MacOS macOS = new MacOS();
        macOS.printInfo(macOS);
    }

}