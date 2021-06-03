package com.epam.rd.autotasks.figures;

import java.lang.Math.*;

public class Triangle extends Figure{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double area(){
        return (Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY()))) / 2;
    }

    public String pointsToString(){
        return "(" + a + ")" + "(" + b + ")" + "(" + c + ")";
    }

    public Point leftmostPoint(){
        return new Point(Math.min(Math.min(a.getX(), b.getX()), c.getX()), 0);
    }
}
