package com.LITS.OS;

public class MacOS extends OperatingSystem implements Licence, Prestige, Weight {

    public int price() {
        return 200;
    }
    public boolean canBeHacked() {
        return false;
    }
    public boolean haveLicence() {
        return true;
    }
    public int weight() {
        return 35;
    }
    public String prestige() {
        String macOS = "Mac OS is very prestige and popular OS using only on Apple devices";
        return macOS;
    }
    public void simpleUsage() {
        System.out.println("Mac Os is easy OS for all types of users");
    }
    private int stability = 100;
    public int getStability() {
        return stability;
    }
    public void printInfo(OperatingSystem A){
        System.out.println(prestige());
        simpleUsage();
        if (haveLicence())
            System.out.println("MacOS have licence, it costs " + price() + "$");
        if (!canBeHacked())
            System.out.println("You can't hack this system");
        else
            System.out.println("Well done, you have hacked Mac OS. FBI will arrive in few minutes=)");
        System.out.println("Mac OS needs " + weight() + " GB to be installed");
        System.out.println("Stability of this OS is " + getStability() + "%");
    }
}