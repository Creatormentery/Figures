package com.figures.triangles;
import com.figures.Figures;

class Triangle extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;
    private double c;
    private double r;
    private double h;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public Triangle(String name, String type, double a, double b, double c, double r, double h) {
        super(name, type);
        this.a = a;
        this.b = b;
        this.c = c;
        this.r = r;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (getA() * getH()) / 2;
    }

    @Override
    public double getPerimetr() {
        return (getA() * getB() * getC()) / 4 * getR();
    }

    @Override
    public void display() {
        System.out.println("Basic triangle");
    }
}
