package com.epam.rd.autotasks.figures;

import java.lang.Math.*;

public class Circle extends Figure {
    private Point centre;
    private double radius;

    public Circle (Point centre, double radius){
        this.centre = centre;
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public String pointsToString(){
        return "(" + centre + ")";
    }

    public Point leftmostPoint(){
        return new Point(centre.getX() - radius, centre.getY());
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "[" + pointsToString() + String.valueOf(radius) + "]";
    }
}
