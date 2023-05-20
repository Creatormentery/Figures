package com.figures.triangles;

import com.figures.Figures;

public class TriangleEquilateral extends Figures {
    private String name;
    private String type;
    private double a;
    private double r;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getA() {
        return a;
    }

    public double getR() {
        return r;
    }

    public TriangleEquilateral(String name, String type, double a, double r) {
        super(name, type);
        this.a = a;
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return 3 * getA();
    }

    @Override
    public double getArea() {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public void display() {
        System.out.println("Triangle Equilateral");
    }
}
