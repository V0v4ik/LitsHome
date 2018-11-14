package com.LITS.OS;

public class Linux extends OperatingSystem implements Licence, Prestige, Weight {

    private int neededPlace = 25;
    public int getNeededPlace() {
        return neededPlace;
    }
    public void setNeededPlace(int neededPlace) {
        this.neededPlace = neededPlace;
    }

    public int price() { return 0; }
    public boolean haveLicence() {
        System.out.println("Linux is free operating system");
        return false;
    }
    public String prestige() {
        String linux = "Linux is the OS mostly used by programmers";
        return linux;
    }
    public int weight() {
        int gb = 10;
        return gb;
    }
    public boolean canBeHacked() {
        System.out.println("Nobody need this=)");
        return false;
    }
    public void simpleUsage() {
        System.out.println("Linux is quite difficult OS for users but comfortable and easy for programmers");
    }
    public boolean haveGUI() {
        System.out.println("Linux don't have GUI");
        return false;
    }
    public void programInstall(){
        System.out.println("You have to install programs from ZIP archives");
        System.out.println("Or from install command in CMD");
    }
    public void printInfo(OperatingSystem A){
        System.out.println(prestige());
        haveLicence();
        System.out.println("Weight of the Linux is " + weight() + " GB");
        System.out.println("But you need " + getNeededPlace() + " GB of free place");
        canBeHacked();
        simpleUsage();
        haveGUI();
        programInstall();
    }
}