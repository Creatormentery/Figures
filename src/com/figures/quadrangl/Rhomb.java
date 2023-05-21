package com.figures.quadrangl;

import com.figures.Figures;

public class Rhomb extends Figures {
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

    public Rhomb(String name, String type, double a, double h) {
        super(name, type);
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return getA() * 4;
    }

    @Override
    public double getArea() {
        return getA() * getH();
    }

    @Override
    public void display() {
        System.out.println("Rhomb");
    }
}
