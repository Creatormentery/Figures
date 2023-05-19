package com.figures.triangles;

import com.figures.Figures;

public class TriangleIsosceles extends Figures {
    private String name;
    private String type;
    private int a;
    private int h;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    public TriangleIsosceles(String name, String type, int a, int h) {
        super(name, type);
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return 3 * a;
    }

    @Override
    public double getArea() {
        return (a * h) / 2;
    }

    @Override
    public void display() {
        System.out.println("Triangle isosceles");
    }
}
