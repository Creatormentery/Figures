package com.figures.triangles;

import com.figures.Figures;

public class TriangleIsosceles extends Figures {
    private String name;
    private String type;
    private double a;
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

    public double getH() {
        return h;
    }

    public TriangleIsosceles(String name, String type, double a, double h) {
        super(name, type);
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return 3 * getA();
    }

    @Override
    public double getArea() {
        return (getA() * getH()) / 2;
    }

    @Override
    public void display() {
        System.out.println("Triangle isosceles");
    }
}
