package com.LITS.OS;

public class Windows extends OperatingSystem implements Licence, Prestige, Weight {

    public static int neededPlace = 100;
    public int price() {
        return 100;
    }
    public boolean haveLicence() {
        System.out.println("Windows have paid licence");
        return true;
    }
    public String prestige() {
        String windows = "Windows is the most popular operating system";
        return windows;
    }
    public int weight() {
        int gb = 45;
        return gb;
    }
    public boolean canBeHacked() {
        return true;
    }
    public void simpleUsage() {
        System.out.println("Windows is easy to use operating system for all users");
    }
    public void reinstall(){
        System.out.println("Windows is easy to reinstall");
    }
    public static void minSysUsage (int i) {
        switch (i) {
            case 32:
                System.out.println("You need " + (neededPlace*3/4) + " GB of memory");
                System.out.println("You can have 4 GB RAM");
                System.out.println("Yours CPU is old");
                break;
            case 64:
                System.out.println("You need " + neededPlace + " GB of memory");
                System.out.println("You can have 32 GB RAM");
                System.out.println("You have a powerful CPU");
                break;
        }
    }
    public void printInfo(OperatingSystem A) {
        System.out.println(prestige());
        haveLicence();
        System.out.println("The price of Windows is " + price() + "$");
        System.out.println("Windows weight is " + weight() + " GB");
        if (canBeHacked())
            System.out.println("This OS can be hacked");
        simpleUsage();
        reinstall();
        minSysUsage(low);
        minSysUsage(high);
    }
    public void printInfo(OperatingSystem A, int i) {
        System.out.println(prestige());
        haveLicence();
        System.out.println("The price of Windows is " + price() + "$");
        System.out.println("Windows weight is " + weight() + " GB");
        if (canBeHacked())
            System.out.println("This OS can be hacked");
        simpleUsage();
        reinstall();
        minSysUsage(i);
    }
}