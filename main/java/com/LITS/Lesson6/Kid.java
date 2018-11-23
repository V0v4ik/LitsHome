package com.LITS.Lesson6;

import java.util.Objects;

public class Kid implements Comparable<Kid> {
    private String name;
    private int age;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kid kid = (Kid) o;
        return age == kid.age &&
                Objects.equals(name, kid.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Kid {" +
                "name: " + name +
                ", age: " + age +
                '}';
    }

    @Override
    public int compareTo(Kid o) {
        //return this.getName().compareTo(o.getName());
        return Integer.compare(this.getAge(), o.getAge());
    }
}