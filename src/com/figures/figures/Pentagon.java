package com.figures.figures;

import com.figures.Figures;

public class Pentagon extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
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

    public Pentagon(String name, String type, double a, double h) {
        super(name, type);
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return getA() * 5;
    }

    @Override
    public double getArea() {
        return 5 * ((getA() * getH()) / 2);
    }

    @Override
    public void display() {
        System.out.println("Pentagon");
    }
}
