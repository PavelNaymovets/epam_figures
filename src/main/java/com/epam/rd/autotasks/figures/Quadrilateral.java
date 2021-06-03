package com.epam.rd.autotasks.figures;

public class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public double area(){
        return ((Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY()))) / 2) + ((Math.abs((a.getX() - c.getX()) * (d.getY() - a.getY()) - (a.getX() - d.getX()) * (c.getY() - a.getY()))) / 2);
    }

    public String pointsToString(){
        return "(" + a + ")" + "(" + b + ")" + "(" + c + ")" + "(" + d + ")";
    }

    public Point leftmostPoint(){
        return new Point(Math.min(Math.min(Math.min(a.getX(), b.getX()), c.getX()), d.getX()), 0);
    }
}
