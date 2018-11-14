package com.LITS.Lesson4;

import java.util.Objects;

public class Somebody {
    int age = 18;
    String firstName = "Vlodek";
    String lastName = "Terlec";
    String fullName = firstName + " " + lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Somebody somebody = (Somebody) o;
        return Objects.equals(firstName, somebody.firstName) &&
                Objects.equals(lastName, somebody.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age * fullName.length());
    }
}