package com.figures.quadrangl;

import com.figures.Figures;

public class Trapezium extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;
    private double c;
    private double d;
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

    public double getD() {
        return d;
    }

    public double getH() {
        return h;
    }

    public Trapezium(String name, String type, double a, double b, double c, double d, double h) {
        super(name, type);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return getA() + getB() + getC() + getD();
    }

    @Override
    public double getArea() {
        return ((getA() + getB()) / 2) * getH();
    }

    @Override
    public void display() {
        System.out.println("Trapezium");
    }
}
