package com.LITS.Lesson5;

public abstract class OS {
    private String name;

    public OS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}