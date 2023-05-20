package com.figures.quadrangl;

import com.figures.Figures;

public class Convex extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;
    private double c;
    private double d;

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

    public Convex(String name, String type, double a, double b, double c, double d) {
        super(name, type);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        return getA() + getB() + getC() + getD();
    }

    @Override
    public double getArea() {
        double p = (getA() + getB() + getC() + getD()) / 2;
        return Math.sqrt((p - getA()) * (p - getB()) * (p - getC()) * (p - getD()));
    }

    @Override
    public void display() {
        System.out.println("Convex");
    }
}
