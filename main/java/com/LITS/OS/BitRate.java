package com.LITS.OS;

public enum BitRate {
    Low(32), High(64);

    private int rate;
    BitRate(int a){
        rate = a;
    }
    public int getRate() {
        return rate;
    }


}