package com.figures.triangles;

import com.figures.Figures;

public class TriangleRight extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;
    private double c;

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

    public TriangleRight(String name, String type, double a, double b, double c) {
        super(name, type);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void display() {
        System.out.println("Triangle Right");
    }
}
