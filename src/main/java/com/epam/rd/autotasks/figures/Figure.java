package com.epam.rd.autotasks.figures;

public abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public abstract Point leftmostPoint();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
}
