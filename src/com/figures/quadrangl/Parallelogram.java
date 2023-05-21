package com.figures.quadrangl;

import com.figures.Figures;

public class Parallelogram extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;
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

    public double getH() {
        return h;
    }

    public Parallelogram(String name, String type, double a, double b, double h) {
        super(name, type);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return (getA() + getB()) * 2;
    }

    @Override
    public double getArea() {
        return getA() * getH();
    }

    @Override
    public void display() {
        System.out.println("Parallelogram");
    }
}
