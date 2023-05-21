package com.figures.quadrangl;

import com.figures.Figures;

public class Rectangle extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;

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

    public Rectangle(String name, String type, double a, double b) {
        super(name, type);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return (getA() + getB()) * 2;
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }

    @Override
    public void display() {
        System.out.println("Rectangle");
    }
}
